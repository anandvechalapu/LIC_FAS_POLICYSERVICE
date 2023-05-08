package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.PolicyRulesDto;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.ResponseDto;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.SaveBenefitTypes_PolicyLevelConversionControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaveBenefitTypes_PolicyLevelConversionControllerService {

    @Autowired
    private SaveBenefitTypes_PolicyLevelConversionControllerRepository saveBenefitTypes_PolicyLevelConversionControllerRepository;

    /**
     * Saves the policy rules data by calling the saveBenefitTypes API endpoint.
     *
     * @param policyRulesDtoList The list of policy rules DTOs to save.
     * @return The response with the transaction status and message.
     */
    public ResponseDto saveBenefitTypes(List<PolicyRulesDto> policyRulesDtoList) {
        saveBenefitTypes_PolicyLevelConversionControllerRepository.saveAll(policyRulesDtoList);
        ResponseDto responseDto = new ResponseDto();
        responseDto.setStatus("SUCCESS");
        responseDto.setMessage("Policy rules saved successfully!");
        return responseDto;
    }

}