package com.lic.epgs.policyservicing.common.memberlvl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.http.ResponseEntity;

public class CommissionDto {

    @JsonProperty("commissionId")
    private Integer commissionId;

    @JsonProperty("planId")
    private Integer planId;

    @JsonProperty("levelId")
    private Integer levelId;

    @JsonProperty("levelName")
    private String levelName;

    @JsonProperty("commissionType")
    private String commissionType;

    @JsonProperty("commissionAmount")
    private Float commissionAmount;

    @JsonProperty("startDate")
    private String startDate;

    @JsonProperty("endDate")
    private String endDate;

    public Integer getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(Integer commissionId) {
        this.commissionId = commissionId;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getCommissionType() {
        return commissionType;
    }

    public void setCommissionType(String commissionType) {
        this.commissionType = commissionType;
    }

    public Float getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Float commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}