package com.lic.epgs.policyservicing.common.policyservicingcontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.Member;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.repository.SearchPolicyMemberByIdRepository;

@Service
public class PolicyMemberService {

	@Autowired
	private SearchPolicyMemberByIdRepository searchPolicyMemberByIdRepository;

	public Member searchPolicyMemberById(Long id) {
		return searchPolicyMemberByIdRepository.findById(id);
	}

}