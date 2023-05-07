package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.dto.PolicyLevelConversionDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.repository.PolicyLevelConversionRepository;

@Service
public class PolicyLevelConversionService {

    @Autowired
    private PolicyLevelConversionRepository policyLevelConversionRepository;
    
    public CommonResponseDto savePolicyConversionDetails(PolicyLevelConversionDto policyLevelConversionDTO) {
        return policyLevelConversionRepository.savePolicyConversionDetails(policyLevelConversionDTO);
    }
}