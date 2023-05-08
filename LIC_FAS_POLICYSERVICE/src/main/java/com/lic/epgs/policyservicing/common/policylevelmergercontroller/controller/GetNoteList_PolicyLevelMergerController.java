package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.GetNoteList_PolicyLevelMergerControllerService;

@RestController
public class GetNoteList_PolicyLevelMergerController {
	
	@Autowired
	private GetNoteList_PolicyLevelMergerControllerService service;
	
	@GetMapping("/getNotelist")
	public PolicyLevelMergerApiResponse getNoteList(@RequestParam("mergeId") String mergeId) {
		return service.getNoteList(mergeId);
	}

}