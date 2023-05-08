package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMbrNomineeDto;

import org.springframework.data.repository.CrudRepository;

public interface RemoveNomineePolicyLevelFreeLookCancelControllerRepository extends CrudRepository<PolicyServiceMbrNomineeDto, Integer> {

  public CommonResponseDto<Object> removeNominee(PolicyServiceMbrNomineeDto policyServiceMbrNomineeDto);

}