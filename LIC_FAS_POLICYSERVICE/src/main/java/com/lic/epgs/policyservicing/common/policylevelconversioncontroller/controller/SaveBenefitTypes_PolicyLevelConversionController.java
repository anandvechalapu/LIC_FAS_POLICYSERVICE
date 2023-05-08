package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.PolicyRulesDto;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.dto.ResponseDto;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.SaveBenefitTypes_PolicyLevelConversionControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SaveBenefitTypes_PolicyLevelConversionController {

    @Autowired
    private SaveBenefitTypes_PolicyLevelConversionControllerService saveBenefitTypes_PolicyLevelConversionControllerService;

    /**
     * API endpoint to save the policy rules data.
     *
     * @param policyRulesDtoList The list of policy rules DTOs to save.
     * @return The response with the transaction status and message.
     */
    @PostMapping("/saveBenefitTypes")
    public ResponseEntity<ResponseDto> saveBenefitTypes(@RequestBody List<PolicyRulesDto> policyRulesDtoList) {
        ResponseDto responseDto = saveBenefitTypes_PolicyLevelConversionControllerService.saveBenefitTypes(policyRulesDtoList);
        return new ResponseEntity<>(responseDto, HttpStatus.OK);
    }

}