/*
 * cdoj, UESTC ACMICPC Online Judge
 *
 * Copyright (c) 2013 fish <@link lyhypacm@gmail.com>,
 * mzry1992 <@link muziriyun@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package cn.edu.uestc.acmicpc.oj.test.util;

import cn.edu.uestc.acmicpc.ioc.util.TrainingRankListParserAware;
import cn.edu.uestc.acmicpc.training.entity.TrainingContestRankList;
import cn.edu.uestc.acmicpc.util.TrainingRankListParser;
import cn.edu.uestc.acmicpc.util.exception.AppException;
import cn.edu.uestc.acmicpc.util.exception.FieldNotUniqueException;
import cn.edu.uestc.acmicpc.util.exception.ParserException;
import jxl.read.biff.BiffException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Description
 *
 * @author <a href="mailto:muziriyun@gmail.com">mzry1992</a>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext-test.xml"})
public class RankListParserTest implements TrainingRankListParserAware {

    @Test
    public void testXlsParser() throws IOException, BiffException {
        try {
            File file = new File("/Users/mzry1992/Downloads/ranklist2.xls");
            System.out.println(file.exists());
            List<String[]> result = trainingRankListParser.parseXls(file);
            for (String[] strings : result) {
                System.out.print("Size = " + strings.length + " --> |");
                for (String grid : strings)
                    System.out.print(grid + "|");
                System.out.println();
            }
            TrainingContestRankList trainingContestRankList = trainingRankListParser.parse(file, false);
        } catch (ParserException e) {
            System.out.println(e.getMessage());
        } catch (FieldNotUniqueException | AppException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    private TrainingRankListParser trainingRankListParser;
    @Override
    public void setTrainingRankListParserAware(TrainingRankListParser trainingRankListParser) {
        this.trainingRankListParser = trainingRankListParser;
    }
}
