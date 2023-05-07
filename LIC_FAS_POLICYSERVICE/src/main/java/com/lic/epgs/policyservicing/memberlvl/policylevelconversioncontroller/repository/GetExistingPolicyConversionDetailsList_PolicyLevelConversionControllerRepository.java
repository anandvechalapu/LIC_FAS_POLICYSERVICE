package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.repository;

import org.springframework.data.repository.CrudRepository;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.ExistingPolicyConversionDetails;

public interface GetExistingPolicyConversionDetailsList_PolicyLevelConversionControllerRepository extends CrudRepository<ExistingPolicyConversionDetails, Long> {
    
    List<ExistingPolicyConversionDetails> findByRoleAndUnitCode(String role, String unitCode);
    
}