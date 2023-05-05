package com.lic.epgs.policyservicing.common.memberlvl.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.memberlvl.model.Transfer;
import com.lic.epgs.policyservicing.common.memberlvl.repository.ApproveMemberlvl1Repository;

@Service
public class ApproveMemberlvl1Service {
	
	@Autowired
	private ApproveMemberlvl1Repository approveMemberlvl1Repository;

	public Optional<Transfer> getTransferDetails(long transferId) {
		return approveMemberlvl1Repository.getTransferDetails(transferId);
	}
	
	public int updateStatusForApproval(String status, long transferId, String modifiedBy) {
		return approveMemberlvl1Repository.updateStatusForApproval(status, transferId, modifiedBy);
	}
	
	public int updateStatusForDestination(String status, long transferId, String modifiedBy) {
		return approveMemberlvl1Repository.updateStatusForDestination(status, transferId, modifiedBy);
	}
	
}