package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.service;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.CommonResponseDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.PolicyLevelConversionDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.repository.PolicyLevelConversionCheckerControllerRepository;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.util.PolicyLevelConversionConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyLevelConversionCheckerControllerService {

    @Autowired
    private PolicyLevelConversionCheckerControllerRepository policyLevelConversionCheckerControllerRepository;

    /**
     * This method retrieves the existing policy details using the new policy number and the list of 
     * PolicyLevelConversionConstants.
     * 
     * @param newPolicyNo The new policy number
     * @return CommonResponseDto - The response object containing the policy details in the format of 
     * PolicyLevelConversionDto 
     */
    public CommonResponseDto getExistingDetailsByNewPolicyNo(String newPolicyNo) {
        CommonResponseDto responseDto = new CommonResponseDto();

        PolicyLevelConversionDto policyLevelConversionDto = policyLevelConversionCheckerControllerRepository.findByNewPolicyNo(newPolicyNo);
        if (policyLevelConversionDto == null) {
            responseDto.setStatus(PolicyLevelConversionConstants.NO_RECORD);
            responseDto.setMessage(PolicyLevelConversionConstants.NO_RECORD_MESSAGE);
            return responseDto;
        }

        responseDto.setStatus(PolicyLevelConversionConstants.SUCCESS);
        responseDto.setMessage(PolicyLevelConversionConstants.SUCCESS_MESSAGE);
        responseDto.setData(policyLevelConversionDto);

        return responseDto;
    }

}