package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.SaveNotedPolicyMeger_PolicyLevelMergerControllerRepository;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.entity.PolicyServiceNotesTempEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyServiceNotesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaveNotedPolicyMeger_PolicyLevelMergerControllerService {

    private final SaveNotedPolicyMeger_PolicyLevelMergerControllerRepository saveNotedPolicyMeger_PolicyLevelMergerControllerRepository;

    @Autowired
    public SaveNotedPolicyMeger_PolicyLevelMergerControllerService(SaveNotedPolicyMeger_PolicyLevelMergerControllerRepository saveNotedPolicyMeger_PolicyLevelMergerControllerRepository) {
        this.saveNotedPolicyMeger_PolicyLevelMergerControllerRepository = saveNotedPolicyMeger_PolicyLevelMergerControllerRepository;
    }

    public PolicyServiceNotesDto saveNotedPolicyMeger(PolicyServiceNotesDto policyServiceNotesDto, Long mergeId) {
        PolicyServiceNotesTempEntity entity = new PolicyServiceNotesTempEntity();
        entity.setMergeId(mergeId);
        entity.setNote(policyServiceNotesDto.getNote());

        PolicyServiceNotesTempEntity savedEntity = saveNotedPolicyMeger_PolicyLevelMergerControllerRepository.save(entity);
        policyServiceNotesDto.setId(savedEntity.getId());
        return policyServiceNotesDto;
    }

}