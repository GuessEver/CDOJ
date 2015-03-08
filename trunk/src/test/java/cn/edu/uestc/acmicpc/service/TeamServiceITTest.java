package cn.edu.uestc.acmicpc.service;

import cn.edu.uestc.acmicpc.db.criteria.TeamCriteria;
import cn.edu.uestc.acmicpc.db.dto.impl.TeamDto;
import cn.edu.uestc.acmicpc.db.dto.impl.user.UserDto;
import cn.edu.uestc.acmicpc.service.iface.TeamService;
import cn.edu.uestc.acmicpc.service.testing.TeamProvider;
import cn.edu.uestc.acmicpc.service.testing.TeamUserProvider;
import cn.edu.uestc.acmicpc.testing.PersistenceITTest;
import cn.edu.uestc.acmicpc.util.exception.AppException;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assertThat;

/**
 * Integration test cases for {@link cn.edu.uestc.acmicpc.service.iface.TeamService}
 */
public class TeamServiceITTest extends PersistenceITTest {

  @Autowired private TeamService teamService;
  @Autowired private TeamUserProvider teamUserProvider;
  @Autowired private TeamProvider teamProvider;

  @Override
  public void setUp() throws Exception {
    UserDto user2 = userProvider.createUser();

    // Current test user owes 6 teams
    for (int teamCount = 0; teamCount < 6; teamCount++) {
      teamProvider.createTeam(getTestUserId());
    }
    // Current test user attend in 6 teams
    for (int teamCount = 0; teamCount < 6; teamCount++) {
      TeamDto team = teamProvider.createTeam(user2.getUserId());
      teamUserProvider.createTeamUser(team.getTeamId(), getTestUserId());
    }
  }

  @Test
  public void testCountTeams_byLeaderId() throws AppException {
    TeamCriteria teamCriteria = new TeamCriteria();
    teamCriteria.leaderId = getTestUserId();
    assertThat(teamService.count(teamCriteria)).isEqualTo(6L);
  }

  @Test
  public void testCountTeam_byUserId() throws AppException {
    TeamCriteria teamCriteria = new TeamCriteria();
    teamCriteria.userId = getTestUserId();
    assertThat(teamService.count(teamCriteria)).isEqualTo(12L);
  }

}
