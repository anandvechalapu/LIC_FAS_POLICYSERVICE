package com.lic.epgs.policyservicing.common.memberlvl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transfer")
public class Transfer {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transfer_id")
    private long transferId;
 
    @Column(name = "source_id")
    private Long sourceId;
 
    @Column(name = "destination_id")
    private Long destinationId;
 
    @Column(name = "status")
    private String status;
 
    @Column(name = "created_by")
    private String createdBy;
 
    @Column(name = "modified_by")
    private String modifiedBy;
 
    public long getTransferId() {
        return transferId;
    }
 
    public void setTransferId(long transferId) {
        this.transferId = transferId;
    }
 
    public Long getSourceId() {
        return sourceId;
    }
 
    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }
 
    public Long getDestinationId() {
        return destinationId;
    }
 
    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
    }
 
    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        this.status = status;
    }
 
    public String getCreatedBy() {
        return createdBy;
    }
 
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
 
    public String getModifiedBy() {
        return modifiedBy;
    }
 
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}