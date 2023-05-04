package com.lic.epgs.fund.interestfundcontroller.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DebitRequestDto implements Serializable {

    private Long policyNumber;
    private boolean activePolicy;

    public Long getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(Long policyNumber) {
        this.policyNumber = policyNumber;
    }

    public boolean isActivePolicy() {
        return activePolicy;
    }

    public void setActivePolicy(boolean activePolicy) {
        this.activePolicy = activePolicy;
    }
}

public class InterestRateResponseDto implements Serializable {

    private String status;
    private List<InterestErrorDto> errorData = new ArrayList<>();

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<InterestErrorDto> getErrorData() {
        return errorData;
    }

    public void setErrorData(List<InterestErrorDto> errorData) {
        this.errorData = errorData;
    }
}

public class InterestErrorDto implements Serializable {

    private String errorCode;
    private String errorMessage;

    public InterestErrorDto(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}