package com.lic.epgs.policyservicing.common.policyservicingcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicySearchDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.service.PolicyServiceSearchService;

@RestController
@RequestMapping("/policy-services")
public class PolicyServiceSearchController {
	
	@Autowired
	PolicyServiceSearchService policyServiceSearchService;
	
	@PostMapping("/search")
	public CommonResponseDto searchForPolicyServices(@RequestBody PolicySearchDto searchDto){
		return policyServiceSearchService.searchForPolicyServices(searchDto);
	}
	
	@PostMapping("/pagenumber")
	public CommonResponseDto getPolicyServicesByPageNumber(@RequestBody PolicySearchDto searchDto){
		return policyServiceSearchService.getPolicyServicesByPageNumber(searchDto);
	}
	
	@PostMapping("/pagesize")
	public CommonResponseDto getPolicyServicesByPageSize(@RequestBody PolicySearchDto searchDto){
		return policyServiceSearchService.getPolicyServicesByPageSize(searchDto);
	}
	
	@PostMapping("/startdate")
	public CommonResponseDto getPolicyServicesByStartDate(@RequestBody PolicySearchDto searchDto){
		return policyServiceSearchService.getPolicyServicesByStartDate(searchDto);
	}
	
	@PostMapping("/enddate")
	public CommonResponseDto getPolicyServicesByEndDate(@RequestBody PolicySearchDto searchDto){
		return policyServiceSearchService.getPolicyServicesByEndDate(searchDto);
	}
	
	@PostMapping("/servicetype")
	public CommonResponseDto getPolicyServicesByServiceType(@RequestBody PolicySearchDto searchDto){
		return policyServiceSearchService.getPolicyServicesByServiceType(searchDto);
	}
}