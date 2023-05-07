package com.lic.epgs.surrender.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicySurrender {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long surrenderId;
    private String policyNumber;
    private String surrenderAmount;
    private String surrenderDate;
    private String surrenderStatus;
    
    public PolicySurrender() {
		super();
	}

	public PolicySurrender(Long surrenderId, String policyNumber, String surrenderAmount, String surrenderDate,
			String surrenderStatus) {
		super();
		this.surrenderId = surrenderId;
		this.policyNumber = policyNumber;
		this.surrenderAmount = surrenderAmount;
		this.surrenderDate = surrenderDate;
		this.surrenderStatus = surrenderStatus;
	}

	public Long getSurrenderId() {
		return surrenderId;
	}

	public void setSurrenderId(Long surrenderId) {
		this.surrenderId = surrenderId;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getSurrenderAmount() {
		return surrenderAmount;
	}

	public void setSurrenderAmount(String surrenderAmount) {
		this.surrenderAmount = surrenderAmount;
	}

	public String getSurrenderDate() {
		return surrenderDate;
	}

	public void setSurrenderDate(String surrenderDate) {
		this.surrenderDate = surrenderDate;
	}

	public String getSurrenderStatus() {
		return surrenderStatus;
	}

	public void setSurrenderStatus(String surrenderStatus) {
		this.surrenderStatus = surrenderStatus;
	}
    
    
    
    
    
    
    
}