package com.lic.epgs.topupda.model;

import java.util.List;

public class TopupdaApiResponseDto {
    private String transactionMessage;
    private String transactionStatus;
    private List<TopupdaDto> requests;

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

    public List<TopupdaDto> getRequests() {
        return requests;
    }

    public void setRequests(List<TopupdaDto> requests) {
        this.requests = requests;
    }
}