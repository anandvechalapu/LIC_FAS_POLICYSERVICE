package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FreeLookCancellationResponseDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long freeLookId;
	
	private Long policyId;
	
	private Long serviceId;
	
	private String notesText;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFreeLookId() {
		return freeLookId;
	}

	public void setFreeLookId(Long freeLookId) {
		this.freeLookId = freeLookId;
	}

	public Long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getNotesText() {
		return notesText;
	}

	public void setNotesText(String notesText) {
		this.notesText = notesText;
	}
	
	

}