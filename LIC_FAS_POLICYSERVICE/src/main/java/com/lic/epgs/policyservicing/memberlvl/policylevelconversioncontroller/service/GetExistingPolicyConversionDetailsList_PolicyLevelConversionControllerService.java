package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.ExistingPolicyConversionDetails;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.repository.GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerRepository;

@Service
public class GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerService {

    @Autowired
    private GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerRepository existingPolicyConversionDetailsListRepository;
    
    public List<ExistingPolicyConversionDetails> GetExistingPolicyConversionDetailsList_PolicyLevelConversionController(String role, String unitCode) {
        return existingPolicyConversionDetailsListRepository.findByRoleAndUnitCode(role, unitCode);
    }
}