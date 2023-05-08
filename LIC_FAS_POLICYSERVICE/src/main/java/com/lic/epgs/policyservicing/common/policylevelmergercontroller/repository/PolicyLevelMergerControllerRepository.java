package com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.ExistingPolicy;

@Repository
public interface PolicyLevelMergerControllerRepository extends JpaRepository<ExistingPolicy, Long> {
	
	ExistingPolicy getExistingPolicyByPolicyNumber(String policyNumber);
	
}