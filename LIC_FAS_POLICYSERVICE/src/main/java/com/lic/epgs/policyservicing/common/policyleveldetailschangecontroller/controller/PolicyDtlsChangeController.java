package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service;

import java.util.List;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyDtlsChangeTempEntity;

public interface PolicyDtlsChangeTempService {

	PolicyDtlsChangeTempEntity savePolicyDtlsChangeTemp(PolicyDtlsChangeTempEntity entity);

	List<PolicyDtlsChangeTempEntity> findAllByPolicyId(Long policyId);

	PolicyDtlsChangeTempEntity updatePolicyDtlsChangeTemp(PolicyDtlsChangeTempEntity entity);

}

package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyDtlsChangeTempEntity;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.PolicyDtlsChangeTempService;

@RestController
@RequestMapping("/policydtlschange")
public class PolicyDtlsChangeController {

	@Autowired
	private PolicyDtlsChangeTempService policyDtlsChangeTempService;

	@PostMapping("/save")
	public ResponseEntity<PolicyDtlsChangeTempEntity> savePolicyDtlsChangeTemp(@RequestBody PolicyDtlsChangeTempEntity entity) {
		return new ResponseEntity<>(policyDtlsChangeTempService.savePolicyDtlsChangeTemp(entity), HttpStatus.OK);
	}

	@GetMapping("/find/{policyId}")
	public ResponseEntity<List<PolicyDtlsChangeTempEntity>> findAllByPolicyId(@PathVariable Long policyId) {
		return new ResponseEntity<>(policyDtlsChangeTempService.findAllByPolicyId(policyId), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<PolicyDtlsChangeTempEntity> updatePolicyDtlsChangeTemp(@RequestBody PolicyDtlsChangeTempEntity entity) {
		return new ResponseEntity<>(policyDtlsChangeTempService.updatePolicyDtlsChangeTemp(entity), HttpStatus.OK);
	}

}