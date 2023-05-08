package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository.SavePolicyLevelMemberAdditionControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavePolicyLevelMemberAdditionControllerService {

    @Autowired
    private SavePolicyLevelMemberAdditionControllerRepository savePolicyLevelMemberAdditionControllerRepository;

    public PolicyServiceMember save(PolicyServiceMember policyServiceMember) {
        return savePolicyLevelMemberAdditionControllerRepository.save(policyServiceMember);
    }

    public PolicyServiceMember update(PolicyServiceMember policyServiceMember) {
        return savePolicyLevelMemberAdditionControllerRepository.update(policyServiceMember);
    }

    public boolean isValidComponentName(String componentName) {
        return savePolicyLevelMemberAdditionControllerRepository.isValidComponentName(componentName);
    }

    public void setDraftStatus() {
        savePolicyLevelMemberAdditionControllerRepository.setDraftStatus();
    }

    public void setActiveStatus() {
        savePolicyLevelMemberAdditionControllerRepository.setActiveStatus();
    }
}