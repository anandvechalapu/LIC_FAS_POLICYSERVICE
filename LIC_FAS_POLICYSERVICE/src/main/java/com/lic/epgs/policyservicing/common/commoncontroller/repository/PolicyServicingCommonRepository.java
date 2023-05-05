package com.lic.epgs.policyservicing.common.commoncontroller.repository;

import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceCommonResponseDto;
import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceDto;
import com.lic.epgs.policyservicing.common.commoncontroller.entity.PolicyServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyServicingCommonRepository extends JpaRepository<PolicyServiceEntity, Long> {

  PolicyServiceEntity findByPolicyId(String policyId);

  PolicyServiceCommonResponseDto startService(PolicyServiceDto policyServiceDto, String serviceType);
}