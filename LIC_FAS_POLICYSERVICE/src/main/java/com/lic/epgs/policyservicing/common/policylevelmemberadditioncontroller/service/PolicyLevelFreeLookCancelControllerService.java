package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMemberAdditionDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.entity.PolicyServiceMemberEntity;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMbrDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository.PolicyLevelFreeLookCancelControllerRepository;

@Service
public class PolicyLevelFreeLookCancelControllerService {

    @Autowired
    private PolicyLevelFreeLookCancelControllerRepository policyLevelFreeLookCancelControllerRepository;

    public CommonResponseDto<Object> getAllMembers(Long memberAdditionId){
        return policyLevelFreeLookCancelControllerRepository.getAllMembers(memberAdditionId);
    }
    
    public List<PolicyServiceMbrDto> findByMemberAdditionId(Long memberAdditionId){
        return policyLevelFreeLookCancelControllerRepository.findByMemberAdditionId(memberAdditionId);
    }
    
    public List<PolicyServiceMemberEntity> findByActiveAddressAndActiveNominee(Boolean activeAddress, Boolean activeNominee){
        return policyLevelFreeLookCancelControllerRepository.findByActiveAddressAndActiveNominee(activeAddress, activeNominee);
    }

}