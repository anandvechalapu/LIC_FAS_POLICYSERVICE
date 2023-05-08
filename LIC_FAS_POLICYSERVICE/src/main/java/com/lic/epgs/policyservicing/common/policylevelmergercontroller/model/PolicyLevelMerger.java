package com.lic.epgs.policyservicing.common.policylevelmergercontroller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policylevelmerger")
public class PolicyLevelMerger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String policyNumber;
	private String policyLevelNumber;
	private String policyLevelMerger;
	private String policyLevelMergerName;
	private String policyStatus;
	
	public PolicyLevelMerger() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyLevelNumber() {
		return policyLevelNumber;
	}

	public void setPolicyLevelNumber(String policyLevelNumber) {
		this.policyLevelNumber = policyLevelNumber;
	}

	public String getPolicyLevelMerger() {
		return policyLevelMerger;
	}

	public void setPolicyLevelMerger(String policyLevelMerger) {
		this.policyLevelMerger = policyLevelMerger;
	}

	public String getPolicyLevelMergerName() {
		return policyLevelMergerName;
	}

	public void setPolicyLevelMergerName(String policyLevelMergerName) {
		this.policyLevelMergerName = policyLevelMergerName;
	}

	public String getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(String policyStatus) {
		this.policyStatus = policyStatus;
	}
	
	
}