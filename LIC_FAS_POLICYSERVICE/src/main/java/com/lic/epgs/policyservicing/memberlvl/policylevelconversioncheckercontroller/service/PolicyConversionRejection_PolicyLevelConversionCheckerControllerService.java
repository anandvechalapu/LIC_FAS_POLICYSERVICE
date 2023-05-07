package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.PolicyLevelConversionTempEntity;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.repository.PolicyConversionRejection_PolicyLevelConversionCheckerControllerRepository;

@Service
public class PolicyConversionRejection_PolicyLevelConversionCheckerControllerService {

    @Autowired
    private PolicyConversionRejection_PolicyLevelConversionCheckerControllerRepository policyConversionRejection_PolicyLevelConversionCheckerControllerRepository;

    public PolicyLevelConversionTempEntity findByConversionId(String conversionId) {
        return policyConversionRejection_PolicyLevelConversionCheckerControllerRepository.findByConversionId(conversionId);
    }

    public PolicyLevelConversionTempEntity save(PolicyLevelConversionTempEntity policyLevelConversionTempEntity) {
        return policyConversionRejection_PolicyLevelConversionCheckerControllerRepository.save(policyLevelConversionTempEntity);
    }

    public int updatePolicyLevelConversionTempEntity(String conversionId, String rejectionReasonCode, String remarks, String modifiedBy, String modifiedOn) {
        return policyConversionRejection_PolicyLevelConversionCheckerControllerRepository.updatePolicyLevelConversionTempEntity(conversionId, rejectionReasonCode, remarks, modifiedBy, modifiedOn);
    }

    public int updatePolicyLevelConversionEntity(String conversionId, String rejectionReasonCode, String modifiedBy, String modifiedOn) {
        return policyConversionRejection_PolicyLevelConversionCheckerControllerRepository.updatePolicyLevelConversionEntity(conversionId, rejectionReasonCode, modifiedBy, modifiedOn);
    }
}