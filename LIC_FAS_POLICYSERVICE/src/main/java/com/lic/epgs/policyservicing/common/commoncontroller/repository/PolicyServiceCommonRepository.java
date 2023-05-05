package com.lic.epgs.policyservicing.common.commoncontroller.repository;

import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceCommonResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyServiceCommonRepository extends JpaRepository<PolicyServiceCommonResponseDto, Long> {

    PolicyServiceCommonResponseDto checkService(Long policyId, String serviceType);

    Boolean checkServiceMap(Long policyId, String serviceType, String newServiceType);

}