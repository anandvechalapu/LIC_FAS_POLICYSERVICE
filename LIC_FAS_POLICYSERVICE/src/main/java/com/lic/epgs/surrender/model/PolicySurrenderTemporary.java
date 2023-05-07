package com.lic.epgs.surrender.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PolicySurrenderTemporary")
public class PolicySurrenderTemporary implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "surrenderId")
	private String surrenderId;

	@Column(name = "surrenderStatus")
	private String surrenderStatus;

	@Column(name = "modifiedBy")
	private String modifiedBy;

	@Column(name = "modifiedOn")
	private String modifiedOn;

	public PolicySurrenderTemporary() {
		super();
	}

	public PolicySurrenderTemporary(String surrenderId, String surrenderStatus, String modifiedBy, String modifiedOn) {
		this.surrenderId = surrenderId;
		this.surrenderStatus = surrenderStatus;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
	}

	public String getSurrenderId() {
		return surrenderId;
	}

	public void setSurrenderId(String surrenderId) {
		this.surrenderId = surrenderId;
	}

	public String getSurrenderStatus() {
		return surrenderStatus;
	}

	public void setSurrenderStatus(String surrenderStatus) {
		this.surrenderStatus = surrenderStatus;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(String modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

}

package com.lic.epgs.surrender.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PolicySurrenderEntity")
public class PolicySurrenderEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "surrenderId")
	private String surrenderId;

	@Column(name = "isActive")
	private boolean isActive;

	@Column(name = "notes")
	private String notes;

	@Column(name = "docs")
	private String docs;

	@Column(name = "surrenderPayouts")
	private String surrenderPayouts;

	public PolicySurrenderEntity() {
		super();
	}

	public PolicySurrenderEntity(String surrenderId, boolean isActive, String notes, String docs,
			String surrenderPayouts) {
		this.surrenderId = surrenderId;
		this.isActive = isActive;
		this.notes = notes;
		this.docs = docs;
		this.surrenderPayouts = surrenderPayouts;
	}

	public String getSurrenderId() {
		return surrenderId;
	}

	public void setSurrenderId(String surrenderId) {
		this.surrenderId = surrenderId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getDocs() {
		return docs;
	}

	public void setDocs(String docs) {
		this.docs = docs;
	}

	public String getSurrenderPayouts() {
		return surrenderPayouts;
	}

	public void setSurrenderPayouts(String surrenderPayouts) {
		this.surrenderPayouts = surrenderPayouts;
	}

