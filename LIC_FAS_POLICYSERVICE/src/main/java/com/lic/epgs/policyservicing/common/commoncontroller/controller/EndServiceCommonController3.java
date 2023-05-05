package com.lic.epgs.policyservicing.common.commoncontroller.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.policyservicing.common.commoncontroller.model.PolicyService;

public interface EndServiceCommonController3Repository extends JpaRepository<PolicyService, Long>{
	
	@Query("SELECT ps FROM PolicyService ps WHERE ps.policyId = :policyId AND ps.serviceId = :serviceId")
	Optional<PolicyService> findByPolicyIdAndServiceId(@Param("policyId") Long policyId, @Param("serviceId") Long serviceId);
	
	@Modifying
	@Query("UPDATE PolicyService ps SET ps.isUsing = false, ps.serviceStatus = 'Ended' WHERE ps.policyId = :policyId AND ps.serviceId = :serviceId")
	void endService(@Param("policyId") Long policyId, @Param("serviceId") Long serviceId);

}

package com.lic.epgs.policyservicing.common.commoncontroller.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.commoncontroller.model.PolicyService;
import com.lic.epgs.policyservicing.common.commoncontroller.service.EndServiceCommonController3Service;

@RestController
@RequestMapping("/endService")
public class EndServiceCommonController3 {
	
	@Autowired
	private EndServiceCommonController3Service endServiceCommonController3Service;
	
	@GetMapping
	public PolicyService endService(@RequestParam Long policyId, @RequestParam Long serviceId) {
		Optional<PolicyService> policyServiceOptional = endServiceCommonController3Service.getPolicyService(policyId, serviceId);
		if(policyServiceOptional.isPresent()) {
			endServiceCommonController3Service.endService(policyId, serviceId);
			return policyServiceOptional.get();
		}
		return null;
	}

}