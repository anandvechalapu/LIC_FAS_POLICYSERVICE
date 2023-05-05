package com.lic.epgs.fund.policyinterestratefundcontroller.model;

import com.lic.epgs.response.InterestRateResponse;

public class MemberCreditPolicyInterestRateFundController4 {

    private String policyNo;
    private String memberId;
    private InterestRateResponse interestRateResponse;

    public MemberCreditPolicyInterestRateFundController4() {
    }

    public MemberCreditPolicyInterestRateFundController4(String policyNo, String memberId, InterestRateResponse interestRateResponse) {
        this.policyNo = policyNo;
        this.memberId = memberId;
        this.interestRateResponse = interestRateResponse;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public InterestRateResponse getInterestRateResponse() {
        return interestRateResponse;
    }

    public void setInterestRateResponse(InterestRateResponse interestRateResponse) {
        this.interestRateResponse = interestRateResponse;
    }
}