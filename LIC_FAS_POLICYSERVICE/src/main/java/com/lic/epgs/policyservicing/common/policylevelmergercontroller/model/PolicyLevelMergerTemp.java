package com.lic.epgs.policyservicing.common.policylevelmergercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "policy_level_merger_temp")
public class PolicyLevelMergerTemp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mergeId;

    @ManyToOne
    @JoinColumn(name = "policy_number")
    private PolicyMaster policyMaster;

    @ManyToOne
    @JoinColumn(name = "mph_code")
    private MphMaster mphMaster;

    private Boolean isActive;

    private LocalDateTime createdOn;

    private String createdBy;

    private LocalDateTime modifiedOn;

    private String modifiedBy;

    public Long getMergeId() {
        return mergeId;
    }

    public void setMergeId(Long mergeId) {
        this.mergeId = mergeId;
    }

    public PolicyMaster getPolicyMaster() {
        return policyMaster;
    }

    public void setPolicyMaster(PolicyMaster policyMaster) {
        this.policyMaster = policyMaster;
    }

    public MphMaster getMphMaster() {
        return mphMaster;
    }

    public void setMphMaster(MphMaster mphMaster) {
        this.mphMaster = mphMaster;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(LocalDateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}