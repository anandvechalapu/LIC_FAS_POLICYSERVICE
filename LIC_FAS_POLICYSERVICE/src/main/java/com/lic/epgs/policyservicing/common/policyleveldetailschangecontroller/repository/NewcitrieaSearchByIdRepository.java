package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.models.PolicyDtlsResponseDto;

@Repository
public interface NewcitrieaSearchByIdRepository extends JpaRepository<PolicyDtlsResponseDto, Long> {
	
	/**
	 * Method to search for policies based on policy number
	 * @param id policy number
	 * @return PolicyDtlsResponseDto object with the corresponding policy details
	 */
	PolicyDtlsResponseDto newcitrieaSearchById(Long id);
}