package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMemberAdditionDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository.PolicyLevelFreeLookCancelControllerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyLevelFreeLookCancelControllerService {

    @Autowired
    private PolicyLevelFreeLookCancelControllerRepository policyLevelFreeLookCancelControllerRepository;

    public CommonResponseDto<Object> getAllMembers(PolicyServiceMemberAdditionDto policyServiceMemberAdditionDto)
    {
        return policyLevelFreeLookCancelControllerRepository.getAllMembers(policyServiceMemberAdditionDto);
    }
}