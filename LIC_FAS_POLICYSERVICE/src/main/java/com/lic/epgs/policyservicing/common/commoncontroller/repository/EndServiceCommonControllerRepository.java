package com.lic.epgs.policyservicing.common.commoncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.policyservicing.common.commoncontroller.model.PolicyServiceDTO;

@Repository
public interface EndServiceCommonControllerRepository extends JpaRepository<PolicyServiceDTO, Long> {

	@Transactional
	@Modifying
	@Query("UPDATE PolicyServiceDTO SET serviceStatus=false, workflowStatus=:workflowStatus, modifiedBy=:modifiedBy, modifiedOn=:modifiedOn WHERE policyId=:policyId and serviceId=:serviceId and serviceType=:serviceType")
	public int endService(String policyId, String serviceId, String serviceType, String workflowStatus, String modifiedBy, String modifiedOn);
	
	@Query("SELECT psd FROM PolicyServiceDTO psd WHERE policyId=:policyId and serviceId=:serviceId and serviceType=:serviceType")
	public PolicyServiceDTO findPolicyService(String policyId, String serviceId, String serviceType);

}