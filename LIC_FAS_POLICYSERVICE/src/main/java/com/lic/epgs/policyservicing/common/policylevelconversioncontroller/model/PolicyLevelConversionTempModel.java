package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POLICY_LEVEL_CONVERSION_TEMP")
public class PolicyLevelConversionTempModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "CONVERSION_ID",unique = true,nullable = false)
    private String conversionId;

    @Column(name = "POLICY_NO",nullable = false)
    private String policyNo;

    @Column(name = "POLICY_LEVEL",nullable = false)
    private String policyLevel;

    @Column(name = "CONVERTED_POLICY_LEVEL",nullable = false)
    private String convertedPolicyLevel;

    @Column(name = "CONVERTED_STATUS",nullable = false)
    private String convertedStatus;

    public String getConversionId() {
        return conversionId;
    }

    public void setConversionId(String conversionId) {
        this.conversionId = conversionId;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getPolicyLevel() {
        return policyLevel;
    }

    public void setPolicyLevel(String policyLevel) {
        this.policyLevel = policyLevel;
    }

    public String getConvertedPolicyLevel() {
        return convertedPolicyLevel;
    }

    public void setConvertedPolicyLevel(String convertedPolicyLevel) {
        this.convertedPolicyLevel = convertedPolicyLevel;
    }

    public String getConvertedStatus() {
        return convertedStatus;
    }

    public void setConvertedStatus(String convertedStatus) {
        this.convertedStatus = convertedStatus;
    }

}