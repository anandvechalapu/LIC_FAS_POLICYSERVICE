package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMbrNomineeDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service.RemoveNomineePolicyLevelFreeLookCancelControllerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policyservicing/common/policylevelmemberadditioncontroller")
public class RemoveNomineePolicyLevelFreeLookCancelController {

    @Autowired
    private RemoveNomineePolicyLevelFreeLookCancelControllerService removeNomineePolicyLevelFreeLookCancelControllerService;

    @PostMapping("/removenominee")
    public CommonResponseDto<Object> removeNominee(@RequestBody PolicyServiceMbrNomineeDto policyServiceMbrNomineeDto) {
        return removeNomineePolicyLevelFreeLookCancelControllerService.removeNominee(policyServiceMbrNomineeDto);
    }

}