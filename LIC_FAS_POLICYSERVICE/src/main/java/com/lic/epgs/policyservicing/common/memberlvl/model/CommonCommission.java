package com.lic.epgs.policyservicing.common.memberlvl.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionSearchDto;

@Entity
public class CommonCommission {
	
	@Id
	private Long id;
	
	private String role;
	
	private CommissionSearchDto searchCriteria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public CommissionSearchDto getSearchCriteria() {
		return searchCriteria;
	}

	public void setSearchCriteria(CommissionSearchDto searchCriteria) {
		this.searchCriteria = searchCriteria;
	}
	
	
}