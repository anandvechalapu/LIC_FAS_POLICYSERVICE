package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy_service_notes_temp")
public class PolicyServiceNotesTempEntity {

	@Id
	private Integer policyId;
	
	private String notes;

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}