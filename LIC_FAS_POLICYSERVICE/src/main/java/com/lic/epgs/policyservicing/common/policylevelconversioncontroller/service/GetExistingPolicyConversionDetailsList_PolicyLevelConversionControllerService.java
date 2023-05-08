package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerService {

    @Autowired
    private GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerRepository existingPolicyConversionDetailsList_PolicyLevelConversionControllerRepository;

    public List<Object> getExistingPolicyConversionDetailsList(String role, String unitCode) throws Exception {
        return existingPolicyConversionDetailsList_PolicyLevelConversionControllerRepository.getExistingPolicyConversionDetailsList(role, unitCode);
    }
}