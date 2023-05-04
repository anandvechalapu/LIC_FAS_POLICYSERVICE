package com.lic.epgs.common.model;

import java.io.Serializable;

public class MemberChangeDto implements Serializable {

    private static final long serialVersionUID = -7648314077817031414L;

    private Long policyId;
    private Long memberId;
    private String oldStatus;
    private String newStatus;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(String oldStatus) {
        this.oldStatus = oldStatus;
    }

    public String getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(String newStatus) {
        this.newStatus = newStatus;
    }
}