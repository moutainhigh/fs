package com.lswd.youpin.model.lsyp;

public class GoodOrderItems {

    private Good good;
    public Good getGood() {
        return good;
    }
    public void setGood(Good good) {
        this.good = good;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_order_items.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_order_items.good_id
     *
     * @mbg.generated
     */
    private String goodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_order_items.quantity
     *
     * @mbg.generated
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_order_items.order_id
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_order_items.order_amount
     *
     * @mbg.generated
     */
    private Float orderAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_order_items.pay_type
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_order_items.safetyone
     *
     * @mbg.generated
     */
    private String safetyone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_good_order_items.safetytwo
     *
     * @mbg.generated
     */
    private String safetytwo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_order_items.id
     *
     * @return the value of t_good_order_items.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_order_items.id
     *
     * @param id the value for t_good_order_items.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_order_items.good_id
     *
     * @return the value of t_good_order_items.good_id
     *
     * @mbg.generated
     */
    public String getGoodId() {
        return goodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_order_items.good_id
     *
     * @param goodId the value for t_good_order_items.good_id
     *
     * @mbg.generated
     */
    public void setGoodId(String goodId) {
        this.goodId = goodId == null ? null : goodId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_order_items.quantity
     *
     * @return the value of t_good_order_items.quantity
     *
     * @mbg.generated
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_order_items.quantity
     *
     * @param quantity the value for t_good_order_items.quantity
     *
     * @mbg.generated
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_order_items.order_id
     *
     * @return the value of t_good_order_items.order_id
     *
     * @mbg.generated
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_order_items.order_id
     *
     * @param orderId the value for t_good_order_items.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_order_items.order_amount
     *
     * @return the value of t_good_order_items.order_amount
     *
     * @mbg.generated
     */
    public Float getOrderAmount() {
        return orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_order_items.order_amount
     *
     * @param orderAmount the value for t_good_order_items.order_amount
     *
     * @mbg.generated
     */
    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_order_items.pay_type
     *
     * @return the value of t_good_order_items.pay_type
     *
     * @mbg.generated
     */

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_order_items.safetyone
     *
     * @return the value of t_good_order_items.safetyone
     *
     * @mbg.generated
     */
    public String getSafetyone() {
        return safetyone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_order_items.safetyone
     *
     * @param safetyone the value for t_good_order_items.safetyone
     *
     * @mbg.generated
     */
    public void setSafetyone(String safetyone) {
        this.safetyone = safetyone == null ? null : safetyone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_good_order_items.safetytwo
     *
     * @return the value of t_good_order_items.safetytwo
     *
     * @mbg.generated
     */
    public String getSafetytwo() {
        return safetytwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_good_order_items.safetytwo
     *
     * @param safetytwo the value for t_good_order_items.safetytwo
     *
     * @mbg.generated
     */
    public void setSafetytwo(String safetytwo) {
        this.safetytwo = safetytwo == null ? null : safetytwo.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String planId;

    public String getPlanId() {return planId;}

    public void setPlanId(String planId) {this.planId = planId==null?null:planId.trim();}
}