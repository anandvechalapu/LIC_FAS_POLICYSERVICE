package com.lic.epgs.policyservicing.common.memberlvl.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.model.Transfer;
import com.lic.epgs.policyservicing.common.memberlvl.service.ApproveMemberlvl1Service;

@RestController
@RequestMapping("/api/v1/transfers")
public class ApproveMemberlvl1Controller {
	
	@Autowired
	private ApproveMemberlvl1Service approveMemberlvl1Service;
	
	@GetMapping("/{transferId}")
	public Optional<Transfer> getTransferDetails(@PathVariable long transferId) {
		return approveMemberlvl1Service.getTransferDetails(transferId);
	}
	
	@PutMapping("/approve/{transferId}")
	public int updateStatusForApproval(@PathVariable long transferId, String modifiedBy) {
		return approveMemberlvl1Service.updateStatusForApproval("APPROVED", transferId, modifiedBy);
	}
	
	@PutMapping("/destination/{transferId}")
	public int updateStatusForDestination(@PathVariable long transferId, String modifiedBy) {
		return approveMemberlvl1Service.updateStatusForDestination("COMPLETED", transferId, modifiedBy);
	}

}