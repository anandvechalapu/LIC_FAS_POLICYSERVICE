Spring Boot Controller Class

package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMemberAdditionDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service.PolicyLevelFreeLookCancelControllerService;

@RestController
@RequestMapping("/policylevelfreeLookCancel")
public class PolicyLevelFreeLookCancelController {

    @Autowired
    private PolicyLevelFreeLookCancelControllerService policyLevelFreeLookCancelControllerService;

    @GetMapping("/allMembers")
    public CommonResponseDto<Object> getAllMembers(PolicyServiceMemberAdditionDto policyServiceMemberAdditionDto)
    {
        return policyLevelFreeLookCancelControllerService.getAllMembers(policyServiceMemberAdditionDto);
    }

    @PostMapping("/addMember")
    public CommonResponseDto<Object> addMember(@RequestBody PolicyServiceMemberAdditionDto policyServiceMemberAdditionDto)
    {
        return policyLevelFreeLookCancelControllerService.getAllMembers(policyServiceMemberAdditionDto);
    }

}