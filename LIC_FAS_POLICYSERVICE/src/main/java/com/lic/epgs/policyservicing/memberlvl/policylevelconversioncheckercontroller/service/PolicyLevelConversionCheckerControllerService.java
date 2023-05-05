package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.service;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.entity.PolicyLevelConversionEntity;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.entity.PolicyLevelConversionTempEntity;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.repository.PolicyLevelConversionCheckerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PolicyLevelConversionCheckerControllerService {

    @Autowired
    private PolicyLevelConversionCheckerControllerRepository policyLevelConversionCheckerControllerRepository;

    public void updateConversionStatus(Long conversionId) {
        policyLevelConversionCheckerControllerRepository.updateConversionStatus(conversionId);
    }

    public void updateConversionWorkflowStatus(Long conversionId, String modifiedBy) {
        policyLevelConversionCheckerControllerRepository.updateConversionWorkflowStatus(conversionId, modifiedBy);
    }

    public PolicyLevelConversionEntity checkIfExists(Long prevPolicyId) {
        return policyLevelConversionCheckerControllerRepository.checkIfExists(prevPolicyId);
    }

    @Transactional
    public void saveNewPolicyLevelConversionEntity(Long conversionId) {
        policyLevelConversionCheckerControllerRepository.saveNewPolicyLevelConversionEntity(conversionId);
    }

    @Transactional
    public void saveNewPolicyServiceDocumentEntity(Long conversionId) {
        policyLevelConversionCheckerControllerRepository.saveNewPolicyServiceDocumentEntity(conversionId);
    }

    @Transactional
    public void saveNewPolicyServiceNotesEntity(Long serviceId) {
        policyLevelConversionCheckerControllerRepository.saveNewPolicyServiceNotesEntity(serviceId);
    }

}