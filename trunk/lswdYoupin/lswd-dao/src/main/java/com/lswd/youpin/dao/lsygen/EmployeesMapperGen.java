package com.lswd.youpin.dao.lsygen;

import com.lswd.youpin.model.lsy.Employees;

public interface EmployeesMapperGen {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table y_employees
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table y_employees
     *
     * @mbg.generated
     */
    int insert(Employees record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table y_employees
     *
     * @mbg.generated
     */
    int insertSelective(Employees record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table y_employees
     *
     * @mbg.generated
     */
    Employees selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table y_employees
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Employees record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table y_employees
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Employees record);
}