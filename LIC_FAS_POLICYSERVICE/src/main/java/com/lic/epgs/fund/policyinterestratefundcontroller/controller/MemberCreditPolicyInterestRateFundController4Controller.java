package com.lic.epgs.fund.policyinterestratefundcontroller.repository;

import org.springframework.http.ResponseEntity;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.InterestRateResponse;

public interface MemberCreditPolicyInterestRateFundController4Repository {

	ResponseEntity<InterestRateResponse> creditPolicyMemberAccount(String policyNo, String memberId);

}

package com.lic.epgs.fund.policyinterestratefundcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.fund.policyinterestratefundcontroller.model.InterestRateResponse;
import com.lic.epgs.fund.policyinterestratefundcontroller.service.MemberCreditPolicyInterestRateFundController4Service;

@RestController
@RequestMapping("/policyinterestratefundcontroller")
public class MemberCreditPolicyInterestRateFundController4Controller {

	@Autowired
	private MemberCreditPolicyInterestRateFundController4Service memberCreditPolicyInterestRateFundController4Service;

	@GetMapping("/creditpolicymemberaccount")
	public ResponseEntity<InterestRateResponse> creditPolicyMemberAccount(
			@RequestParam(name = "policyNo", required = true) String policyNo,
			@RequestParam(name = "memberId", required = true) String memberId) {
		return memberCreditPolicyInterestRateFundController4Service.creditPolicyMemberAccount(policyNo, memberId);
	}

}