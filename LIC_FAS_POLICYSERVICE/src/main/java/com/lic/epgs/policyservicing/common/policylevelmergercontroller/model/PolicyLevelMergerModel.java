package com.lic.epgs.policyservicing.common.policylevelmergercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy_level_merger")
public class PolicyLevelMergerModel {
    
    @Id
    private Long id;
    private String policyNumber;
    private String product;
    private String lineOfBusiness;
    private Integer mergeStatus;
    private String unitCode;
    private String mphCode;
    private String mphName;
    private Boolean isActive;
    private Long modifiedOn;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getPolicyNumber() {
        return policyNumber;
    }
    
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    
    public String getProduct() {
        return product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }
    
    public String getLineOfBusiness() {
        return lineOfBusiness;
    }
    
    public void setLineOfBusiness(String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }
    
    public Integer getMergeStatus() {
        return mergeStatus;
    }
    
    public void setMergeStatus(Integer mergeStatus) {
        this.mergeStatus = mergeStatus;
    }
    
    public String getUnitCode() {
        return unitCode;
    }
    
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }
    
    public String getMphCode() {
        return mphCode;
    }
    
    public void setMphCode(String mphCode) {
        this.mphCode = mphCode;
    }
    
    public String getMphName() {
        return mphName;
    }
    
    public void setMphName(String mphName) {
        this.mphName = mphName;
    }
    
    public Boolean getIsActive() {
        return isActive;
    }
    
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    
    public Long getModifiedOn() {
        return modifiedOn;
    }
    
    public void setModifiedOn(Long modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
    
}