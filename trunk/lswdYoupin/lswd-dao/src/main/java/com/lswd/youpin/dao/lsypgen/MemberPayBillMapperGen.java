package com.lswd.youpin.dao.lsypgen;

import com.lswd.youpin.model.lsyp.MemberPayBill;

public interface MemberPayBillMapperGen {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_member_paybill
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_member_paybill
     *
     * @mbg.generated
     */
    int insert(MemberPayBill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_member_paybill
     *
     * @mbg.generated
     */
    int insertSelective(MemberPayBill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_member_paybill
     *
     * @mbg.generated
     */
    MemberPayBill selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_member_paybill
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(MemberPayBill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_member_paybill
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MemberPayBill record);
}