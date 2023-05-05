package com.lic.epgs.fund.policyinterestratefundcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyInterestRateFundControllerModel {

    @Id
    private String policyNo;
    private String memberId;
    private String interestRate;
    private String amount;

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

}