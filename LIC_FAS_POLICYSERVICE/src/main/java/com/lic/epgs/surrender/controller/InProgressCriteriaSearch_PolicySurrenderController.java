package com.lic.epgs.surrender.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.surrender.model.CommonResponseDto;
import com.lic.epgs.surrender.service.InProgressCriteriaSearch_PolicySurrenderService;

@RestController
public class InProgressCriteriaSearch_PolicySurrenderController {

	private InProgressCriteriaSearch_PolicySurrenderService search_PolicySurrenderService;
	
	public InProgressCriteriaSearch_PolicySurrenderController(InProgressCriteriaSearch_PolicySurrenderService search_PolicySurrenderService) {
		this.search_PolicySurrenderService = search_PolicySurrenderService;
	}
	
	@GetMapping("/searchPolicySurrenders")
	public CommonResponseDto searchInProgressPolicySurrenders(@RequestParam String policyNo, @RequestParam String mphCode, @RequestParam String mphName, @RequestParam String surrenderStatus, @RequestParam String product, @RequestParam String unitCode, @RequestParam String role, @RequestParam String fromDate, @RequestParam String toDate, @RequestParam Integer pageCount, @RequestParam Integer limit) {
		return search_PolicySurrenderService.searchInProgressPolicySurrenders(policyNo, mphCode, mphName, surrenderStatus, product, unitCode, role, fromDate, toDate, pageCount, limit);
	}
}