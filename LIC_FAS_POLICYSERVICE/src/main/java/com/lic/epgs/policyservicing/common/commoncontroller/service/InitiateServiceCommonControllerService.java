package com.lic.epgs.policyservicing.common.commoncontroller.service;

import com.lic.epgs.policyservicing.common.commoncontroller.repository.InitiateServiceCommonControllerRepository;
import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceCommonResponseDto;
import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitiateServiceCommonControllerService {

    @Autowired
    private InitiateServiceCommonControllerRepository initiateServiceCommonControllerRepository;

    public PolicyServiceCommonResponseDto startService(PolicyServiceDto policyServiceDto, String serviceType) {
        return initiateServiceCommonControllerRepository.startService(policyServiceDto, serviceType);
    }
}