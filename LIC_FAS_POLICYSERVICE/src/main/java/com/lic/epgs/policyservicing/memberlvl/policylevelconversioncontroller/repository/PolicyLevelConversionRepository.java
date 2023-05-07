package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.dto.PolicyLevelConversionDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.dto.CommonResponseDto;

@Repository
public interface PolicyLevelConversionRepository extends JpaRepository<PolicyLevelConversionDto, String> {
    
    public CommonResponseDto savePolicyConversionDetails(PolicyLevelConversionDto policyLevelConversionDTO);

}