package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerControllerRepository;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerSearchDto;

@Service
public class PolicyLevelMergerControllerService {

    @Autowired
    private PolicyLevelMergerControllerRepository policyLevelMergerControllerRepository;

    public List<PolicyLevelMergerSearchDto> getCriteriaSearchPolicy(String policyNumber, String product,
            String lineOfBusiness, String mergeStatus, String unitCode, String mphCode, String mphName) {
        return policyLevelMergerControllerRepository.getCriteriaSearchPolicy(policyNumber, product, lineOfBusiness,
                mergeStatus, unitCode, mphCode, mphName);
    }

}