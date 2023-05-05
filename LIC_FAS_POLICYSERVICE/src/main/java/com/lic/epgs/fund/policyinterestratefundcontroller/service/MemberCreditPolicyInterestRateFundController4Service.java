package com.lic.epgs.fund.policyinterestratefundcontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.InterestRateResponse;
import com.lic.epgs.fund.policyinterestratefundcontroller.repository.MemberCreditPolicyInterestRateFundController4Repository;

@Service
public class MemberCreditPolicyInterestRateFundController4Service {
	
	@Autowired
	private MemberCreditPolicyInterestRateFundController4Repository memberCreditPolicyInterestRateFundController4Repository;
	
	public ResponseEntity<InterestRateResponse> creditPolicyMemberAccount(String policyNo, String memberId) {
		return memberCreditPolicyInterestRateFundController4Repository.creditPolicyMemberAccount(policyNo, memberId);
	}

}