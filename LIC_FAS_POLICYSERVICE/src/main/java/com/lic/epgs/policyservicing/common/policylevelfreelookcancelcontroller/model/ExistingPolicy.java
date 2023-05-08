package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExistingPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String policyNumber;
    private String membersName;
    private String adjustmentsAdjustmentNumber;
    private String policyDispatchDate;
    private String policyRecievedDate;
    private String totalContribution;
    private String transactionMessage;
    private String transactionStatus;

    public ExistingPolicy() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getMembersName() {
        return membersName;
    }

    public void setMembersName(String membersName) {
        this.membersName = membersName;
    }

    public String getAdjustmentsAdjustmentNumber() {
        return adjustmentsAdjustmentNumber;
    }

    public void setAdjustmentsAdjustmentNumber(String adjustmentsAdjustmentNumber) {
        this.adjustmentsAdjustmentNumber = adjustmentsAdjustmentNumber;
    }

    public String getPolicyDispatchDate() {
        return policyDispatchDate;
    }

    public void setPolicyDispatchDate(String policyDispatchDate) {
        this.policyDispatchDate = policyDispatchDate;
    }

    public String getPolicyRecievedDate() {
        return policyRecievedDate;
    }

    public void setPolicyRecievedDate(String policyRecievedDate) {
        this.policyRecievedDate = policyRecievedDate;
    }

    public String getTotalContribution() {
        return totalContribution;
    }

    public void setTotalContribution(String totalContribution) {
        this.totalContribution = totalContribution;
    }

    public String getTransactionMessage() {
        return transactionMessage;
    }

    public void setTransactionMessage(String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

}