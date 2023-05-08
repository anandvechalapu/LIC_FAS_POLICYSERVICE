package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyLevelDetailsChangeController;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository.SendToRejectPolicyLevelDetailsChangeControllerRepository;

@Service
public class SendToRejectPolicyLevelDetailsChangeControllerService {

	@Autowired
	private SendToRejectPolicyLevelDetailsChangeControllerRepository sendToRejectPolicyLevelDetailsChangeControllerRepository;
	
	@Transactional
	public int updatePolicyStatusAndRejectionRemarksAndReasonCode(Integer policyDtlsId, String rejectionRemarks, String reasonCode) {
		return sendToRejectPolicyLevelDetailsChangeControllerRepository.updatePolicyStatusAndRejectionRemarksAndReasonCode(policyDtlsId, rejectionRemarks, reasonCode);
	}
	
	public Optional<PolicyLevelDetailsChangeController> findByPolicyDtlsId(Integer policyDtlsId) {
		return sendToRejectPolicyLevelDetailsChangeControllerRepository.findByPolicyDtlsId(policyDtlsId);
	}
	
	@Transactional
	public int insertPolicyDtlsIdAndRejectionRemarksAndReasonCode(Integer policyDtlsId, String rejectionRemarks, String reasonCode) {
		return sendToRejectPolicyLevelDetailsChangeControllerRepository.insertPolicyDtlsIdAndRejectionRemarksAndReasonCode(policyDtlsId, rejectionRemarks, reasonCode);
	}
	
	public Integer findPolicyDtlsIdByPolicyDtlsId(Integer policyDtlsId) {
		return sendToRejectPolicyLevelDetailsChangeControllerRepository.findPolicyDtlsIdByPolicyDtlsId(policyDtlsId);
	}
}