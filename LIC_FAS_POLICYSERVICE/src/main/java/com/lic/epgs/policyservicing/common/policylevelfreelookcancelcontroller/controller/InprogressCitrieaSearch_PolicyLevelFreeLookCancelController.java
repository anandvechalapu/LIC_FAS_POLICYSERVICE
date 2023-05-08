package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationSearchDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.InprogressCitrieaSearch_PolicyLevelFreeLookCancelControllerService;

@RestController
public class InprogressCitrieaSearch_PolicyLevelFreeLookCancelController {
	
	@Autowired
	private InprogressCitrieaSearch_PolicyLevelFreeLookCancelControllerService service;

	// API endpoint to search for in-progress free-look cancellation policies
	@PostMapping("/inprogress-freelookcancellation-policies")
	public List<FreeLookCancellationResponseDto> searchInProgressFreeLookCancellationPolicies(@RequestBody FreeLookCancellationSearchDto searchDto) {
		return service.searchInProgressFreeLookCancellationPolicies(searchDto);
	}

	// API endpoint to search for in-progress free-look cancellation policies based on maker role
	@PostMapping("/inprogress-freelookcancellation-policies-by-maker-role")
	public List<FreeLookCancellationResponseDto> searchInProgressFreeLookCancellationPoliciesByMakerRole(@RequestBody FreeLookCancellationSearchDto searchDto) {
		return service.searchInProgressFreeLookCancellationPoliciesByMakerRole(searchDto);
	}

	// API endpoint to search for in-progress free-look cancellation policies based on checker role
	@PostMapping("/inprogress-freelookcancellation-policies-by-checker-role")
	public List<FreeLookCancellationResponseDto> searchInProgressFreeLookCancellationPoliciesByCheckerRole(@RequestBody FreeLookCancellationSearchDto searchDto) {
		return service.searchInProgressFreeLookCancellationPoliciesByCheckerRole(searchDto);
	}

}