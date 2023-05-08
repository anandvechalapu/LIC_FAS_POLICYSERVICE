package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMbrNomineeDto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RemoveNomineePolicyLevelFreeLookCancelControllerRepository extends JpaRepository<PolicyServiceMbrNomineeDto, Long> {
    
    /**
     * Removes a nominee from a policy.
     *
     * @param policyServiceMbrNomineeDto The policyServiceMbrNomineeDto object containing the details of the nominee to be removed.
     * @return A CommonResponseDto<Object> object containing a success message with the removed nominee's ID and a list of the remaining nominees for the given member.
     * If there are no remaining nominees for the member, the response should contain an empty list of nominees.
     * If the provided PolicyServiceMbrNomineeDto object contains invalid or missing information, the API should return an error response with an appropriate message.
     * If any error occurs during the execution of the removeNominee() method, the API should return an error response with an appropriate message.
     */
    CommonResponseDto<Object> removeNominee(PolicyServiceMbrNomineeDto policyServiceMbrNomineeDto);

}