package com.lic.epgs.fund.policyinterestratefundcontroller.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InterestRateResponseDto {
  
  @Id
  private String policyNo;
  
  private double interestRate;
  
  public String getPolicyNo() {
    return policyNo;
  }
  
  public void setPolicyNo(String policyNo) {
    this.policyNo = policyNo;
  }
  
  public double getInterestRate() {
    return interestRate;
  }
  
  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }
  
}