package com.lic.epgs.policyservicing.common.commoncontroller.controller;

import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceCommonResponseDto;
import com.lic.epgs.policyservicing.common.commoncontroller.service.PolicyServiceCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policyservicecommon")
public class PolicyServiceCommonController {

    @Autowired
    private PolicyServiceCommonService policyServiceCommonService;

    @GetMapping("/checkService")
    public PolicyServiceCommonResponseDto checkService(@RequestParam Long policyId, @RequestParam String serviceType){
        return policyServiceCommonService.checkService(policyId, serviceType);
    }

    @GetMapping("/checkServiceMap")
    public Boolean checkServiceMap(@RequestParam Long policyId, @RequestParam String serviceType, @RequestParam String newServiceType){
        return policyServiceCommonService.checkServiceMap(policyId, serviceType, newServiceType);
    }

}