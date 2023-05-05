package com.lic.epgs.policyservicing.common.commoncontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyServiceCommonResponseDto {

	@Id
	private Long policyId;

	private String serviceType;

	private String newServiceType;

	public Long getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Long policyId) {
		this.policyId = policyId;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getNewServiceType() {
		return newServiceType;
	}

	public void setNewServiceType(String newServiceType) {
		this.newServiceType = newServiceType;
	}

}