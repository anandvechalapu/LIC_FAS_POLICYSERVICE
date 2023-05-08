package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class freeLookCancellationDocumentDto {
	
	@Id
	private String documentId;
	private String freeLookId;
	private String modifiedBy;
	
	public String getDocumentId() {
		return documentId;
	}
	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}
	public String getFreeLookId() {
		return freeLookId;
	}
	public void setFreeLookId(String freeLookId) {
		this.freeLookId = freeLookId;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	
	
	
}