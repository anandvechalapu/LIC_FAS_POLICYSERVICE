package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMbrNomineeDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository.RemoveNomineePolicyLevelFreeLookCancelControllerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemoveNomineePolicyLevelFreeLookCancelControllerService {

    @Autowired
    private RemoveNomineePolicyLevelFreeLookCancelControllerRepository removeNomineePolicyLevelFreeLookCancelControllerRepository;

    public CommonResponseDto<Object> removeNominee(PolicyServiceMbrNomineeDto policyServiceMbrNomineeDto) {
        CommonResponseDto<Object> responseDto = new CommonResponseDto<>();

        try {
            if (policyServiceMbrNomineeDto == null) {
                responseDto.setSuccess(false);
                responseDto.setErrorMessage("PolicyServiceMbrNomineeDto object is null");
            } else {
                removeNomineePolicyLevelFreeLookCancelControllerRepository.delete(policyServiceMbrNomineeDto);
                List<PolicyServiceMbrNomineeDto> nominees = removeNomineePolicyLevelFreeLookCancelControllerRepository.findByMemberId(policyServiceMbrNomineeDto.getMemberId());
                responseDto.setSuccess(true);
                responseDto.setData(nominees);
            }
        } catch (Exception e) {
            responseDto.setSuccess(false);
            responseDto.setErrorMessage(e.getMessage());
        }

        return responseDto;
    }

}