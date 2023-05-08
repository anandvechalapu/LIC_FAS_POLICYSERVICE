package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.PolicyLevelConversionDto;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.PolicyLevelConversionControllerRepository;

@Service
public class PolicyLevelConversionControllerService {
    
    @Autowired
    private PolicyLevelConversionControllerRepository policyLevelConversionControllerRepository;
    
    public PolicyLevelConversionDto savePolicyConversionDetails(PolicyLevelConversionDto policyLevelConversionDto){
        return policyLevelConversionControllerRepository.savePolicyConversionDetails(policyLevelConversionDto);
    }
}