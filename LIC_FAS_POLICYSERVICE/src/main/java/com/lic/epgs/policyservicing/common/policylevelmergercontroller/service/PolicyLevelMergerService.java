package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerSearchDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyLevelMergerService {

    @Autowired
    private PolicyLevelMergerRepository policyLevelMergerRepository;

    public PolicyLevelMergerApiResponse getCriteriaSearchPolicy(String policyNumber,
                                                               String product,
                                                               String lineOfBusiness,
                                                               String mergeStatus,
                                                               String unitCode,
                                                               String mphCode,
                                                               String mphName) {
        return policyLevelMergerRepository.getCriteriaSearchPolicy(policyNumber, product, lineOfBusiness, mergeStatus, unitCode, mphCode, mphName);
    }

}