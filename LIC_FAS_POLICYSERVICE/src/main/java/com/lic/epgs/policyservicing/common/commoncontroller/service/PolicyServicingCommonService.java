package com.lic.epgs.policyservicing.common.commoncontroller.service;

import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceCommonResponseDto;
import com.lic.epgs.policyservicing.common.commoncontroller.repository.PolicyServicingCommonRepository;
import org.springframework.stereotype.Service;

@Service
public class PolicyServicingCommonService {

    private final PolicyServicingCommonRepository policyServicingCommonRepository;

    public PolicyServicingCommonService(PolicyServicingCommonRepository policyServicingCommonRepository) {
        this.policyServicingCommonRepository = policyServicingCommonRepository;
    }

    public PolicyServiceCommonResponseDto getServiceDetailsByPolicyId(Long policyId) {
        return policyServicingCommonRepository.getServiceDetailsByPolicyId(policyId);
    }

}