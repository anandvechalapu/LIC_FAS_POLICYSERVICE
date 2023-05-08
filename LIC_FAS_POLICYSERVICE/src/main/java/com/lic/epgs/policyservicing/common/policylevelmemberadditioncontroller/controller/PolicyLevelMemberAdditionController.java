package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMemberAdditionDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service.PolicyLevelMemberAdditionControllerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policylevelmemberaddition")
public class PolicyLevelMemberAdditionController {

    @Autowired
    PolicyLevelMemberAdditionControllerService policyLevelMemberAdditionControllerService;

    @PostMapping("/search")
    public ResponseEntity<CommonResponseDto> searchPolicyMemberAddition(@RequestBody PolicyServiceMemberAdditionDto policyServiceMemberAdditionDto){
        CommonResponseDto commonResponseDto = policyLevelMemberAdditionControllerService.searchPolicyMemberAddition(policyServiceMemberAdditionDto);
        return new ResponseEntity<>(commonResponseDto, HttpStatus.OK);
    }
}