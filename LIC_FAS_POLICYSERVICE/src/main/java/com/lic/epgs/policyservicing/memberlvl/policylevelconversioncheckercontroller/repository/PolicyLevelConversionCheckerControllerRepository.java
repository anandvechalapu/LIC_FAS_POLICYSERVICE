package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.repository;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.CommonResponseDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.PolicyLevelConversionDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.util.PolicyLevelConversionConstants;

import org.springframework.data.repository.CrudRepository;

public interface PolicyLevelConversionCheckerControllerRepository extends CrudRepository<PolicyLevelConversionDto, String> {
    /**
     * This method retrieves the existing policy details using the new policy number and the list of 
     * PolicyLevelConversionConstants.
     * 
     * @param newPolicyNo The new policy number
     * @return CommonResponseDto - The response object containing the policy details in the format of 
     * PolicyLevelConversionDto 
     */
    CommonResponseDto getExistingDetailsByNewPolicyNo(String newPolicyNo);
}