/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.module.user.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.user.domain.BillingAccount;
import com.esofthead.mycollab.module.user.domain.BillingAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface BillingAccountMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    int countByExample(BillingAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    int deleteByExample(BillingAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    int insert(BillingAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    int insertSelective(BillingAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    List<BillingAccount> selectByExample(BillingAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    BillingAccount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    int updateByExampleSelective(@Param("record") BillingAccount record, @Param("example") BillingAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    int updateByExample(@Param("record") BillingAccount record, @Param("example") BillingAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    int updateByPrimaryKeySelective(BillingAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    int updateByPrimaryKey(BillingAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    Integer insertAndReturnKey(BillingAccount value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_account
     *
     * @mbggenerated Sun Jul 20 11:11:55 ICT 2014
     */
    void massUpdateWithSession(@Param("record") BillingAccount record, @Param("primaryKeys") List primaryKeys);
}