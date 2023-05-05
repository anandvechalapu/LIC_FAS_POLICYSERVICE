package com.lic.epgs.policyservicing.common.memberlvl.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POLICY_DETAILS")
public class PolicyDetails {
	
	@Id
	private String policyNumber;
	private String policyHolderName;
	private String policyHolderDOB;
	private String policyHolderAddress;
	private String policyType;
	private String policyStartDate;
	private Double policyAmount;
	private String transactionStatus;
	private String transactionMessage;
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public String getPolicyHolderDOB() {
		return policyHolderDOB;
	}
	public void setPolicyHolderDOB(String policyHolderDOB) {
		this.policyHolderDOB = policyHolderDOB;
	}
	public String getPolicyHolderAddress() {
		return policyHolderAddress;
	}
	public void setPolicyHolderAddress(String policyHolderAddress) {
		this.policyHolderAddress = policyHolderAddress;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public String getPolicyStartDate() {
		return policyStartDate;
	}
	public void setPolicyStartDate(String policyStartDate) {
		this.policyStartDate = policyStartDate;
	}
	public Double getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(Double policyAmount) {
		this.policyAmount = policyAmount;
	}
	public String getTransactionStatus() {
		return transactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}
	public String getTransactionMessage() {
		return transactionMessage;
	}
	public void setTransactionMessage(String transactionMessage) {
		this.transactionMessage = transactionMessage;
	}
}