package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PolicyLevelDetailsChangeController")
public class PolicyLevelDetailsChangeController {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policyDtlsId")
    private Integer policyDtlsId;
    
    @Column(name = "policyStatus")
    private String policyStatus;
    
    @Column(name = "rejectionRemarks")
    private String rejectionRemarks;
    
    @Column(name = "reasonCode")
    private String reasonCode;
    
    public Integer getPolicyDtlsId() {
        return policyDtlsId;
    }
    
    public void setPolicyDtlsId(Integer policyDtlsId) {
        this.policyDtlsId = policyDtlsId;
    }
    
    public String getPolicyStatus() {
        return policyStatus;
    }
    
    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }
    
    public String getRejectionRemarks() {
        return rejectionRemarks;
    }
    
    public void setRejectionRemarks(String rejectionRemarks) {
        this.rejectionRemarks = rejectionRemarks;
    }
    
    public String getReasonCode() {
        return reasonCode;
    }
    
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }
}