package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.PolicyLevelConversionDto;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.PolicyLevelConversionControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyLevelConversionControllerService {

    @Autowired
    private PolicyLevelConversionControllerRepository policyLevelConversionControllerRepository;

    public CommonResponseDto getPolicyConversionDetailsByPolicyNo(String prevPolicyNo, String role) {
        return policyLevelConversionControllerRepository.getPolicyConversionDetailsByPolicyNo(prevPolicyNo, role);
    }
}