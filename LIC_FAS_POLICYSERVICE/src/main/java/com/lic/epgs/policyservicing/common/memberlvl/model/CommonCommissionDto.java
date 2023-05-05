package com.lic.epgs.policyservicing.common.memberlvl.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CommonCommissionDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String commissionId;
    private String unitCode;
    private String commissionStatus;

    public String getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(String commissionId) {
        this.commissionId = commissionId;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getCommissionStatus() {
        return commissionStatus;
    }

    public void setCommissionStatus(String commissionStatus) {
        this.commissionStatus = commissionStatus;
    }

    @Override
    public String toString() {
        return "CommonCommissionDto [commissionId=" + commissionId + ", unitCode=" + unitCode + ", commissionStatus="
                + commissionStatus + "]";
    }

}

package com.lic.epgs.policyservicing.common.memberlvl.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CommissionDetailsDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String commissionId;
    private String tempCommissionId;
    private String memberLevel;
    private String policyNumber;
    private String customerName;
    private String customerNumber;
    private String planName;
    private String planCode;
    private String policyStatus;
    private String policyStatusDesc;

    public String getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(String commissionId) {
        this.commissionId = commissionId;
    }

    public String getTempCommissionId() {
        return tempCommissionId;
    }

    public void setTempCommissionId(String tempCommissionId) {
        this.tempCommissionId = tempCommissionId;
    }

    public String getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public String getPolicyStatusDesc() {
        return policyStatusDesc;
    }

    public void setPolicyStatusDesc(String policyStatusDesc) {
        this.policyStatusDesc = policyStatusDesc;
    }

    @Override
    public String toString() {
        return "CommissionDetailsDto [commissionId=" + commissionId + ", tempCommissionId=" + tempCommissionId
                + ", memberLevel=" + memberLevel + ", policyNumber=" + policyNumber + ", customerName=" + customerName
                + ", customerNumber=" + customerNumber + ", planName=" + planName + ", planCode=" + planCode
                + ", policyStatus=" + policyStatus + ", policyStatusDesc=" + policyStatusDesc