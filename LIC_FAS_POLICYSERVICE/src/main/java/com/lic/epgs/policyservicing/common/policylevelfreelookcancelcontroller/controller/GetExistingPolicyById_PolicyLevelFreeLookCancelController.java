package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.ExistingPolicy;

public interface GetExistingPolicyById_PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<ExistingPolicy, Long>{

	ExistingPolicy findByPolicyNumber(String policyNumber);
	ExistingPolicy findByMembersName(String name);
	ExistingPolicy findByAdjustmentsAdjustmentNumber(String adjustmentNumber);
	ExistingPolicy findByPolicyDispatchDate(String dispatchDate);
	ExistingPolicy findByPolicyRecievedDate(String recievedDate);
	ExistingPolicy findByTotalContribution(String totalContribution);
	ExistingPolicy findByTransactionMessage(String message);
	ExistingPolicy findByTransactionStatus(String status);
	
}

package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.ExistingPolicy;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.GetExistingPolicyById_PolicyLevelFreeLookCancelControllerService;

@RestController
@RequestMapping("/policy")
public class GetExistingPolicyById_PolicyLevelFreeLookCancelController {

	@Autowired
	GetExistingPolicyById_PolicyLevelFreeLookCancelControllerService existingPolicyService;
	
	@GetMapping("/existing/{policyNumber}")
	public Optional<ExistingPolicy> getExistingPolicyByPolicyNumber(@PathVariable("policyNumber") String policyNumber){
		return existingPolicyService.findByPolicyNumber(policyNumber);
	}
	
	@GetMapping("/existing/name/{name}")
	public Optional<ExistingPolicy> getExistingPolicyByName(@PathVariable("name") String name){
		return existingPolicyService.findByMembersName(name);
	}
	
	@GetMapping("/existing/adjustment/{adjustmentNumber}")
	public Optional<ExistingPolicy> getExistingPolicyByAdjustmentNumber(@PathVariable("adjustmentNumber") String adjustmentNumber){
		return existingPolicyService.findByAdjustmentsAdjustmentNumber(adjustmentNumber);
	}
	
	@GetMapping("/existing/dispatch/{dispatchDate}")
	public Optional<ExistingPolicy> getExistingPolicyByDispatchDate(@PathVariable("dispatchDate") String dispatchDate){
		return existingPolicyService.findByPolicyDispatchDate(dispatchDate);
	}
	
	@GetMapping("/existing/recieved/{recievedDate}")
	public Optional<ExistingPolicy> getExistingPolicyByRecievedDate(@PathVariable("recievedDate") String recievedDate){
		return existingPolicyService.findByPolicyRecievedDate(recievedDate);
	}
	
	@GetMapping("/existing/contribution/{totalContribution}")
	public Optional<ExistingPolicy> getExistingPolicyByTotalContribution(@PathVariable("totalContribution") String totalContribution){
		return existingPolicyService.findByTotalContribution(totalContribution);
	}
	
	@GetMapping("/existing/message/{message}")
	public Optional<ExistingPolicy> getExistingPolicyByMessage(@PathVariable("message") String message){
		return existingPolicyService.findByTransactionMessage(message);
	}
	
	@GetMapping("/existing/status/{status}")
	public Optional<ExistingPolicy> getEx