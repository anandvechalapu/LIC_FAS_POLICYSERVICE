package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyServiceNotesTempEntity;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository.SaveNotesDetails_PolicyLevelDetailsChangeControllerRepo;

@Service
public class SaveNotesDetails_PolicyLevelDetailsChangeControllerService {

	@Autowired
	private SaveNotesDetails_PolicyLevelDetailsChangeControllerRepo  saveNotesDetails_PolicyLevelDetailsChangeControllerRepo;
	
	public PolicyServiceNotesTempEntity save(PolicyServiceNotesTempEntity policyServiceNotesTempEntity) {
		return saveNotesDetails_PolicyLevelDetailsChangeControllerRepo.save(policyServiceNotesTempEntity);
	}
	
	public PolicyServiceNotesTempEntity findByPolicyId(Integer policyId) {
		return saveNotesDetails_PolicyLevelDetailsChangeControllerRepo.findByPolicyId(policyId);
	}
}