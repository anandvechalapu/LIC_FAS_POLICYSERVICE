package com.lic.epgs.policyservicing.common.memberlvl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutMasterEntity;
import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutMemberTempEntity;
import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutTempEntity;
import com.lic.epgs.policyservicing.common.memberlvl.repository.RejectMemberlvl16Repository;

@Service
public class RejectMemberlvl16Service {

	@Autowired
	private RejectMemberlvl16Repository rejectMemberlvl16Repository;
	
	public List<TransferInAndOutTempEntity> findByUnitCodeAndTransferId(String unitCode, Long transferId) {
		return rejectMemberlvl16Repository.findByUnitCodeAndTransferId(unitCode, transferId);
	}
	
	public TransferInAndOutMasterEntity saveTransferInAndOutMasterEntity(TransferInAndOutMasterEntity transferInAndOutMasterEntity) {
		return rejectMemberlvl16Repository.save(transferInAndOutMasterEntity);
	}
	
	public TransferInAndOutMemberTempEntity saveTransferInAndOutMemberTempEntity(TransferInAndOutMemberTempEntity transferInAndOutMemberTempEntity) {
		return rejectMemberlvl16Repository.save(transferInAndOutMemberTempEntity);
	}
	
	public TransferInAndOutTempEntity saveTransferInAndOutTempEntity(TransferInAndOutTempEntity transferInAndOutTempEntity) {
		return rejectMemberlvl16Repository.save(transferInAndOutTempEntity);
	}
}