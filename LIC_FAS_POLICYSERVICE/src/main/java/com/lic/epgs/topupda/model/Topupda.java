package com.lic.epgs.topupda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="topupda")
public class Topupda {

	@Id
	private Long id;
	
	@Column(name="unit_code")
	private String unitCode;
	
	@Column(name="quotation_number")
	private String quotationNumber;
	
	@Column(name="topup_status")
	private String topupStatus;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="modified_on")
	private String modifiedOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUnitCode() {
		return unitCode;
	}

	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}

	public String getQuotationNumber() {
		return quotationNumber;
	}

	public void setQuotationNumber(String quotationNumber) {
		this.quotationNumber = quotationNumber;
	}

	public String getTopupStatus() {
		return topupStatus;
	}

	public void setTopupStatus(String topupStatus) {
		this.topupStatus = topupStatus;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}
	
	
	
}