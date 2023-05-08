package com.lic.epgs.policyservicing.common.policylevelmergercontroller.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY_LEVEL_MERGER_SEARCH_DTO")
public class PolicyLevelMergerSearchDto {
 
    @Id
    private Long policyLevelMergerId;
    private String policyNumber;
    private String product;
    private String lineOfBusiness;
    private String mergeStatus;
    private String unitCode;
    private String mphCode;
    private String mphName;
    private Date modificationDate;

    public Long getPolicyLevelMergerId() {
        return policyLevelMergerId;
    }

    public void setPolicyLevelMergerId(Long policyLevelMergerId) {
        this.policyLevelMergerId = policyLevelMergerId;
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

    public String getMergeStatus() {
        return mergeStatus;
    }

    public void setMergeStatus(String mergeStatus) {
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

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

}