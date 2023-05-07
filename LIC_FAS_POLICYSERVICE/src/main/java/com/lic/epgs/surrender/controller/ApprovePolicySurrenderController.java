package com.lic.epgs.surrender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.surrender.model.PolicySurrenderEntity;
import com.lic.epgs.surrender.model.PolicySurrenderTemporary;
import com.lic.epgs.surrender.service.ApprovePolicySurrenderService;

@RestController
@RequestMapping("/surrender")
public class ApprovePolicySurrenderController {

	@Autowired
	private ApprovePolicySurrenderService approvePolicySurrenderService;

	@PutMapping
	public PolicySurrenderEntity approvePolicySurrender(@RequestBody PolicySurrenderTemporary surrender) {
		int status = approvePolicySurrenderService.updateSurrenderStatus(surrender.getSurrenderStatus(),
				surrender.getModifiedBy(), surrender.getModifiedOn(), surrender.getSurrenderId());
		if (status > 0) {
			int entityStatus = approvePolicySurrenderService.insertToPolicySurrenderEntity(surrender.getSurrenderId(),
					true, surrender.getNotes(), surrender.getDocs(), surrender.getSurrenderPayouts());
			if (entityStatus > 0) {
				int payoutStatus = approvePolicySurrenderService.insertToPolicySurrenderPayoutEntity(
						surrender.getSurrenderPayouts(), surrender.getSurrenderId());
				if (payoutStatus > 0) {
					int docStatus = approvePolicySurrenderService.insertToCommonDocsEntity(surrender.getDocs(),
							surrender.getSurrenderId());
					if (docStatus > 0) {
						int noteStatus = approvePolicySurrenderService.insertToCommonNotesEntity(surrender.getNotes(),
								surrender.getSurrenderId());
						if (noteStatus > 0) {
							int policyStatus = approvePolicySurrenderService.updatePolicyDetails("surrendered",
									surrender.getSurrenderId());
							if (policyStatus > 0) {
								int memberStatus = approvePolicySurrenderService.updateMemberStatus(
										surrender.getSurrenderId());
								if (memberStatus > 0) {
									int mphStatus = approvePolicySurrenderService.updateMphStatus(
											surrender.getSurrenderId());
									if (mphStatus > 0) {
										return approvePolicySurrenderService.findBySurrenderId(
												surrender.getSurrenderId());
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

}