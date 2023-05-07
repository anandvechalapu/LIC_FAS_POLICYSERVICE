package com.lic.epgs.topupda.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="topupda_temp")
public class TopupdaTempEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="topup_id")
	private Long topupId;
	
	@Column(name="topup_amount")
	private Double topupAmount;
	
	@Column(name="topup_currency")
	private String topupCurrency;
	
	@Column(name="topup_remarks")
	private String topupRemarks;
	
	@Column(name="topup_date")
	private String topupDate;
	
	@Column(name="topup_status")
	private String topupStatus;
	
	@Column(name="is_active")
	private Boolean isActive;
	
	@Column(name="created_on")
	private String createdOn;
	
	public Long getTopupId() {
		return topupId;
	}
	
	public void setTopupId(Long topupId) {
		this.topupId = topupId;
	}
	
	public Double getTopupAmount() {
		return topupAmount;
	}
	
	public void setTopupAmount(Double topupAmount) {
		this.topupAmount = topupAmount;
	}
	
	public String getTopupCurrency() {
		return topupCurrency;
	}
	
	public void setTopupCurrency(String topupCurrency) {
		this.topupCurrency = topupCurrency;
	}
	
	public String getTopupRemarks() {
		return topupRemarks;
	}
	
	public void setTopupRemarks(String topupRemarks) {
		this.topupRemarks = topupRemarks;
	}
	
	public String getTopupDate() {
		return topupDate;
	}
	
	public void setTopupDate(String topupDate) {
		this.topupDate = topupDate;
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
	
	public String getCreatedOn() {
		return createdOn;
	}
	
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	
}