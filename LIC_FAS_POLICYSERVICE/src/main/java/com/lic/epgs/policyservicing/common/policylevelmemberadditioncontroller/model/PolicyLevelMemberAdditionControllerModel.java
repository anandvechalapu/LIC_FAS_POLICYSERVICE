package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import java.util.Date;

public class PolicyLevelMemberAdditionControllerModel {

    private String memberAdditionId;
    private String note;
    private String createdBy;
    private Date createdOn;

    public String getMemberAdditionId() {
        return memberAdditionId;
    }

    public void setMemberAdditionId(String memberAdditionId) {
        this.memberAdditionId = memberAdditionId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

}