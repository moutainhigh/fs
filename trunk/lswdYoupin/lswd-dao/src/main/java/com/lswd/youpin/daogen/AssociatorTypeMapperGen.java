package com.lswd.youpin.daogen;

import com.lswd.youpin.model.AssociatorType;

public interface AssociatorTypeMapperGen {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_associator_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_associator_type
     *
     * @mbg.generated
     */
    int insert(AssociatorType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_associator_type
     *
     * @mbg.generated
     */
    int insertSelective(AssociatorType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_associator_type
     *
     * @mbg.generated
     */
    AssociatorType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_associator_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(AssociatorType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_associator_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(AssociatorType record);
}