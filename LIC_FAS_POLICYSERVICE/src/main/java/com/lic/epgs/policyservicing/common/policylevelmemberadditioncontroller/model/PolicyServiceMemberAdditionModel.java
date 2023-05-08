package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PolicyServiceMemberAddition")
public class PolicyServiceMemberAdditionModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberAdditionId;
    
    @Column(name = "unit_code")
    private String unitCode;
    
    @Column(name = "member_addition_status")
    private String memberAdditionStatus;
    
    @Column(name = "modified_by")
    private String modifiedBy;
    
    @Column(name = "modified_on")
    private String modifiedOn;
    
    public Long getMemberAdditionId() {
        return memberAdditionId;
    }
    
    public void setMemberAdditionId(Long memberAdditionId) {
        this.memberAdditionId = memberAdditionId;
    }
    
    public String getUnitCode() {
        return unitCode;
    }
    
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }
    
    public String getMemberAdditionStatus() {
        return memberAdditionStatus;
    }
    
    public void setMemberAdditionStatus(String memberAdditionStatus) {
        this.memberAdditionStatus = memberAdditionStatus;
    }
    
    public String getModifiedBy() {
        return modifiedBy;
    }
    
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
    
    public String getModifiedOn() {
        return modifiedOn;
    }
    
    public void setModifiedOn(String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }
    
}