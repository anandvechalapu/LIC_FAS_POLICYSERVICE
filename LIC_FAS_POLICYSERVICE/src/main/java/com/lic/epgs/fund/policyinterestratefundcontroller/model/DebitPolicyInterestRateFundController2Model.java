//Generated Entity/Model class
package com.lic.epgs.fund.policyinterestratefundcontroller.model;

public class DebitPolicyInterestRateFundController2Model {
    private String policyNo;
    private Object debitDetails;
    private String errorMessage;
    
    public DebitPolicyInterestRateFundController2Model() {
    }

    public DebitPolicyInterestRateFundController2Model(String policyNo, Object debitDetails, String errorMessage) {
        this.policyNo = policyNo;
        this.debitDetails = debitDetails;
        this.errorMessage = errorMessage;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public Object getDebitDetails() {
        return debitDetails;
    }

    public void setDebitDetails(Object debitDetails) {
        this.debitDetails = debitDetails;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}