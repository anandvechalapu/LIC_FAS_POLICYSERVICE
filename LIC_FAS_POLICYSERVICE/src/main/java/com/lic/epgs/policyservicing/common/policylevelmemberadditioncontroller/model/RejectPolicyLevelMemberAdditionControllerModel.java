package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;

public class RejectPolicyLevelMemberAdditionControllerModel {

    private String memberAdditionId;
    private String unitCode;
    private String modifiedBy;
    private LocalDateTime modifiedOn;

    public String getMemberAdditionId() {
        return memberAdditionId;
    }

    public void setMemberAdditionId(String memberAdditionId) {
        this.memberAdditionId = memberAdditionId;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public LocalDateTime getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(LocalDateTime modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
}