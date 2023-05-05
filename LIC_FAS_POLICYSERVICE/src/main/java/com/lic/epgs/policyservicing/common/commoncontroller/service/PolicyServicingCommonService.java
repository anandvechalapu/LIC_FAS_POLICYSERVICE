package com.lic.epgs.policyservicing.common.commoncontroller.service;

import com.lic.epgs.policyservicing.common.commoncontroller.entity.PolicyServiceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.commoncontroller.repository.PolicyServicingCommonRepository;

@Service
public class PolicyServicingCommonService {

    @Autowired
    private PolicyServicingCommonRepository policyServicingCommonRepository;

    public Long getSequence() {
        return policyServicingCommonRepository.getSequence();
    }

    public PolicyServiceEntity findByPolicyIdAndServiceType(String policyId, String serviceType) {
        return policyServicingCommonRepository.findByPolicyIdAndServiceType(policyId, serviceType);
    }

}