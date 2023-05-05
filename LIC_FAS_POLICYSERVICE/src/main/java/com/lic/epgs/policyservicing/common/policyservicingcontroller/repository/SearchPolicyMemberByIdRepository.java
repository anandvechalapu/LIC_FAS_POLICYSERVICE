package com.lic.epgs.policyservicing.common.policyservicingcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.Member;

public interface SearchPolicyMemberByIdRepository extends JpaRepository<Member, Long> {

	public Member findById(Long id);

}