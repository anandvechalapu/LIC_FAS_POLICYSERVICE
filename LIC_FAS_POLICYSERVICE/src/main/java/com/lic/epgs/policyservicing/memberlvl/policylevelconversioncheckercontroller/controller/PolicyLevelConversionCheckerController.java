package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.CommonResponseDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.PolicyLevelConversionDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.service.PolicyLevelConversionCheckerControllerService;

@RestController
public class PolicyLevelConversionCheckerController {

    @Autowired
    private PolicyLevelConversionCheckerControllerService policyLevelConversionCheckerControllerService;

    @PostMapping("/policyLevelConversionChecker")
    public ResponseEntity<CommonResponseDto> getExistingDetailsByNewPolicyNo(
            @RequestBody PolicyLevelConversionDto policyLevelConversionDto) {

        CommonResponseDto responseDto = policyLevelConversionCheckerControllerService.getExistingDetailsByNewPolicyNo(policyLevelConversionDto.getNewPolicyNo());
        return ResponseEntity.ok(responseDto);
    }

}