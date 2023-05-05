package com.lic.epgs.policyservicing.common.memberlvl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionEntity;
import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionDetailsEntity;
import com.lic.epgs.policyservicing.common.memberlvl.service.CommissionService;

@RestController
public class CommissionController {
	
	@Autowired
	private CommissionService commissionService;
	
	@GetMapping("/commission/inprogress")
	public CommissionEntity getInprogressLoad(@RequestParam String role, @RequestParam String unitCode) {
		return commissionService.getInprogressLoad(role, unitCode);
	}
	
	@GetMapping("/commission/inprogressmaker")
	public CommissionDetailsEntity getInprogressMakerLoad(@RequestParam String role, @RequestParam String unitCode) {
		return commissionService.getInprogressMakerLoad(role, unitCode);
	}
	
	@GetMapping("/commissions")
	public List<CommissionEntity> getAllCommissions() {
		return commissionService.getAllCommissions();
	}
	
	@PostMapping("/commission")
	public CommissionEntity saveCommission(@RequestBody CommissionEntity commission) {
		return commissionService.saveCommission(commission);
	}
	
	@PostMapping("/commissiondetails")
	public CommissionDetailsEntity saveCommissionDetails(@RequestBody CommissionDetailsEntity commissionDetails) {
		return commissionService.saveCommissionDetails(commissionDetails);
	}
	
}