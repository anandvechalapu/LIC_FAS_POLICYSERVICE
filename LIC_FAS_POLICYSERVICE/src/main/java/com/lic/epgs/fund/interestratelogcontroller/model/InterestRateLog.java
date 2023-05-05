package com.lic.epgs.fund.interestratelogcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InterestRateLog {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String policyNo;
    private String referenceNo;
    private Double interestRate;
    private Boolean isFail;
    private String description;
 
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getPolicyNo() {
        return policyNo;
    }
    
    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }
    
    public String getReferenceNo() {
        return referenceNo;
    }
    
    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }
    
    public Double getInterestRate() {
        return interestRate;
    }
    
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    
    public Boolean getIsFail() {
        return isFail;
    }
    
    public void setIsFail(Boolean isFail) {
        this.isFail = isFail;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
}