package com.lswd.youpin.dao.lsypgen;

import com.lswd.youpin.model.lsyp.DiskType;

public interface DiskTypeMapperGen {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_disk_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_disk_type
     *
     * @mbg.generated
     */
    int insert(DiskType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_disk_type
     *
     * @mbg.generated
     */
    int insertSelective(DiskType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_disk_type
     *
     * @mbg.generated
     */
    DiskType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_disk_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DiskType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dh_disk_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DiskType record);
}