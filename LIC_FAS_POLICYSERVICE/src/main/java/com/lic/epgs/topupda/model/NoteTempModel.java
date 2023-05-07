package com.lic.epgs.topupda.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="note_temp")
public class NoteTempModel {
	
	@Id
	private Long id;
	
	private Long topupId;
	
	private String notes;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getTopupId() {
		return topupId;
	}
	
	public void setTopupId(Long topupId) {
		this.topupId = topupId;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}

}