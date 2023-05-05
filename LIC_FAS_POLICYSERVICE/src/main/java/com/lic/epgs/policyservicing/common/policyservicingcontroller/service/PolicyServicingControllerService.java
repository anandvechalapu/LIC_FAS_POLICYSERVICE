package com.lic.epgs.policyservicing.common.policyservicingcontroller.service;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceDocumentDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.repository.PolicyServicingControllerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyServicingControllerService {

    @Autowired
    private PolicyServicingControllerRepository policyServicingControllerRepository;

    public CommonResponseDto savePolicyServiceDocument(PolicyServiceDocumentDto policyServiceDocumentDto) {
        return policyServicingControllerRepository.savePolicyServiceDocument(policyServiceDocumentDto);
    }

}