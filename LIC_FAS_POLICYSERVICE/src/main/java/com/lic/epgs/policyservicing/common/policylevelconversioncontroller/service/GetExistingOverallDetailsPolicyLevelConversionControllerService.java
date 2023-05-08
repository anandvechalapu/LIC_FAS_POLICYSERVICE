package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.GetExistingOverallDetailsPolicyLevelConversionControllerRepository;

@Service
public class GetExistingOverallDetailsPolicyLevelConversionControllerService {

    @Autowired
    GetExistingOverallDetailsPolicyLevelConversionControllerRepository getExistingOverallDetailsPolicyLevelConversionControllerRepository;

    public Object getExistingOverallDetails(Long serviceId) {
        return getExistingOverallDetailsPolicyLevelConversionControllerRepository.getExistingOverallDetails(serviceId);
    }

}