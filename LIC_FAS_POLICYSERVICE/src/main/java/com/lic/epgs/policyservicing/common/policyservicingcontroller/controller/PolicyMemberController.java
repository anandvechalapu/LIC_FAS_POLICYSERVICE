package com.lic.epgs.policyservicing.common.policyservicingcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.Member;

public interface SearchPolicyMemberByIdRepository extends JpaRepository<Member, Long> {

	Member findById(long id);

}

package com.lic.epgs.policyservicing.common.policyservicingcontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.Member;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.service.PolicyMemberService;

@RestController
public class PolicyMemberController {

	@Autowired
	private PolicyMemberService policyMemberService;

	@GetMapping("/members/{id}")
	public Member getMemberById(@PathVariable Long id) {
		return policyMemberService.searchPolicyMemberById(id);
	}

}