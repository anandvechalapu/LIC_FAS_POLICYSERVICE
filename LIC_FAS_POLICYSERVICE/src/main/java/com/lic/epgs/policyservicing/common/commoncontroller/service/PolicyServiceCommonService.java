package com.lic.epgs.policyservicing.common.commoncontroller.service;

import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceCommonResponseDto;
import com.lic.epgs.policyservicing.common.commoncontroller.repository.PolicyServiceCommonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyServiceCommonService {

    @Autowired
    private PolicyServiceCommonRepository policyServiceCommonRepository;

    public PolicyServiceCommonResponseDto checkService(Long policyId, String serviceType){
        return policyServiceCommonRepository.checkService(policyId, serviceType);
    }

    public Boolean checkServiceMap(Long policyId, String serviceType, String newServiceType){
        return policyServiceCommonRepository.checkServiceMap(policyId, serviceType, newServiceType);
    }
}