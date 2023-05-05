package com.lic.epgs.policyservicing.common.policyservicingcontroller.service;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.PolicyServiceModuleDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.PolicyServiceDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.repository.SavePolicyServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SavePolicyService {

    @Autowired
    SavePolicyServiceRepository savePolicyServiceRepository;

    public CommonResponseDto<PolicyServiceDto> savePolicyService(PolicyServiceModuleDto policyServiceModuleDto) {
        return savePolicyServiceRepository.savePolicyService(policyServiceModuleDto);
    }

}