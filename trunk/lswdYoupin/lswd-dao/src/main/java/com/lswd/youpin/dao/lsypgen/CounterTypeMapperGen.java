package com.lswd.youpin.dao.lsypgen;

import com.lswd.youpin.model.lsyp.CounterType;

public interface CounterTypeMapperGen {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_counter_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_counter_type
     *
     * @mbg.generated
     */
    int insert(CounterType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_counter_type
     *
     * @mbg.generated
     */
    int insertSelective(CounterType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_counter_type
     *
     * @mbg.generated
     */
    CounterType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_counter_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CounterType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_counter_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CounterType record);
}