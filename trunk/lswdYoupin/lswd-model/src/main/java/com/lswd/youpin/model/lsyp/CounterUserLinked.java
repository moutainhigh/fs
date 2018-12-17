package com.lswd.youpin.model.lsyp;

import com.lswd.youpin.model.CounterUser;
import com.lswd.youpin.model.User;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Date;

public class CounterUserLinked {

    private String counterName;

    public String getCounterName() {
        return counterName;
    }

    public void setCounterName(String counterName) {
        this.counterName = counterName;
    }

    private CounterUser counterUser;

    public CounterUser getCounterUser() {
        return counterUser;
    }

    public void setCounterUser(CounterUser counterUser) {
        this.counterUser = counterUser;
    }

    private Boolean checked;

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_count_user_linked.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_count_user_linked.counter_id
     *
     * @mbg.generated
     */
    private String counterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_count_user_linked.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_count_user_linked.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_count_user_linked.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_count_user_linked.safetyone
     *
     * @mbg.generated
     */
    private String safetyone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_count_user_linked.safetytwo
     *
     * @mbg.generated
     */
    private String safetytwo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_count_user_linked.id
     *
     * @return the value of dh_count_user_linked.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_count_user_linked.id
     *
     * @param id the value for dh_count_user_linked.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_count_user_linked.counter_id
     *
     * @return the value of dh_count_user_linked.counter_id
     *
     * @mbg.generated
     */
    public String getCounterId() {
        return counterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_count_user_linked.counter_id
     *
     * @param counterId the value for dh_count_user_linked.counter_id
     *
     * @mbg.generated
     */
    public void setCounterId(String counterId) {
        this.counterId = counterId == null ? null : counterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_count_user_linked.user_id
     *
     * @return the value of dh_count_user_linked.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_count_user_linked.user_id
     *
     * @param userId the value for dh_count_user_linked.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_count_user_linked.create_time
     *
     * @return the value of dh_count_user_linked.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_count_user_linked.create_time
     *
     * @param createTime the value for dh_count_user_linked.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_count_user_linked.create_user
     *
     * @return the value of dh_count_user_linked.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_count_user_linked.create_user
     *
     * @param createUser the value for dh_count_user_linked.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_count_user_linked.safetyone
     *
     * @return the value of dh_count_user_linked.safetyone
     *
     * @mbg.generated
     */
    public String getSafetyone() {
        return safetyone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_count_user_linked.safetyone
     *
     * @param safetyone the value for dh_count_user_linked.safetyone
     *
     * @mbg.generated
     */
    public void setSafetyone(String safetyone) {
        this.safetyone = safetyone == null ? null : safetyone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_count_user_linked.safetytwo
     *
     * @return the value of dh_count_user_linked.safetytwo
     *
     * @mbg.generated
     */
    public String getSafetytwo() {
        return safetytwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_count_user_linked.safetytwo
     *
     * @param safetytwo the value for dh_count_user_linked.safetytwo
     *
     * @mbg.generated
     */
    public void setSafetytwo(String safetytwo) {
        this.safetytwo = safetytwo == null ? null : safetytwo.trim();
    }
}