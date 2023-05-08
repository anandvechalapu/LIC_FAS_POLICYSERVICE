package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.freeLookCancellationDocumentDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.RemoveflcDocument_PolicyLevelFreeLookCancelControllerService;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.TransactionStatus;

@RestController
@RequestMapping("/flcDocument")
public class PolicyLevelFreeLookCancelController {

	@Autowired
	private RemoveflcDocument_PolicyLevelFreeLookCancelControllerService 
	removeflcDocument_PolicyLevelFreeLookCancelControllerService;
	
	@DeleteMapping("/{documentId}/{freeLookId}/{modifiedBy}")
	public ResponseEntity<freeLookCancellationDocumentDto> removeFLCDocument(
			@PathVariable("documentId") String documentId, 
			@PathVariable("freeLookId") String freeLookId,
			@PathVariable("modifiedBy") String modifiedBy) {
		freeLookCancellationDocumentDto flcDocumentDto = removeflcDocument_PolicyLevelFreeLookCancelControllerService.removeFLCDocument(documentId, freeLookId, modifiedBy);
		return new ResponseEntity<>(flcDocumentDto, HttpStatus.OK);
	}
	
	@DeleteMapping("/status/{documentId}/{freeLookId}")
	public ResponseEntity<TransactionStatus> removeFlcDocumentStatus(
			@PathVariable("documentId") String documentId, 
			@PathVariable("freeLookId") String freeLookId) {
		TransactionStatus transactionStatus = removeflcDocument_PolicyLevelFreeLookCancelControllerService.removeFlcDocumentStatus(documentId, freeLookId);
		return new ResponseEntity<>(transactionStatus, HttpStatus.OK);
	}
	
	
}