package com.lswd.youpin.dao.lsypgen;

import com.lswd.youpin.model.lsyp.GoodSale;

public interface GoodSaleMapperGen {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_good_sale
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_good_sale
     *
     * @mbg.generated
     */
    int insert(GoodSale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_good_sale
     *
     * @mbg.generated
     */
    int insertSelective(GoodSale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_good_sale
     *
     * @mbg.generated
     */
    GoodSale selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_good_sale
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GoodSale record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_good_sale
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GoodSale record);
}