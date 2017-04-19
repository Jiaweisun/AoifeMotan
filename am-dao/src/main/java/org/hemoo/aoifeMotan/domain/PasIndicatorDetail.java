package org.hemoo.aoifeMotan.domain;

import java.math.BigDecimal;
import java.util.Date;

public class PasIndicatorDetail {
    private Long id;

    private String detailCode;

    private String indicatorCode;

    private Integer year;

    private BigDecimal january;

    private BigDecimal february;

    private BigDecimal march;

    private BigDecimal april;

    private BigDecimal may;

    private BigDecimal june;

    private BigDecimal july;

    private BigDecimal august;

    private BigDecimal september;

    private BigDecimal october;

    private BigDecimal november;

    private BigDecimal december;

    private Byte deleteFlag;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetailCode() {
        return detailCode;
    }

    public void setDetailCode(String detailCode) {
        this.detailCode = detailCode == null ? null : detailCode.trim();
    }

    public String getIndicatorCode() {
        return indicatorCode;
    }

    public void setIndicatorCode(String indicatorCode) {
        this.indicatorCode = indicatorCode == null ? null : indicatorCode.trim();
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BigDecimal getJanuary() {
        return january;
    }

    public void setJanuary(BigDecimal january) {
        this.january = january;
    }

    public BigDecimal getFebruary() {
        return february;
    }

    public void setFebruary(BigDecimal february) {
        this.february = february;
    }

    public BigDecimal getMarch() {
        return march;
    }

    public void setMarch(BigDecimal march) {
        this.march = march;
    }

    public BigDecimal getApril() {
        return april;
    }

    public void setApril(BigDecimal april) {
        this.april = april;
    }

    public BigDecimal getMay() {
        return may;
    }

    public void setMay(BigDecimal may) {
        this.may = may;
    }

    public BigDecimal getJune() {
        return june;
    }

    public void setJune(BigDecimal june) {
        this.june = june;
    }

    public BigDecimal getJuly() {
        return july;
    }

    public void setJuly(BigDecimal july) {
        this.july = july;
    }

    public BigDecimal getAugust() {
        return august;
    }

    public void setAugust(BigDecimal august) {
        this.august = august;
    }

    public BigDecimal getSeptember() {
        return september;
    }

    public void setSeptember(BigDecimal september) {
        this.september = september;
    }

    public BigDecimal getOctober() {
        return october;
    }

    public void setOctober(BigDecimal october) {
        this.october = october;
    }

    public BigDecimal getNovember() {
        return november;
    }

    public void setNovember(BigDecimal november) {
        this.november = november;
    }

    public BigDecimal getDecember() {
        return december;
    }

    public void setDecember(BigDecimal december) {
        this.december = december;
    }

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}