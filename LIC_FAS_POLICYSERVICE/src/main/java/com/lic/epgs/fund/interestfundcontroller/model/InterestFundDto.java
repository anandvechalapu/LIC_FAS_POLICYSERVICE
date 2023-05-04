package com.lic.epgs.fund.interestfundcontroller.model;

public class InterestFundDto {

  private String bankName;
  private Integer amount;
  private Double interestRate;
  
  public String getBankName() {
    return bankName;
  }
  
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }
  
  public Integer getAmount() {
    return amount;
  }
  
  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  
  public Double getInterestRate() {
    return interestRate;
  }
  
  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }
}

public class InterestRateResponseDto {

  private String status;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}