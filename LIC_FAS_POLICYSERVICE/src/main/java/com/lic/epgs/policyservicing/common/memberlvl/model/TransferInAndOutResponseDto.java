package com.lic.epgs.policyservicing.common.memberlvl.model; 

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TransferInAndOutResponseDto {
 
    @Id
    private Long id;
    private Integer policyId;
    private Integer licId;
    private Integer transferIn;
    private Integer transferOut;
    private Integer total;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Integer getPolicyId() {
        return policyId;
    }
 
    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }
 
    public Integer getLicId() {
        return licId;
    }
 
    public void setLicId(Integer licId) {
        this.licId = licId;
    }
 
    public Integer getTransferIn() {
        return transferIn;
    }
 
    public void setTransferIn(Integer transferIn) {
        this.transferIn = transferIn;
    }
 
    public Integer getTransferOut() {
        return transferOut;
    }
 
    public void setTransferOut(Integer transferOut) {
        this.transferOut = transferOut;
    }
 
    public Integer getTotal() {
        return total;
    }
 
    public void setTotal(Integer total) {
        this.total = total;
    }
}