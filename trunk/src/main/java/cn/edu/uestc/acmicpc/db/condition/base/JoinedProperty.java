/*
 *
 *  cdoj, UESTC ACMICPC Online Judge
 *  Copyright (c) 2013 fish <@link lyhypacm@gmail.com>,
 *  	mzry1992 <@link muziriyun@gmail.com>
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 */

package cn.edu.uestc.acmicpc.db.condition.base;

import org.hibernate.criterion.Criterion;

import static cn.edu.uestc.acmicpc.db.condition.base.BaseCondition.ConditionType;

/**
 * Entity for joined properties of database update.
 * 
 * @author <a href="mailto:lyhypacm@gmail.com">fish</a>
 */
public class JoinedProperty {

  private Criterion criterion;
  private Object keyValue;
  private ConditionType conditionType;

  public JoinedProperty(Criterion criterion, Object keyValue, ConditionType conditionType) {
    this.criterion = criterion;
    this.keyValue = keyValue;
    this.conditionType = conditionType;
  }

  public ConditionType getConditionType() {
    return conditionType;
  }

  public void setConditionType(ConditionType conditionType) {
    this.conditionType = conditionType;
  }

  public Criterion getCriterion() {
    return criterion;
  }

  public void setCriterion(Criterion criterion) {
    this.criterion = criterion;
  }

  public Object getKeyValue() {
    return keyValue;
  }

  public void setKeyValue(Object keyValue) {
    this.keyValue = keyValue;
  }
}