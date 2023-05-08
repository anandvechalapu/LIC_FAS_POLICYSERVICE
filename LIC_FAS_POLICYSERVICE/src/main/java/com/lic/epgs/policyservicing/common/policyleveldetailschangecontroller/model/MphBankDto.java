package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mph_bank")
public class MphBankDto {

	@Id
	private Long mphId;
	
	@Column(name = "mph_name")
	private String mphName;
	
	@Column(name = "mph_type")
	private String mphType;
	
	@Column(name = "mph_code")
	private String mphCode;
	
	public Long getMphId() {
		return mphId;
	}
	
	public void setMphId(Long mphId) {
		this.mphId = mphId;
	}
	
	public String getMphName() {
		return mphName;
	}
	
	public void setMphName(String mphName) {
		this.mphName = mphName;
	}
	
	public String getMphType() {
		return mphType;
	}
	
	public void setMphType(String mphType) {
		this.mphType = mphType;
	}
	
	public String getMphCode() {
		return mphCode;
	}
	
	public void setMphCode(String mphCode) {
		this.mphCode = mphCode;
	}
	
}

package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model;

public class PolicyBankOldDto {

	private String mphName;
	
	private String mphType;
	
	private String mphCode;

	public String getMphName() {
		return mphName;
	}

	public void setMphName(String mphName) {
		this.mphName = mphName;
	}

	public String getMphType() {
		return mphType;
	}

	public void setMphType(String mphType) {
		this.mphType = mphType;
	}

	public String getMphCode() {
		return mphCode;
	}

	public void setMphCode(String mphCode) {
		this.mphCode = mphCode;
	}
	
}