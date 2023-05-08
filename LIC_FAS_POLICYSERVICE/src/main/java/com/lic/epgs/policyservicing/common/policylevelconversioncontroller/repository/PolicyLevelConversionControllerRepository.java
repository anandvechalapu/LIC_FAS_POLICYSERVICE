package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.PolicyLevelConversionDto;

@Repository
public interface PolicyLevelConversionControllerRepository extends JpaRepository<PolicyLevelConversionDto, Long> {

    PolicyLevelConversionDto savePolicyConversionDetails(PolicyLevelConversionDto policyLevelConversionDto);
}