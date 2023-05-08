package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyServiceNotesTempEntity;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.SaveNotesDetails_PolicyLevelDetailsChangeControllerService;

@RestController
@RequestMapping("/policyleveldetailschangecontroller")
public class SaveNotesDetails_PolicyLevelDetailsChangeControllerController {

	@Autowired
	private SaveNotesDetails_PolicyLevelDetailsChangeControllerService saveNotesDetails_PolicyLevelDetailsChangeControllerService;
	
	@PostMapping("/savenotes")
	public PolicyServiceNotesTempEntity saveNotes(@RequestBody PolicyServiceNotesTempEntity policyServiceNotesTempEntity) {
		return saveNotesDetails_PolicyLevelDetailsChangeControllerService.save(policyServiceNotesTempEntity);
	}
	
	@GetMapping("/findnotes")
	public PolicyServiceNotesTempEntity findByPolicyId(Integer policyId) {
		return saveNotesDetails_PolicyLevelDetailsChangeControllerService.findByPolicyId(policyId);
	}
}