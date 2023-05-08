package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model;

import java.util.Map;

public class SavePolicyLevelMemberAdditionController {
    private String memberAdditionId;
    private Map<String, Object> policyServiceMemberDetails;
    private String memberAdditionStatus;

    public String getMemberAdditionId() {
        return memberAdditionId;
    }

    public void setMemberAdditionId(String memberAdditionId) {
        this.memberAdditionId = memberAdditionId;
    }

    public Map<String, Object> getPolicyServiceMemberDetails() {
        return policyServiceMemberDetails;
    }

    public void setPolicyServiceMemberDetails(Map<String, Object> policyServiceMemberDetails) {
        this.policyServiceMemberDetails = policyServiceMemberDetails;
    }

    public String getMemberAdditionStatus() {
        return memberAdditionStatus;
    }

    public void setMemberAdditionStatus(String memberAdditionStatus) {
        this.memberAdditionStatus = memberAdditionStatus;
    }

    public void savePolicyServiceMemberDetails(Map<String, Object> policyServiceMemberDetails) {
        // Save policy service member details
    }

    public void updatePolicyServiceMemberDetails(Map<String, Object> policyServiceMemberDetails) {
        // Update policy service member details
    }

    public void savePolicyServiceMemberDetailsAsDraft(Map<String, Object> policyServiceMemberDetails) {
        // Save policy service member details as draft
    }

    public void savePolicyServiceMemberDetailsAsActive(Map<String, Object> policyServiceMemberDetails) {
        // Save policy service member details as active
    }

    public void setMemberAdditionStatusAsDraftStatus(String memberAdditionId) {
        // Set member addition status as Draft Status
    }

    public void setMemberAdditionStatusAsActiveStatus(String memberAdditionId) {
        // Set member addition status as Active Status
    }

    public Map<String, Object> getUpdatedPolicyServiceMemberDetails(String memberAdditionId) {
        // Get updated policy service member details
        return null;
    }

    public void handleExceptionsGracefully() {
        // Handle exceptions gracefully
    }

    public void securePolicyServiceMemberDetails() {
        // Secure policy service member details
    }
}