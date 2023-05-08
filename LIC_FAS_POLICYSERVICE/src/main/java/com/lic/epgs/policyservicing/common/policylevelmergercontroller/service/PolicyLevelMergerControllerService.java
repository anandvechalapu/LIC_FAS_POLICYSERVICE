package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerSearchDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyLevelMergerControllerService {

    @Autowired
    PolicyLevelMergerControllerRepository policyLevelMergerControllerRepository;

    public List<PolicyLevelMergerSearchDto> getCriteriaSearchPolicy(String policyNumber, String product, String lineOfBusiness, String mergeStatus, String unitCode, String mphCode, String mphName){
        return policyLevelMergerControllerRepository.getCriteriaSearchPolicy(policyNumber, product, lineOfBusiness, mergeStatus, unitCode, mphCode, mphName);
    }

    public PolicyLevelMergerApiResponse save(PolicyLevelMergerApiResponse policyLevelMergerApiResponse){
        return policyLevelMergerControllerRepository.save(policyLevelMergerApiResponse);
    }

}