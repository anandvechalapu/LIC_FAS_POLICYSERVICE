package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyServiceNotesTempEntity;

@Repository
public interface SaveNotesDetails_PolicyLevelDetailsChangeControllerRepo extends JpaRepository<PolicyServiceNotesTempEntity, Integer> {
	
	public PolicyServiceNotesTempEntity save(PolicyServiceNotesTempEntity policyServiceNotesTempEntity);
	
	public PolicyServiceNotesTempEntity findByPolicyId(Integer policyId);

}