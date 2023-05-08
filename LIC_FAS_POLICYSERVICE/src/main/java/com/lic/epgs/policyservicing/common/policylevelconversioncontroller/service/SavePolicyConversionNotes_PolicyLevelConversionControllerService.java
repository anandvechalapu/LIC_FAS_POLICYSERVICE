package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.PolicyServiceNotesTempEntity;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.SavePolicyConversionNotes_PolicyLevelConversionControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SavePolicyConversionNotes_PolicyLevelConversionControllerService {

    @Autowired
    private SavePolicyConversionNotes_PolicyLevelConversionControllerRepository savePolicyConversionNotes_PolicyLevelConversionControllerRepository;

    public Optional<PolicyServiceNotesTempEntity> getPolicyServiceNotesTempEntityByPolicyId(String policyId){
        return savePolicyConversionNotes_PolicyLevelConversionControllerRepository.findByPolicyId(policyId);
    }

    public PolicyServiceNotesTempEntity savePolicyServiceNotesTempEntity(PolicyServiceNotesTempEntity policyServiceNotesTempEntity){
        return savePolicyConversionNotes_PolicyLevelConversionControllerRepository.save(policyServiceNotesTempEntity);
    }

}