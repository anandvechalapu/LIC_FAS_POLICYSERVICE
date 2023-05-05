package com.lic.epgs.policyservicing.common.memberlvl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutMasterEntity;
import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutMemberTempEntity;
import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutTempEntity;
import com.lic.epgs.policyservicing.common.memberlvl.service.RejectMemberlvl16Service;

@RestController
@RequestMapping("/policyservicing/memberlvl")
public class RejectMemberlvl16Controller {
	
	@Autowired
	private RejectMemberlvl16Service rejectMemberlvl16Service;
	
	@GetMapping("/findByUnitCodeAndTransferId")
	public ResponseEntity<List<TransferInAndOutTempEntity>> findByUnitCodeAndTransferId(String unitCode, Long transferId) {
		List<TransferInAndOutTempEntity> transferInAndOutTempEntities = rejectMemberlvl16Service.findByUnitCodeAndTransferId(unitCode, transferId);
		return new ResponseEntity<List<TransferInAndOutTempEntity>>(transferInAndOutTempEntities, HttpStatus.OK);
	}
	
	@PostMapping("/saveTransferInAndOutMasterEntity")
	public ResponseEntity<TransferInAndOutMasterEntity> saveTransferInAndOutMasterEntity(@RequestBody TransferInAndOutMasterEntity transferInAndOutMasterEntity) {
		TransferInAndOutMasterEntity savedTransferInAndOutMasterEntity = rejectMemberlvl16Service.saveTransferInAndOutMasterEntity(transferInAndOutMasterEntity);
		return new ResponseEntity<TransferInAndOutMasterEntity>(savedTransferInAndOutMasterEntity, HttpStatus.OK);
	}
	
	@PostMapping("/saveTransferInAndOutMemberTempEntity")
	public ResponseEntity<TransferInAndOutMemberTempEntity> saveTransferInAndOutMemberTempEntity(@RequestBody TransferInAndOutMemberTempEntity transferInAndOutMemberTempEntity) {
		TransferInAndOutMemberTempEntity savedTransferInAndOutMemberTempEntity = rejectMemberlvl16Service.saveTransferInAndOutMemberTempEntity(transferInAndOutMemberTempEntity);
		return new ResponseEntity<TransferInAndOutMemberTempEntity>(savedTransferInAndOutMemberTempEntity, HttpStatus.OK);
	}
	
	@PostMapping("/saveTransferInAndOutTempEntity")
	public ResponseEntity<TransferInAndOutTempEntity> saveTransferInAndOutTempEntity(@RequestBody TransferInAndOutTempEntity transferInAndOutTempEntity) {
		TransferInAndOutTempEntity savedTransferInAndOutTempEntity = rejectMemberlvl16Service.saveTransferInAndOutTempEntity(transferInAndOutTempEntity);
		return new ResponseEntity<TransferInAndOutTempEntity>(savedTransferInAndOutTempEntity, HttpStatus.OK);
	}
	
}