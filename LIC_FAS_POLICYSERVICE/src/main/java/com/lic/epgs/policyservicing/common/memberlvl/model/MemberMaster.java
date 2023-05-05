package com.lic.epgs.policyservicing.common.memberlvl.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MemberMaster {

    @Id
    private Long policyId;

    private String memberName;

    private String policyNumber;

    private Long policyTerm;

    private Long sumAssured;

    private String payMode;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Long getPolicyTerm() {
        return policyTerm;
    }

    public void setPolicyTerm(Long policyTerm) {
        this.policyTerm = policyTerm;
    }

    public Long getSumAssured() {
        return sumAssured;
    }

    public void setSumAssured(Long sumAssured) {
        this.sumAssured = sumAssured;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }
}