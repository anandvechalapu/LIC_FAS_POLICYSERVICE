package com.lic.epgs.topupda.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topupda_temp")
public class TopupdaTempEntity {

	@Id
	private Long topupId;
	private String topupName;
	private String topupType;
	private String topupStatus;
	
	public Long getTopupId() {
		return topupId;
	}
	public void setTopupId(Long topupId) {
		this.topupId = topupId;
	}
	public String getTopupName() {
		return topupName;
	}
	public void setTopupName(String topupName) {
		this.topupName = topupName;
	}
	public String getTopupType() {
		return topupType;
	}
	public void setTopupType(String topupType) {
		this.topupType = topupType;
	}
	public String getTopupStatus() {
		return topupStatus;
	}
	public void setTopupStatus(String topupStatus) {
		this.topupStatus = topupStatus;
	}
	
	

}

@Entity
@Table(name = "topupda")
public class TopupdaEntity {

	@Id
	private Long topupId;
	private String topupName;
	private String topupType;
	private String topupStatus;
	private String topupData;
	
	public Long getTopupId() {
		return topupId;
	}
	public void setTopupId(Long topupId) {
		this.topupId = topupId;
	}
	public String getTopupName() {
		return topupName;
	}
	public void setTopupName(String topupName) {
		this.topupName = topupName;
	}
	public String getTopupType() {
		return topupType;
	}
	public void setTopupType(String topupType) {
		this.topupType = topupType;
	}
	public String getTopupStatus() {
		return topupStatus;
	}
	public void setTopupStatus(String topupStatus) {
		this.topupStatus = topupStatus;
	}
	public String getTopupData() {
		return topupData;
	}
	public void setTopupData(String topupData) {
		this.topupData = topupData;
	}	
	
}