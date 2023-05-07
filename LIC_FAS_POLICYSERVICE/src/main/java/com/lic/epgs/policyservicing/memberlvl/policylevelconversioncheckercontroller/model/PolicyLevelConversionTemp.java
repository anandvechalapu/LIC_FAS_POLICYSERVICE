package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyLevelConversionTemp {
	
	@Id
	private String conversionId;
	private String policyNumber;
	private String oldPlan;
	private String newPlan;
	private String customerNumber;
	private String status;
	
	public String getConversionId() {
		return conversionId;
	}
	public void setConversionId(String conversionId) {
		this.conversionId = conversionId;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getOldPlan() {
		return oldPlan;
	}
	public void setOldPlan(String oldPlan) {
		this.oldPlan = oldPlan;
	}
	public String getNewPlan() {
		return newPlan;
	}
	public void setNewPlan(String newPlan) {
		this.newPlan = newPlan;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}