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
/*Domain class of table s_table_customize_view*/
package com.esofthead.mycollab.common.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import java.util.Date;

@SuppressWarnings("ucd")
@com.esofthead.mycollab.core.db.metadata.Table("s_table_customize_view")
public class CustomViewStore extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_table_customize_view.id
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_table_customize_view.createdUser
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("createdUser")
    private String createduser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_table_customize_view.createdTime
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("createdTime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_table_customize_view.viewId
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("viewId")
    private String viewid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_table_customize_view.sAccountId
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column s_table_customize_view.viewInfo
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=65535, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("viewInfo")
    private String viewinfo;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_table_customize_view.id
     *
     * @return the value of s_table_customize_view.id
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_table_customize_view.id
     *
     * @param id the value for s_table_customize_view.id
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_table_customize_view.createdUser
     *
     * @return the value of s_table_customize_view.createdUser
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_table_customize_view.createdUser
     *
     * @param createduser the value for s_table_customize_view.createdUser
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_table_customize_view.createdTime
     *
     * @return the value of s_table_customize_view.createdTime
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_table_customize_view.createdTime
     *
     * @param createdtime the value for s_table_customize_view.createdTime
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_table_customize_view.viewId
     *
     * @return the value of s_table_customize_view.viewId
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    public String getViewid() {
        return viewid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_table_customize_view.viewId
     *
     * @param viewid the value for s_table_customize_view.viewId
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    public void setViewid(String viewid) {
        this.viewid = viewid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_table_customize_view.sAccountId
     *
     * @return the value of s_table_customize_view.sAccountId
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_table_customize_view.sAccountId
     *
     * @param saccountid the value for s_table_customize_view.sAccountId
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column s_table_customize_view.viewInfo
     *
     * @return the value of s_table_customize_view.viewInfo
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    public String getViewinfo() {
        return viewinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column s_table_customize_view.viewInfo
     *
     * @param viewinfo the value for s_table_customize_view.viewInfo
     *
     * @mbggenerated Sun Jul 20 11:11:56 ICT 2014
     */
    public void setViewinfo(String viewinfo) {
        this.viewinfo = viewinfo;
    }
}