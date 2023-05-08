package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class SavePolicyLevelMemberAdditionControllerService {

  private final SavePolicyLevelMemberAdditionControllerRepository savePolicyLevelMemberAdditionControllerRepository;

  public SavePolicyLevelMemberAdditionControllerService(
      SavePolicyLevelMemberAdditionControllerRepository savePolicyLevelMemberAdditionControllerRepository) {
    this.savePolicyLevelMemberAdditionControllerRepository = savePolicyLevelMemberAdditionControllerRepository;
  }

  // Save policy service member details
  public void savePolicyServiceMemberDetails(Map<String, Object> policyServiceMemberDetails) {
    savePolicyLevelMemberAdditionControllerRepository.savePolicyServiceMemberDetails(policyServiceMemberDetails);
  }

  // Update policy service member details
  public void updatePolicyServiceMemberDetails(Map<String, Object> policyServiceMemberDetails) {
    savePolicyLevelMemberAdditionControllerRepository.updatePolicyServiceMemberDetails(policyServiceMemberDetails);
  }

  // Save policy service member details as draft
  public void savePolicyServiceMemberDetailsAsDraft(Map<String, Object> policyServiceMemberDetails) {
    savePolicyLevelMemberAdditionControllerRepository.savePolicyServiceMemberDetailsAsDraft(policyServiceMemberDetails);
  }

  // Save policy service member details as active
  public void savePolicyServiceMemberDetailsAsActive(Map<String, Object> policyServiceMemberDetails) {
    savePolicyLevelMemberAdditionControllerRepository.savePolicyServiceMemberDetailsAsActive(policyServiceMemberDetails);
  }

  // Set member addition status as Draft Status
  public void setMemberAdditionStatusAsDraftStatus(String memberAdditionId) {
    savePolicyLevelMemberAdditionControllerRepository.setMemberAdditionStatusAsDraftStatus(memberAdditionId);
  }

  // Set member addition status as Active Status
  public void setMemberAdditionStatusAsActiveStatus(String memberAdditionId) {
    savePolicyLevelMemberAdditionControllerRepository.setMemberAdditionStatusAsActiveStatus(memberAdditionId);
  }

  // Get updated policy service member details
  public Map<String, Object> getUpdatedPolicyServiceMemberDetails(String memberAdditionId) {
    return savePolicyLevelMemberAdditionControllerRepository.getUpdatedPolicyServiceMemberDetails(memberAdditionId);
  }

  // Handle exceptions gracefully
  public void handleExceptionsGracefully() {
    savePolicyLevelMemberAdditionControllerRepository.handleExceptionsGracefully();
  }

  // Secure policy service member details
  public void securePolicyServiceMemberDetails() {
    savePolicyLevelMemberAdditionControllerRepository.securePolicyServiceMemberDetails();
  }

}