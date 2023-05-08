package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyServiceNotesTempEntity;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository.SaveNotesDetails_PolicyLevelDetailsChangeControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveNotesDetails_PolicyLevelDetailsChangeControllerService {

    @Autowired
    SaveNotesDetails_PolicyLevelDetailsChangeControllerRepository saveNotesDetails_PolicyLevelDetailsChangeControllerRepository;

    public void saveNotesDetails(PolicyServiceNotesTempEntity policyServiceNotesTempEntity) {
        saveNotesDetails_PolicyLevelDetailsChangeControllerRepository.save(policyServiceNotesTempEntity);
    }

    public void setPolicyServiceNotesActive(Long policyId) {
        saveNotesDetails_PolicyLevelDetailsChangeControllerRepository.setPolicyServiceNotesActive(policyId);
    }

}