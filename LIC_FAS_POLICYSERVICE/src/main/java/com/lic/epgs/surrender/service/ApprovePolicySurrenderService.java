package com.lic.epgs.surrender.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.surrender.model.PolicySurrenderEntity;
import com.lic.epgs.surrender.model.PolicySurrenderTemporary;
import com.lic.epgs.surrender.repository.ApprovePolicySurrenderRepository;

@Service
public class ApprovePolicySurrenderService {

	@Autowired
	private ApprovePolicySurrenderRepository approvePolicySurrenderRepository;

	public int updateSurrenderStatus(String surrenderStatus, String modifiedBy, String modifiedOn,
			String surrenderId) {
		return approvePolicySurrenderRepository.updateSurrenderStatus(surrenderStatus, modifiedBy, modifiedOn,
				surrenderId);
	}

	public int insertToPolicySurrenderEntity(String surrenderId, boolean isActive, String notes, String docs,
			String surrenderPayouts) {
		return approvePolicySurrenderRepository.insertToPolicySurrenderEntity(surrenderId, isActive, notes, docs,
				surrenderPayouts);
	}

	public int insertToPolicySurrenderPayoutEntity(String payoutId, String surrenderId) {
		return approvePolicySurrenderRepository.insertToPolicySurrenderPayoutEntity(payoutId, surrenderId);
	}

	public int insertToCommonDocsEntity(String docId, String surrenderId) {
		return approvePolicySurrenderRepository.insertToCommonDocsEntity(docId, surrenderId);
	}

	public int insertToCommonNotesEntity(String noteId, String surrenderId) {
		return approvePolicySurrenderRepository.insertToCommonNotesEntity(noteId, surrenderId);
	}

	public int updatePolicyDetails(String policyDetails, String policyId) {
		return approvePolicySurrenderRepository.updatePolicyDetails(policyDetails, policyId);
	}

	public int updateMemberStatus(String policyId) {
		return approvePolicySurrenderRepository.updateMemberStatus(policyId);
	}

	public int updateMphStatus(String policyId) {
		return approvePolicySurrenderRepository.updateMphStatus(policyId);
	}

	public PolicySurrenderEntity findBySurrenderId(String surrenderId) {
		Optional<PolicySurrenderEntity> policySurrenderEntity = approvePolicySurrenderRepository
				.findBySurrenderId(surrenderId);
		if (policySurrenderEntity.isPresent())
			return policySurrenderEntity.get();
		return null;
	}

}