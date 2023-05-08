// Generated Entity/Model class
package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "save_bank_details_policy_level_details_change_controller")
public class SaveBankDetails_PolicyLevelDetailsChangeController {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long mphBankId;
	private String bankName;
	private String accountNumber;
	private String ifscCode;
	private String bankAddress;
	private Date startTime;
	private Date endTime;
	private boolean isActive;
	private boolean isDefault;

	public Long getMphBankId() {
		return mphBankId;
	}

	public void setMphBankId(Long mphBankId) {
		this.mphBankId = mphBankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

}