package com.lic.epgs.surrender.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicySurrenderPayOutTempEntity {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String policyNumber;
    private String createdBy;
    private String modifiedBy;
    private boolean isActive;
 
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
 
    public boolean isActive() {
        return isActive;
    }
 
    public void setActive(boolean active) {
        isActive = active;
    }
}