package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PolicyLevelMemberAdditionController")
public class PolicyLevelMemberAdditionController {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "licenseId")
    private Long licenseId;
 
    @Column(name = "partyId")
    private String partyId;
 
    @Column(name = "memberId")
    private String memberId;
 
    public Long getLicenseId() {
        return licenseId;
    }
 
    public void setLicenseId(Long licenseId) {
        this.licenseId = licenseId;
    }
 
    public String getPartyId() {
        return partyId;
    }
 
    public void setPartyId(String partyId) {
        this.partyId = partyId;
    }
 
    public String getMemberId() {
        return memberId;
    }
 
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
 
}