package com.lswd.youpin.model.lsyp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Members {

    private Float chae = 0F;//差额

    private String carduid;

    public String getCarduid() {
        return carduid;
    }

    public void setCarduid(String carduid) {
        this.carduid = carduid;
    }

    private String canteenName;

    public String getCanteenName() {
        return canteenName;
    }

    public void setCanteenName(String canteenName) {
        this.canteenName = canteenName;
    }

    public Float getChae() {
        return chae;
    }

    public void setChae(Float chae) {
        this.chae = chae;
    }

    private MemberCard memberCard;//会员卡对象

    private List<MealRecord> mealRecords = new ArrayList<>();//会员的就餐记录对象

    private String sexName;//性别名称

    private Integer sexType;//性别 0 ， 1    (测试用，没有任何意义)

    private String typeName;//类型名称

    private Float balance;//会员卡余额

    private String statusName;//会员状态

    private String cardUid;//会员卡 芯片号

    public Integer getSexType() {
        return sexType;
    }

    public void setSexType(Integer sexType) {
        this.sexType = sexType;
    }

    public String getCardUid() {
        return cardUid;
    }

    public void setCardUid(String cardUid) {
        this.cardUid = cardUid;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public MemberCard getMemberCard() {
        return memberCard;
    }

    public void setMemberCard(MemberCard memberCard) {
        this.memberCard = memberCard;
    }

    public List<MealRecord> getMealRecords() {
        return mealRecords;
    }

    public void setMealRecords(List<MealRecord> mealRecords) {
        this.mealRecords = mealRecords;
    }

    private String identityCard;

    private Integer state;//0:正常卡、1：挂失卡、2：注销卡、3：未办卡人员

    private String leaveName;

    public String getLeaveName() {
        return leaveName;
    }

    public void setLeaveName(String leaveName) {
        this.leaveName = leaveName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.member_id
     *
     * @mbg.generated
     */
    private String memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.member_name
     *
     * @mbg.generated
     */
    private String memberName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.telephone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.cardid
     *
     * @mbg.generated
     */
    private Integer cardid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.sex
     *
     * @mbg.generated
     */
    private Boolean sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.canteen_id
     *
     * @mbg.generated
     */
    private String canteenId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.is_delete
     *
     * @mbg.generated
     */
    private Boolean isDelete;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.is_use
     *
     * @mbg.generated
     */
    private Boolean isUse;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.member_type_id
     *
     * @mbg.generated
     */
    private Integer memberTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.create_user
     *
     * @mbg.generated
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.update_user
     *
     * @mbg.generated
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.safetyone
     *
     * @mbg.generated
     */
    private String safetyone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.safetytwo
     *
     * @mbg.generated
     */
    private String safetytwo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dh_members.safetythree
     *
     * @mbg.generated
     */
    private String safetythree;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.id
     *
     * @return the value of dh_members.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.id
     *
     * @param id the value for dh_members.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.member_id
     *
     * @return the value of dh_members.member_id
     *
     * @mbg.generated
     */
    public String getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.member_id
     *
     * @param memberId the value for dh_members.member_id
     *
     * @mbg.generated
     */
    public void setMemberId(String memberId) {
        this.memberId = memberId == null ? null : memberId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.member_name
     *
     * @return the value of dh_members.member_name
     *
     * @mbg.generated
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.member_name
     *
     * @param memberName the value for dh_members.member_name
     *
     * @mbg.generated
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.telephone
     *
     * @return the value of dh_members.telephone
     *
     * @mbg.generated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.telephone
     *
     * @param telephone the value for dh_members.telephone
     *
     * @mbg.generated
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.cardid
     *
     * @return the value of dh_members.cardid
     *
     * @mbg.generated
     */
    public Integer getCardid() {
        return cardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.cardid
     *
     * @param cardid the value for dh_members.cardid
     *
     * @mbg.generated
     */
    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.sex
     *
     * @return the value of dh_members.sex
     *
     * @mbg.generated
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.sex
     *
     * @param sex the value for dh_members.sex
     *
     * @mbg.generated
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.canteen_id
     *
     * @return the value of dh_members.canteen_id
     *
     * @mbg.generated
     */
    public String getCanteenId() {
        return canteenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.canteen_id
     *
     * @param canteenId the value for dh_members.canteen_id
     *
     * @mbg.generated
     */
    public void setCanteenId(String canteenId) {
        this.canteenId = canteenId == null ? null : canteenId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.is_delete
     *
     * @return the value of dh_members.is_delete
     *
     * @mbg.generated
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.is_delete
     *
     * @param isDelete the value for dh_members.is_delete
     *
     * @mbg.generated
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.is_use
     *
     * @return the value of dh_members.is_use
     *
     * @mbg.generated
     */
    public Boolean getIsUse() {
        return isUse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.is_use
     *
     * @param isUse the value for dh_members.is_use
     *
     * @mbg.generated
     */
    public void setIsUse(Boolean isUse) {
        this.isUse = isUse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.member_type_id
     *
     * @return the value of dh_members.member_type_id
     *
     * @mbg.generated
     */
    public Integer getMemberTypeId() {
        return memberTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.member_type_id
     *
     * @param memberTypeId the value for dh_members.member_type_id
     *
     * @mbg.generated
     */
    public void setMemberTypeId(Integer memberTypeId) {
        this.memberTypeId = memberTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.remark
     *
     * @return the value of dh_members.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.remark
     *
     * @param remark the value for dh_members.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.create_user
     *
     * @return the value of dh_members.create_user
     *
     * @mbg.generated
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.create_user
     *
     * @param createUser the value for dh_members.create_user
     *
     * @mbg.generated
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.create_time
     *
     * @return the value of dh_members.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.create_time
     *
     * @param createTime the value for dh_members.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.update_user
     *
     * @return the value of dh_members.update_user
     *
     * @mbg.generated
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.update_user
     *
     * @param updateUser the value for dh_members.update_user
     *
     * @mbg.generated
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.update_time
     *
     * @return the value of dh_members.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.update_time
     *
     * @param updateTime the value for dh_members.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.safetyone
     *
     * @return the value of dh_members.safetyone
     *
     * @mbg.generated
     */
    public String getSafetyone() {
        return safetyone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.safetyone
     *
     * @param safetyone the value for dh_members.safetyone
     *
     * @mbg.generated
     */
    public void setSafetyone(String safetyone) {
        this.safetyone = safetyone == null ? null : safetyone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.safetytwo
     *
     * @return the value of dh_members.safetytwo
     *
     * @mbg.generated
     */
    public String getSafetytwo() {
        return safetytwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.safetytwo
     *
     * @param safetytwo the value for dh_members.safetytwo
     *
     * @mbg.generated
     */
    public void setSafetytwo(String safetytwo) {
        this.safetytwo = safetytwo == null ? null : safetytwo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dh_members.safetythree
     *
     * @return the value of dh_members.safetythree
     *
     * @mbg.generated
     */
    public String getSafetythree() {
        return safetythree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dh_members.safetythree
     *
     * @param safetythree the value for dh_members.safetythree
     *
     * @mbg.generated
     */
    public void setSafetythree(String safetythree) {
        this.safetythree = safetythree == null ? null : safetythree.trim();
    }
}