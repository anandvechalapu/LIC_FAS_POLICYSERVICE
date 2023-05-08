package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import org.springframework.stereotype.Service;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository.SavePolicyLevelMemberAdditionControllerRepository;

@Service
public class SavePolicyLevelMemberAdditionControllerService {

    private final SavePolicyLevelMemberAdditionControllerRepository savePolicyLevelMemberAdditionControllerRepository;

    public SavePolicyLevelMemberAdditionControllerService(SavePolicyLevelMemberAdditionControllerRepository savePolicyLevelMemberAdditionControllerRepository) {
        this.savePolicyLevelMemberAdditionControllerRepository = savePolicyLevelMemberAdditionControllerRepository;
    }

    public void savePolicyServiceMemberDetails(String personalDetails, String addressDetails, String bankDetails,
                                               String nomineeDetails, String appointeeDetails) {
        savePolicyLevelMemberAdditionControllerRepository.savePolicyServiceMemberDetails(personalDetails, addressDetails, bankDetails,
                                                                                        nomineeDetails, appointeeDetails);
    }

    public void savePolicyServiceMemberDetailsAsDraft(String personalDetails, String addressDetails, String bankDetails,
                                                      String nomineeDetails, String appointeeDetails, String memberAdditionID) {
        savePolicyLevelMemberAdditionControllerRepository.savePolicyServiceMemberDetailsAsDraft(personalDetails, addressDetails, bankDetails,
                                                                                               nomineeDetails, appointeeDetails, memberAdditionID);
    }

    public void savePolicyServiceMemberDetailsAsActive(String personalDetails, String addressDetails, String bankDetails,
                                                       String nomineeDetails, String appointeeDetails, String memberAdditionID) {
        savePolicyLevelMemberAdditionControllerRepository.savePolicyServiceMemberDetailsAsActive(personalDetails, addressDetails, bankDetails,
                                                                                                nomineeDetails, appointeeDetails, memberAdditionID);
    }

    public void modifyAndUpdatePolicyServiceMemberDetails(String personalDetails, String addressDetails, String bankDetails,
                                                          String nomineeDetails, String appointeeDetails, String memberAdditionID) {
        savePolicyLevelMemberAdditionControllerRepository.modifyAndUpdatePolicyServiceMemberDetails(personalDetails, addressDetails, bankDetails,
                                                                                                   nomineeDetails, appointeeDetails, memberAdditionID);
    }

    public void saveUpdatedPolicyServiceMemberDetails() {
        savePolicyLevelMemberAdditionControllerRepository.saveUpdatedPolicyServiceMemberDetails();
    }

    public void viewUpdatedPolicyServiceMemberDetails() {
        savePolicyLevelMemberAdditionControllerRepository.viewUpdatedPolicyServiceMemberDetails();
    }

    public void handleErrorsAndExceptions() {
        savePolicyLevelMemberAdditionControllerRepository.handleErrorsAndExceptions();
    }

    public void securePolicyServiceMemberDetails() {
        savePolicyLevelMemberAdditionControllerRepository.securePolicyServiceMemberDetails();
    }

}