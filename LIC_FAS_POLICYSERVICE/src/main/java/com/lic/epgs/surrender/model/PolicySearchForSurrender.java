package com.lic.epgs.surrender.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class PolicySearchForSurrender {
  
  @Id
  private int policyNumber;
  private String policyName;
  private String policyType;
  private String policyHolderName;
  private String policyHolderAddress;
  
  public int getPolicyNumber() {
    return policyNumber;
  }
  
  public void setPolicyNumber(int policyNumber) {
    this.policyNumber = policyNumber;
  }
  
  public String getPolicyName() {
    return policyName;
  }
  
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }
  
  public String getPolicyType() {
    return policyType;
  }
  
  public void setPolicyType(String policyType) {
    this.policyType = policyType;
  }
  
  public String getPolicyHolderName() {
    return policyHolderName;
  }
  
  public void setPolicyHolderName(String policyHolderName) {
    this.policyHolderName = policyHolderName;
  }
  
  public String getPolicyHolderAddress() {
    return policyHolderAddress;
  }
  
  public void setPolicyHolderAddress(String policyHolderAddress) {
    this.policyHolderAddress = policyHolderAddress;
  }
}