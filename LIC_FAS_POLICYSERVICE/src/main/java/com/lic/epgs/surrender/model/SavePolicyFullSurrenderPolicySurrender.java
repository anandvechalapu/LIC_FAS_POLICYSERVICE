package com.lic.epgs.surrender.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SavePolicyFullSurrenderPolicySurrender")
public class SavePolicyFullSurrenderPolicySurrender {

	@Id
	Long id;
	
	String mphCode;
	String mphName;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMphCode() {
		return mphCode;
	}
	public void setMphCode(String mphCode) {
		this.mphCode = mphCode;
	}
	public String getMphName() {
		return mphName;
	}
	public void setMphName(String mphName) {
		this.mphName = mphName;
	}
	
	
	
}