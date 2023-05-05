package com.lic.epgs.policyservicing.common.commoncontroller.service;

import com.lic.epgs.policyservicing.common.commoncontroller.repository.PolicyServicingCommonRepository;
import com.lic.epgs.policyservicing.common.commoncontroller.model.ServiceDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PolicyServicingCommonService {
 
    @Autowired
    private PolicyServicingCommonRepository policyServicingCommonRepository;
 
    public Optional<ServiceDetails> getServiceDetailsById(Long serviceId) {
        return policyServicingCommonRepository.findById(serviceId);
    }
}