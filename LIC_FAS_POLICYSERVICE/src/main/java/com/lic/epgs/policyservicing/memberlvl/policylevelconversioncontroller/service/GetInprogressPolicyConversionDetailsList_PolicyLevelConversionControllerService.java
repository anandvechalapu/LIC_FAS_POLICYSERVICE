package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.entity.PolicyLevelConversionDetails;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.repository.GetInprogressPolicyConversionDetailsList_PolicyLevelConversionControllerRepository;

@Service
public class GetInprogressPolicyConversionDetailsList_PolicyLevelConversionControllerService {

    @Autowired
    private GetInprogressPolicyConversionDetailsList_PolicyLevelConversionControllerRepository repository;

    public List<PolicyLevelConversionDetails> getInProgressPolicyConversionDetails(String role, String unitCode) {
        return repository.getInProgressPolicyConversionDetails(role, unitCode);
    }

}