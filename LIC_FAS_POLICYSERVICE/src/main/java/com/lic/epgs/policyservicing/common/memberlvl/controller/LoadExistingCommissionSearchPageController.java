package com.lic.epgs.policyservicing.common.memberlvl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionSearchPage;
import com.lic.epgs.policyservicing.common.memberlvl.service.LoadExistingCommissionSearchPageService;

@RestController
public class LoadExistingCommissionSearchPageController {

	@Autowired
	private LoadExistingCommissionSearchPageService loadExistingCommissionSearchPageService;
	
	@GetMapping("/LoadExistingCommissionSearchPage")
	public CommissionSearchPage getCommissionSearchPage(@RequestParam String unitCode) {
		return loadExistingCommissionSearchPageService.findByUnitCode(unitCode).orElse(null);
	}
	
}