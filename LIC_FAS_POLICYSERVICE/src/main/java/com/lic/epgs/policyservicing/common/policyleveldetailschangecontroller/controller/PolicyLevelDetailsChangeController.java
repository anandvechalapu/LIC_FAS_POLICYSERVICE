package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.models.PolicyDtlsResponseDto;

@Repository
public interface NewcitrieaSearchByIdRepository extends JpaRepository<PolicyDtlsResponseDto, Long> {
	
	public PolicyDtlsResponseDto newcitrieaSearchById(Long id);

}

package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.models.PolicyDtlsResponseDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.PolicyService;

@RestController
@RequestMapping("/policydtls")
public class PolicyLevelDetailsChangeController {
	
	@Autowired
	private PolicyService policyService;
	
	/**
	 * Method to get the policy details based on policy number
	 * @param id policy number
	 * @return PolicyDtlsResponseDto object with the corresponding policy details
	 */
	@GetMapping("/{id}")
	public ResponseEntity<PolicyDtlsResponseDto> getPolicyDetails(@PathVariable Long id){
		PolicyDtlsResponseDto policyDtlsResponseDto = policyService.searchById(id);
		return ResponseEntity.ok().body(policyDtlsResponseDto);
	}
}