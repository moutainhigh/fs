package com.lswd.youpin.model.lsyp;

import com.lswd.youpin.model.vo.NutritionVo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MealRecord {

    private String jstName;

    public String getJstName() {
        return jstName;
    }

    public void setJstName(String jstName) {
        this.jstName = jstName;
    }

    private String payDate;

    public String getPayDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(paymentTime);
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    private NutritionVo nutritionVo = new NutritionVo();//设置每个订单的营养成分

    private List<MealMenu> mealMenus = new ArrayList<>();

    private Members members;

    private String paymentTimeStr;

    public String getPaymentTimeStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        paymentTimeStr = format.format(paymentTime);
        return paymentTimeStr;
    }

    public void setPaymentTimeStr(String paymentTimeStr) {
        this.paymentTimeStr = paymentTimeStr;
    }

    public Members getMembers() {
        return members;
    }

    public void setMembers(Members members) {
        this.members = members;
    }

    public List<MealMenu> getMealMenus() {
        return mealMenus;
    }

    public void setMealMenus(List<MealMenu> mealMenus) {
        this.mealMenus = mealMenus;
    }

    public NutritionVo getNutritionVo() {

        return nutritionVo;
    }

    public void setNutritionVo(NutritionVo nutritionVo) {
        this.nutritionVo = nutritionVo;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_mealrecord.meal_record_id
     *
     * @mbg.generated
     */
    private Integer mealRecordId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_mealrecord.card_id
     *
     * @mbg.generated
     */
    private Integer cardId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_mealrecord.canteen_id
     *
     * @mbg.generated
     */
    private String canteenId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_mealrecord.member_id
     *
     * @mbg.generated
     */
    private Integer memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_mealrecord.member_name
     *
     * @mbg.generated
     */
    private String memberName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_mealrecord.hostname
     *
     * @mbg.generated
     */
    private String hostname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_mealrecord.payment_amount
     *
     * @mbg.generated
     */
    private Float paymentAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_mealrecord.balance
     *
     * @mbg.generated
     */
    private Float balance;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_mealrecord.payment_time
     *
     * @mbg.generated
     */
    private Date paymentTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_mealrecord.consume_type
     *
     * @mbg.generated
     */
    private Integer consumeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_mealrecord.card_type
     *
     * @mbg.generated
     */
    private Integer cardType;

    private List<String> recipeNames;

    private String eatMenus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_mealrecord.meal_record_id
     *
     * @return the value of dh_mealrecord.meal_record_id
     *
     * @mbg.generated
     */
    public Integer getMealRecordId() {
        return mealRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_mealrecord.meal_record_id
     *
     * @param mealRecordId the value for dh_mealrecord.meal_record_id
     *
     * @mbg.generated
     */
    public void setMealRecordId(Integer mealRecordId) {
        this.mealRecordId = mealRecordId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_mealrecord.card_id
     *
     * @return the value of dh_mealrecord.card_id
     *
     * @mbg.generated
     */
    public Integer getCardId() {
        return cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_mealrecord.card_id
     *
     * @param cardId the value for dh_mealrecord.card_id
     *
     * @mbg.generated
     */
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_mealrecord.canteen_id
     *
     * @return the value of dh_mealrecord.canteen_id
     *
     * @mbg.generated
     */
    public String getCanteenId() {
        return canteenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_mealrecord.canteen_id
     *
     * @param canteenId the value for dh_mealrecord.canteen_id
     *
     * @mbg.generated
     */
    public void setCanteenId(String canteenId) {
        this.canteenId = canteenId == null ? null : canteenId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_mealrecord.member_name
     *
     * @return the value of dh_mealrecord.member_name
     *
     * @mbg.generated
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_mealrecord.member_name
     *
     * @param memberName the value for dh_mealrecord.member_name
     *
     * @mbg.generated
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_mealrecord.hostname
     *
     * @return the value of dh_mealrecord.hostname
     *
     * @mbg.generated
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_mealrecord.hostname
     *
     * @param hostname the value for dh_mealrecord.hostname
     *
     * @mbg.generated
     */
    public void setHostname(String hostname) {
        this.hostname = hostname == null ? null : hostname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_mealrecord.payment_amount
     *
     * @return the value of dh_mealrecord.payment_amount
     *
     * @mbg.generated
     */
    public Float getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_mealrecord.payment_amount
     *
     * @param paymentAmount the value for dh_mealrecord.payment_amount
     *
     * @mbg.generated
     */
    public void setPaymentAmount(Float paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_mealrecord.balance
     *
     * @return the value of dh_mealrecord.balance
     *
     * @mbg.generated
     */
    public Float getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_mealrecord.balance
     *
     * @param balance the value for dh_mealrecord.balance
     *
     * @mbg.generated
     */
    public void setBalance(Float balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_mealrecord.payment_time
     *
     * @return the value of dh_mealrecord.payment_time
     *
     * @mbg.generated
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_mealrecord.payment_time
     *
     * @param paymentTime the value for dh_mealrecord.payment_time
     *
     * @mbg.generated
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_mealrecord.consume_type
     *
     * @return the value of dh_mealrecord.consume_type
     *
     * @mbg.generated
     */
    public Integer getConsumeType() {
        return consumeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_mealrecord.consume_type
     *
     * @param consumeType the value for dh_mealrecord.consume_type
     *
     * @mbg.generated
     */
    public void setConsumeType(Integer consumeType) {
        this.consumeType = consumeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_mealrecord.card_type
     *
     * @return the value of dh_mealrecord.card_type
     *
     * @mbg.generated
     */
    public Integer getCardType() {
        return cardType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_mealrecord.card_type
     *
     * @param cardType the value for dh_mealrecord.card_type
     *
     * @mbg.generated
     */
    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public List<String> getRecipeNames() {
        return recipeNames;
    }

    public void setRecipeNames(List<String> recipeNames) {
        this.recipeNames = recipeNames;
    }

    public String getEatMenus() {
        return eatMenus;
    }

    public void setEatMenus(String eatMenus) {
        this.eatMenus = eatMenus;
    }
}