package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model;

import java.util.List;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.util.PolicyLevelConversionConstants;

public class PolicyLevelConversionDto {
    private String newPolicyNo;
    private List<PolicyLevelConversionConstants> policyLevelConversionConstants;
    private String existingPolicyNo;

    public String getNewPolicyNo() {
        return newPolicyNo;
    }

    public void setNewPolicyNo(String newPolicyNo) {
        this.newPolicyNo = newPolicyNo;
    }

    public List<PolicyLevelConversionConstants> getPolicyLevelConversionConstants() {
        return policyLevelConversionConstants;
    }

    public void setPolicyLevelConversionConstants(List<PolicyLevelConversionConstants> policyLevelConversionConstants) {
        this.policyLevelConversionConstants = policyLevelConversionConstants;
    }

    public String getExistingPolicyNo() {
        return existingPolicyNo;
    }

    public void setExistingPolicyNo(String existingPolicyNo) {
        this.existingPolicyNo = existingPolicyNo;
    }
}