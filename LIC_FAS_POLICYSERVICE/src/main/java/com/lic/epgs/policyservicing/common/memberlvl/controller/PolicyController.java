package com.lic.epgs.policyservicing.common.memberlvl.service;

import java.util.List;

import com.lic.epgs.policyservicing.common.memberlvl.model.PolicyDetails;

public interface PolicyService {
	
	public List<PolicyDetails> getAllPolicies();
	public PolicyDetails getPolicyByPolicyNumber(String policyNumber);
	public void createPolicy(PolicyDetails policy);
	public void updatePolicy(PolicyDetails policy);
	public void deletePolicy(String policyNumber);
	
}

package com.lic.epgs.policyservicing.common.memberlvl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.model.PolicyDetails;
import com.lic.epgs.policyservicing.common.memberlvl.service.PolicyService;

@RestController
@RequestMapping("/policy")
public class PolicyController {
	
	@Autowired
	PolicyService policyService;
	
	@GetMapping("/all")
	public List<PolicyDetails> getAllPolicies(){
		return policyService.getAllPolicies();
	}
	
	@GetMapping("/{policyNumber}")
	public Optional<PolicyDetails> getPolicyByPolicyNumber(@PathVariable String policyNumber){
		return policyService.getPolicyByPolicyNumber(policyNumber);
	}
	
	@PostMapping("/create")
	public void createPolicy(@RequestBody PolicyDetails policy){
		policyService.createPolicy(policy);
	}
	
	@PutMapping("/update")
	public void updatePolicy(@RequestBody PolicyDetails policy){
		policyService.updatePolicy(policy);
	}
	
	@DeleteMapping("/{policyNumber}")
	public void deletePolicy(@PathVariable String policyNumber){
		policyService.deletePolicy(policyNumber);
	}

}