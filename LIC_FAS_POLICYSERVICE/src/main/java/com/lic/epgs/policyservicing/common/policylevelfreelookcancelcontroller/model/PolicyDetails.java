package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model;

import java.util.Date;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;

@Entity
@Table(name="PolicyDetails")
public class PolicyDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String policyNumber;

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
	
	public Optional<PolicyDetails> findByPolicyNumber(String policyNumber) {
		
		if(policyNumber.equals(this.policyNumber)) {
			return Optional.of(this);
		}
		
		return Optional.empty();
		
	}
	
	public boolean logProcess(Date startTime, Date endTime) {
		//log the start and end of the process
		return true;
	}

}