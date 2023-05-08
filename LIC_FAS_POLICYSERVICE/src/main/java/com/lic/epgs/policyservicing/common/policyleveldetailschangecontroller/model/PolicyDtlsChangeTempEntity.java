package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy_dtls_change_temp")
public class PolicyDtlsChangeTempEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "policy_dtls_id")
	private Long policyDtlsId;

	@Column(name = "policy_id")
	private Long policyId;

	@Column(name = "status")
	private String status;

	@Column(name = "created_on")
	private Date createdOn;

	@Column(name = "modified_on")
	private Date modifiedOn;

	public Long getPolicyDtlsId() {
		return policyDtlsId;
	}

	public void setPolicyDtlsId(Long policyDtlsId) {
		this.policyDtlsId = policyDtlsId;
	}

	public Long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

}