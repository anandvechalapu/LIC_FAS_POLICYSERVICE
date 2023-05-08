package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model;

import java.time.Instant;

public class FreeLookCancellationResponseDto {
    
    private CommonDto commonDto;
    private PolicyBankOldDto policyBankOldDto;
    private String transactionStatus;
    private String transactionMessage;
    private Instant startTime;
    private Instant endTime;

    // Getters and Setters
    
    public CommonDto getCommonDto() {
        return commonDto;
    }

    public void setCommonDto(CommonDto commonDto) {
        this.commonDto = commonDto;
    }

    public PolicyBankOldDto getPolicyBankOldDto() {
        return policyBankOldDto;
    }

    public void setPolicyBankOldDto(PolicyBankOldDto policyBankOldDto) {
        this.policyBankOldDto = policyBankOldDto;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getTransactionMessage() {
        return transactionMessage;
    }

    public void setTransactionMessage(String transactionMessage) {
        this.transactionMessage = transactionMessage;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }
    
    
}