package com.lic.epgs.policyservicing.common.memberlvl.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransferInAndOutResponseDto {
    
    @Id
    private int transferId;
    private String status;
    private String message;
    
    public int getTransferId() {
        return transferId;
    }
    
    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
}