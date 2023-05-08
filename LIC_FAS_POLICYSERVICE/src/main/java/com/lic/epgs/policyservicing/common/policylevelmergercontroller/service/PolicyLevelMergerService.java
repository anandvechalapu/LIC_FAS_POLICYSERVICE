package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerSearchDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.entity.PolicyLevelMergerEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerRepository;

@Service
public class PolicyLevelMergerService {

    @Autowired
    private PolicyLevelMergerRepository policyLevelMergerRepository;

    public List<PolicyLevelMergerSearchDto> getExistingCriteriaSearchPolicy(String policyNumber, String product, String lineOfBusiness, Integer mergeStatus, String unitCode, String mphCode, String mphName) {
        return policyLevelMergerRepository.getExistingCriteriaSearchPolicy(policyNumber, product, lineOfBusiness, mergeStatus, unitCode, mphCode, mphName);
    }
    
    public PolicyLevelMergerEntity save(PolicyLevelMergerEntity entity) {
        return policyLevelMergerRepository.save(entity);
    }

}