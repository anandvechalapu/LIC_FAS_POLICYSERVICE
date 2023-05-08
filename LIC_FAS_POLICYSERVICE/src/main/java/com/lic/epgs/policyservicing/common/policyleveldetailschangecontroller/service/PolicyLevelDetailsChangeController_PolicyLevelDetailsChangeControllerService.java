package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeController;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository.PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeControllerRepository;

@Service
public class PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeControllerService {

    @Autowired
    private PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeControllerRepository policyLevelDetailsChangeControllerRepository;

    public PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeController findByPolicyNumberAndPolicyDetailsId(String policyNumber, Long policyDetailsId) {
        return policyLevelDetailsChangeControllerRepository.findByPolicyNumberAndPolicyDetailsId(policyNumber, policyDetailsId);
    }

    public PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeController save(PolicyLevelDetailsChangeController_PolicyLevelDetailsChangeController policyLevelDetailsChangeController) {
        return policyLevelDetailsChangeControllerRepository.save(policyLevelDetailsChangeController);
    }

}