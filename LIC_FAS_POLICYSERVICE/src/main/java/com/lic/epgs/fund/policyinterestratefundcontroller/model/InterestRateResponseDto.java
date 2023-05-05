package com.lic.epgs.fund.policyinterestratefundcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InterestRateResponseDto {

    @Id
    private String policyNo;
    private Double currentInterestRate;
    private Double previousInterestRate;

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public Double getCurrentInterestRate() {
        return currentInterestRate;
    }

    public void setCurrentInterestRate(Double currentInterestRate) {
        this.currentInterestRate = currentInterestRate;
    }

    public Double getPreviousInterestRate() {
        return previousInterestRate;
    }

    public void setPreviousInterestRate(Double previousInterestRate) {
        this.previousInterestRate = previousInterestRate;
    }
}