package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.PolicyLevelConversion;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.GetInprogressPolicyConversionDetailsList_PolicyLevelConversionControllerRepository;

@Service
public class GetInprogressPolicyConversionDetailsList_PolicyLevelConversionControllerService {
    
    @Autowired
    private GetInprogressPolicyConversionDetailsList_PolicyLevelConversionControllerRepository repository;
    
    public List<PolicyLevelConversion> getInprogressPolicyConversionDetailsList(String role, String unitCode) {
        return repository.getInprogressPolicyConversionDetailsList(role, unitCode);
    }

}