package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.PolicyLevelConversionDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyLevelConversionControllerRepository extends JpaRepository<PolicyLevelConversionDto, String> {

    @Query("SELECT p FROM PolicyLevelConversionDto p WHERE p.prevPolicyNo = :prevPolicyNo AND p.role = :role")
    CommonResponseDto getPolicyConversionDetailsByPolicyNo(String prevPolicyNo, String role);

}