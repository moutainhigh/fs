package com.lswd.youpin.daogen;

import com.lswd.youpin.model.wxToken;

public interface wxTokenMapperGen {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_token
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_token
     *
     * @mbg.generated
     */
    int insert(wxToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_token
     *
     * @mbg.generated
     */
    int insertSelective(wxToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_token
     *
     * @mbg.generated
     */
    wxToken selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_token
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(wxToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wx_token
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(wxToken record);
}