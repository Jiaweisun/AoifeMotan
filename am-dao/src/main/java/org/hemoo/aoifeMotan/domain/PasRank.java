package org.hemoo.aoifeMotan.domain;

import java.util.Date;

public class PasRank {
    private Long id;

    private String rankCode;

    private String rankName;

    private Integer level;

    private String highSalaryLevel;

    private String lowSalaryLevel;

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

    public String getRankCode() {
        return rankCode;
    }

    public void setRankCode(String rankCode) {
        this.rankCode = rankCode == null ? null : rankCode.trim();
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName == null ? null : rankName.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getHighSalaryLevel() {
        return highSalaryLevel;
    }

    public void setHighSalaryLevel(String highSalaryLevel) {
        this.highSalaryLevel = highSalaryLevel == null ? null : highSalaryLevel.trim();
    }

    public String getLowSalaryLevel() {
        return lowSalaryLevel;
    }

    public void setLowSalaryLevel(String lowSalaryLevel) {
        this.lowSalaryLevel = lowSalaryLevel == null ? null : lowSalaryLevel.trim();
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