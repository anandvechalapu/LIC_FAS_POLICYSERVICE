package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyLevelDetailsChangeController;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.SendToRejectPolicyLevelDetailsChangeControllerService;

@RestController
@RequestMapping("/policyleveldetailschangecontroller")
public class PolicyLevelDetailsChangeControllerController {

	@Autowired
	private SendToRejectPolicyLevelDetailsChangeControllerService sendToRejectPolicyLevelDetailsChangeControllerService;
	
	@GetMapping("/{policyDtlsId}")
	public Optional<PolicyLevelDetailsChangeController> findByPolicyDtlsId(@PathVariable Integer policyDtlsId) {
		return sendToRejectPolicyLevelDetailsChangeControllerService.findByPolicyDtlsId(policyDtlsId);
	}
	
	@PostMapping("/update")
	public int updatePolicyStatusAndRejectionRemarksAndReasonCode(@RequestBody PolicyLevelDetailsChangeController policyLevelDetailsChangeController) {
		return sendToRejectPolicyLevelDetailsChangeControllerService.updatePolicyStatusAndRejectionRemarksAndReasonCode(
				policyLevelDetailsChangeController.getPolicyDtlsId(), policyLevelDetailsChangeController.getRejectionRemarks(), policyLevelDetailsChangeController.getReasonCode());
	}
	
	@PostMapping("/insert")
	public int insertPolicyDtlsIdAndRejectionRemarksAndReasonCode(@RequestBody PolicyLevelDetailsChangeController policyLevelDetailsChangeController) {
		return sendToRejectPolicyLevelDetailsChangeControllerService.insertPolicyDtlsIdAndRejectionRemarksAndReasonCode(
				policyLevelDetailsChangeController.getPolicyDtlsId(), policyLevelDetailsChangeController.getRejectionRemarks(), policyLevelDetailsChangeController.getReasonCode());
	}
	
	@GetMapping("/find/{policyDtlsId}")
	public Integer findPolicyDtlsIdByPolicyDtlsId(@PathVariable Integer policyDtlsId) {
		return sendToRejectPolicyLevelDetailsChangeControllerService.findPolicyDtlsIdByPolicyDtlsId(policyDtlsId);
	}
}