package com.lswd.youpin.dao.lsypgen;

import com.lswd.youpin.model.lsyp.CanteenSupplier;

public interface CanteenSupplierMapperGen {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_canteen_supplier
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_canteen_supplier
     *
     * @mbg.generated
     */
    int insert(CanteenSupplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_canteen_supplier
     *
     * @mbg.generated
     */
    int insertSelective(CanteenSupplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_canteen_supplier
     *
     * @mbg.generated
     */
    CanteenSupplier selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_canteen_supplier
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CanteenSupplier record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_canteen_supplier
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CanteenSupplier record);
}