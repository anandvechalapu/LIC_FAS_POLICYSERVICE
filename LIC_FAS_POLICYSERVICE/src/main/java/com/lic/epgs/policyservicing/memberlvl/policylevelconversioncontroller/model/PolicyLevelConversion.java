package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policy_level_conversion")
public class PolicyLevelConversion {
	
	@Id
	private String policyNumber;
	private String policyLevel;
	private String policyLevelChangeReason;
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	
	public String getPolicyLevel() {
		return policyLevel;
	}
	
	public void setPolicyLevel(String policyLevel) {
		this.policyLevel = policyLevel;
	}
	
	public String getPolicyLevelChangeReason() {
		return policyLevelChangeReason;
	}
	
	public void setPolicyLevelChangeReason(String policyLevelChangeReason) {
		this.policyLevelChangeReason = policyLevelChangeReason;
	}
	
}