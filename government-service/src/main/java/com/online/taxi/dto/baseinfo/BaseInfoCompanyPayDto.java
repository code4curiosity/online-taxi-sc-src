package com.online.taxi.dto.baseinfo;

import java.util.Date;

/**
 * 网约车平台公司支付信息
 *
 * @date
 */
public class BaseInfoCompanyPayDto {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company_pay.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 银行或非银行支付机构名称
     */
    private String payName;

    /**
     * 非银行支付机构支付业务许可证编号
     */
    private String payId;

    /**
     * 支付业务类型
     */
    private String payType;

    /**
     * 业务覆盖范围
     */
    private String payScope;

    /**
     * 备付金存管银行
     */
    private String prepareBank;

    /**
     * 结算周期（天）
     */
    private Integer countDate;

    /**
     * 状态0有效，1失效
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_base_info_company_pay.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * 更新时间
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company_pay.id
     *
     * @param id the value for tbl_base_info_company_pay.id
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company_pay.pay_name
     *
     * @return the value of tbl_base_info_company_pay.pay_name
     * @mbggenerated
     */
    public String getPayName() {
        return payName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company_pay.pay_name
     *
     * @param payName the value for tbl_base_info_company_pay.pay_name
     * @mbggenerated
     */
    public void setPayName(String payName) {
        this.payName = payName == null ? null : payName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company_pay.pay_id
     *
     * @return the value of tbl_base_info_company_pay.pay_id
     * @mbggenerated
     */
    public String getPayId() {
        return payId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company_pay.pay_id
     *
     * @param payId the value for tbl_base_info_company_pay.pay_id
     * @mbggenerated
     */
    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company_pay.pay_type
     *
     * @return the value of tbl_base_info_company_pay.pay_type
     * @mbggenerated
     */
    public String getPayType() {
        return payType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company_pay.pay_type
     *
     * @param payType the value for tbl_base_info_company_pay.pay_type
     * @mbggenerated
     */
    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company_pay.pay_scope
     *
     * @return the value of tbl_base_info_company_pay.pay_scope
     * @mbggenerated
     */
    public String getPayScope() {
        return payScope;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company_pay.pay_scope
     *
     * @param payScope the value for tbl_base_info_company_pay.pay_scope
     * @mbggenerated
     */
    public void setPayScope(String payScope) {
        this.payScope = payScope == null ? null : payScope.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company_pay.prepare_bank
     *
     * @return the value of tbl_base_info_company_pay.prepare_bank
     * @mbggenerated
     */
    public String getPrepareBank() {
        return prepareBank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company_pay.prepare_bank
     *
     * @param prepareBank the value for tbl_base_info_company_pay.prepare_bank
     * @mbggenerated
     */
    public void setPrepareBank(String prepareBank) {
        this.prepareBank = prepareBank == null ? null : prepareBank.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company_pay.count_date
     *
     * @return the value of tbl_base_info_company_pay.count_date
     * @mbggenerated
     */
    public Integer getCountDate() {
        return countDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company_pay.count_date
     *
     * @param countDate the value for tbl_base_info_company_pay.count_date
     * @mbggenerated
     */
    public void setCountDate(Integer countDate) {
        this.countDate = countDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company_pay.state
     *
     * @return the value of tbl_base_info_company_pay.state
     * @mbggenerated
     */
    public Integer getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company_pay.state
     *
     * @param state the value for tbl_base_info_company_pay.state
     * @mbggenerated
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company_pay.create_time
     *
     * @return the value of tbl_base_info_company_pay.create_time
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company_pay.create_time
     *
     * @param createTime the value for tbl_base_info_company_pay.create_time
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_base_info_company_pay.update_time
     *
     * @return the value of tbl_base_info_company_pay.update_time
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_base_info_company_pay.update_time
     *
     * @param updateTime the value for tbl_base_info_company_pay.update_time
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}