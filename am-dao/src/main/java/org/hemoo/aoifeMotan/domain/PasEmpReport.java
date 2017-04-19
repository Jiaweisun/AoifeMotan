package org.hemoo.aoifeMotan.domain;

import java.math.BigDecimal;
import java.util.Date;

public class PasEmpReport {
    private Long id;

    private String empCode;

    private String positionCode;

    private String positionType;

    private BigDecimal initialSalary;

    private BigDecimal raisedSalary;

    private BigDecimal manualSalary;

    private BigDecimal mixedSalary;

    private BigDecimal decreseSalary;

    private BigDecimal downshiftSalary;

    private BigDecimal stdSalary;

    private BigDecimal nextStdSalary;

    private BigDecimal monthDeduct;

    private BigDecimal monthProfit;

    private BigDecimal monthPoint;

    private BigDecimal lastMonthPoint;

    private BigDecimal thisMonthPoint;

    private BigDecimal monthTargetPoint;

    private String companyCode;

    private Date reportDate;

    private Date entryTime;

    private Date foundDate;

    private BigDecimal thisMonthProfit;

    private String rankCode;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Byte deleteFlag;

    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode == null ? null : empCode.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType == null ? null : positionType.trim();
    }

    public BigDecimal getInitialSalary() {
        return initialSalary;
    }

    public void setInitialSalary(BigDecimal initialSalary) {
        this.initialSalary = initialSalary;
    }

    public BigDecimal getRaisedSalary() {
        return raisedSalary;
    }

    public void setRaisedSalary(BigDecimal raisedSalary) {
        this.raisedSalary = raisedSalary;
    }

    public BigDecimal getManualSalary() {
        return manualSalary;
    }

    public void setManualSalary(BigDecimal manualSalary) {
        this.manualSalary = manualSalary;
    }

    public BigDecimal getMixedSalary() {
        return mixedSalary;
    }

    public void setMixedSalary(BigDecimal mixedSalary) {
        this.mixedSalary = mixedSalary;
    }

    public BigDecimal getDecreseSalary() {
        return decreseSalary;
    }

    public void setDecreseSalary(BigDecimal decreseSalary) {
        this.decreseSalary = decreseSalary;
    }

    public BigDecimal getDownshiftSalary() {
        return downshiftSalary;
    }

    public void setDownshiftSalary(BigDecimal downshiftSalary) {
        this.downshiftSalary = downshiftSalary;
    }

    public BigDecimal getStdSalary() {
        return stdSalary;
    }

    public void setStdSalary(BigDecimal stdSalary) {
        this.stdSalary = stdSalary;
    }

    public BigDecimal getNextStdSalary() {
        return nextStdSalary;
    }

    public void setNextStdSalary(BigDecimal nextStdSalary) {
        this.nextStdSalary = nextStdSalary;
    }

    public BigDecimal getMonthDeduct() {
        return monthDeduct;
    }

    public void setMonthDeduct(BigDecimal monthDeduct) {
        this.monthDeduct = monthDeduct;
    }

    public BigDecimal getMonthProfit() {
        return monthProfit;
    }

    public void setMonthProfit(BigDecimal monthProfit) {
        this.monthProfit = monthProfit;
    }

    public BigDecimal getMonthPoint() {
        return monthPoint;
    }

    public void setMonthPoint(BigDecimal monthPoint) {
        this.monthPoint = monthPoint;
    }

    public BigDecimal getLastMonthPoint() {
        return lastMonthPoint;
    }

    public void setLastMonthPoint(BigDecimal lastMonthPoint) {
        this.lastMonthPoint = lastMonthPoint;
    }

    public BigDecimal getThisMonthPoint() {
        return thisMonthPoint;
    }

    public void setThisMonthPoint(BigDecimal thisMonthPoint) {
        this.thisMonthPoint = thisMonthPoint;
    }

    public BigDecimal getMonthTargetPoint() {
        return monthTargetPoint;
    }

    public void setMonthTargetPoint(BigDecimal monthTargetPoint) {
        this.monthTargetPoint = monthTargetPoint;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Date getFoundDate() {
        return foundDate;
    }

    public void setFoundDate(Date foundDate) {
        this.foundDate = foundDate;
    }

    public BigDecimal getThisMonthProfit() {
        return thisMonthProfit;
    }

    public void setThisMonthProfit(BigDecimal thisMonthProfit) {
        this.thisMonthProfit = thisMonthProfit;
    }

    public String getRankCode() {
        return rankCode;
    }

    public void setRankCode(String rankCode) {
        this.rankCode = rankCode == null ? null : rankCode.trim();
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

    public Byte getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Byte deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}