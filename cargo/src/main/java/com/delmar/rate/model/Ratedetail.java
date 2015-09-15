package com.delmar.rate.model;

import java.math.BigDecimal;
import java.util.Date;

import com.delmar.core.model.CoreModel;

public class Ratedetail extends CoreModel{

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.r_rate_master_id
     *
     * @mbggenerated
     */
    private Integer rRateMasterId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.base_chargename_id
     *
     * @mbggenerated
     */
    private Integer baseChargenameId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.chargename
     *
     * @mbggenerated
     */
    private String chargename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.base_currency_id
     *
     * @mbggenerated
     */
    private Integer baseCurrencyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.price
     *
     * @mbggenerated
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.base_unit_id
     *
     * @mbggenerated
     */
    private Integer baseUnitId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.minValue
     *
     * @mbggenerated
     */
    private BigDecimal minvalue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.maxValue
     *
     * @mbggenerated
     */
    private BigDecimal maxvalue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.freighttype
     *
     * @mbggenerated
     */
    private Integer freighttype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.fcllcl
     *
     * @mbggenerated
     */
    private Integer fcllcl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.base_strategy_id
     *
     * @mbggenerated
     */
    private Integer baseStrategyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.effectbgndate
     *
     * @mbggenerated
     */
    private Date effectbgndate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.effectenddate
     *
     * @mbggenerated
     */
    private Date effectenddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.befixed
     *
     * @mbggenerated
     */
    private String befixed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_rate_detail.flag
     *
     * @mbggenerated
     */
    private Integer flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.id
     *
     * @return the value of r_rate_detail.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.id
     *
     * @param id the value for r_rate_detail.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.r_rate_master_id
     *
     * @return the value of r_rate_detail.r_rate_master_id
     *
     * @mbggenerated
     */
    public Integer getrRateMasterId() {
        return rRateMasterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.r_rate_master_id
     *
     * @param rRateMasterId the value for r_rate_detail.r_rate_master_id
     *
     * @mbggenerated
     */
    public void setrRateMasterId(Integer rRateMasterId) {
        this.rRateMasterId = rRateMasterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.base_chargename_id
     *
     * @return the value of r_rate_detail.base_chargename_id
     *
     * @mbggenerated
     */
    public Integer getBaseChargenameId() {
        return baseChargenameId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.base_chargename_id
     *
     * @param baseChargenameId the value for r_rate_detail.base_chargename_id
     *
     * @mbggenerated
     */
    public void setBaseChargenameId(Integer baseChargenameId) {
        this.baseChargenameId = baseChargenameId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.chargename
     *
     * @return the value of r_rate_detail.chargename
     *
     * @mbggenerated
     */
    public String getChargename() {
        return chargename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.chargename
     *
     * @param chargename the value for r_rate_detail.chargename
     *
     * @mbggenerated
     */
    public void setChargename(String chargename) {
        this.chargename = chargename == null ? null : chargename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.base_currency_id
     *
     * @return the value of r_rate_detail.base_currency_id
     *
     * @mbggenerated
     */
    public Integer getBaseCurrencyId() {
        return baseCurrencyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.base_currency_id
     *
     * @param baseCurrencyId the value for r_rate_detail.base_currency_id
     *
     * @mbggenerated
     */
    public void setBaseCurrencyId(Integer baseCurrencyId) {
        this.baseCurrencyId = baseCurrencyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.price
     *
     * @return the value of r_rate_detail.price
     *
     * @mbggenerated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.price
     *
     * @param price the value for r_rate_detail.price
     *
     * @mbggenerated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.base_unit_id
     *
     * @return the value of r_rate_detail.base_unit_id
     *
     * @mbggenerated
     */
    public Integer getBaseUnitId() {
        return baseUnitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.base_unit_id
     *
     * @param baseUnitId the value for r_rate_detail.base_unit_id
     *
     * @mbggenerated
     */
    public void setBaseUnitId(Integer baseUnitId) {
        this.baseUnitId = baseUnitId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.minValue
     *
     * @return the value of r_rate_detail.minValue
     *
     * @mbggenerated
     */
    public BigDecimal getMinvalue() {
        return minvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.minValue
     *
     * @param minvalue the value for r_rate_detail.minValue
     *
     * @mbggenerated
     */
    public void setMinvalue(BigDecimal minvalue) {
        this.minvalue = minvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.maxValue
     *
     * @return the value of r_rate_detail.maxValue
     *
     * @mbggenerated
     */
    public BigDecimal getMaxvalue() {
        return maxvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.maxValue
     *
     * @param maxvalue the value for r_rate_detail.maxValue
     *
     * @mbggenerated
     */
    public void setMaxvalue(BigDecimal maxvalue) {
        this.maxvalue = maxvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.remark
     *
     * @return the value of r_rate_detail.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.remark
     *
     * @param remark the value for r_rate_detail.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.freighttype
     *
     * @return the value of r_rate_detail.freighttype
     *
     * @mbggenerated
     */
    public Integer getFreighttype() {
        return freighttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.freighttype
     *
     * @param freighttype the value for r_rate_detail.freighttype
     *
     * @mbggenerated
     */
    public void setFreighttype(Integer freighttype) {
        this.freighttype = freighttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.fcllcl
     *
     * @return the value of r_rate_detail.fcllcl
     *
     * @mbggenerated
     */
    public Integer getFcllcl() {
        return fcllcl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.fcllcl
     *
     * @param fcllcl the value for r_rate_detail.fcllcl
     *
     * @mbggenerated
     */
    public void setFcllcl(Integer fcllcl) {
        this.fcllcl = fcllcl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.base_strategy_id
     *
     * @return the value of r_rate_detail.base_strategy_id
     *
     * @mbggenerated
     */
    public Integer getBaseStrategyId() {
        return baseStrategyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.base_strategy_id
     *
     * @param baseStrategyId the value for r_rate_detail.base_strategy_id
     *
     * @mbggenerated
     */
    public void setBaseStrategyId(Integer baseStrategyId) {
        this.baseStrategyId = baseStrategyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.effectbgndate
     *
     * @return the value of r_rate_detail.effectbgndate
     *
     * @mbggenerated
     */
    public Date getEffectbgndate() {
        return effectbgndate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.effectbgndate
     *
     * @param effectbgndate the value for r_rate_detail.effectbgndate
     *
     * @mbggenerated
     */
    public void setEffectbgndate(Date effectbgndate) {
        this.effectbgndate = effectbgndate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.effectenddate
     *
     * @return the value of r_rate_detail.effectenddate
     *
     * @mbggenerated
     */
    public Date getEffectenddate() {
        return effectenddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.effectenddate
     *
     * @param effectenddate the value for r_rate_detail.effectenddate
     *
     * @mbggenerated
     */
    public void setEffectenddate(Date effectenddate) {
        this.effectenddate = effectenddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.befixed
     *
     * @return the value of r_rate_detail.befixed
     *
     * @mbggenerated
     */
    public String getBefixed() {
        return befixed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.befixed
     *
     * @param befixed the value for r_rate_detail.befixed
     *
     * @mbggenerated
     */
    public void setBefixed(String befixed) {
        this.befixed = befixed == null ? null : befixed.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_rate_detail.flag
     *
     * @return the value of r_rate_detail.flag
     *
     * @mbggenerated
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_rate_detail.flag
     *
     * @param flag the value for r_rate_detail.flag
     *
     * @mbggenerated
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}