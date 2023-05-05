package com.lic.epgs.fund.interestratelogcontroller.model;

import org.springframework.data.annotation.Id;

public class FundInterestRateLog {
    
    @Id
    private String id;
    private String policyNo;
    private String errorMessage;

    public FundInterestRateLog() {
    }

    public FundInterestRateLog(String policyNo, String errorMessage) {
        this.policyNo = policyNo;
        this.errorMessage = errorMessage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}