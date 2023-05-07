package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.service;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.PolicyConversionDetails;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.repository.GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerService {
    
    @Autowired
    GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerRepository repo;

    public List<PolicyConversionDetails> getExistingPolicyConversionDetailsList(String role, String unitCode){
        return repo.getExistingPolicyConversionDetailsList(role, unitCode);
    }

}