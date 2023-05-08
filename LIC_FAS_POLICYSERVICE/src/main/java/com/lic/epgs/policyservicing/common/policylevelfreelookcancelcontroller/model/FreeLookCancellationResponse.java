package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model;

import javax.persistence.*;

@Entity
@Table(name = "freelook_cancellation_response")
public class FreeLookCancellationResponse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long freeLookCancellationId;

	@Column(name = "policy_number")
	private String policyNumber;

	@Column(name = "free_look_cancellation_status")
	private String freeLookCancellationStatus;

	@Column(name = "rejection_reason")
	private String rejectionReason;
	
	public Long getFreeLookCancellationId() {
		return freeLookCancellationId;
	}
	
	public void setFreeLookCancellationId(Long freeLookCancellationId) {
		this.freeLookCancellationId = freeLookCancellationId;
	}
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	
	public String getFreeLookCancellationStatus() {
		return freeLookCancellationStatus;
	}
	
	public void setFreeLookCancellationStatus(String freeLookCancellationStatus) {
		this.freeLookCancellationStatus = freeLookCancellationStatus;
	}
	
	public String getRejectionReason() {
		return rejectionReason;
	}
	
	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

}