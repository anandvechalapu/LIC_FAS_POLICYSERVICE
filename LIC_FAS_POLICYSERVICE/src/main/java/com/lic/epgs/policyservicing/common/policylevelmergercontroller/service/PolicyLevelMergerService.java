package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerTempEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerRepository;

@Service
public class PolicyLevelMergerService {
    
    @Autowired
    PolicyLevelMergerRepository policyLevelMergerRepository;
    
    public PolicyLevelMergerTempEntity getPolicyMergebyMergeId_PolicyLevelMergerController(Long mergeId) {
        return policyLevelMergerRepository.getPolicyMergebyMergeId_PolicyLevelMergerController(mergeId);
    }
    
}