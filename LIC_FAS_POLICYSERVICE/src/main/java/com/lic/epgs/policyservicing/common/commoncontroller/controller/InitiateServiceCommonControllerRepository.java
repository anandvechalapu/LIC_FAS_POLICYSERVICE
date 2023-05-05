package com.lic.epgs.policyservicing.common.commoncontroller.repository;

import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceCommonResponseDto;
import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceDto;
import org.springframework.stereotype.Repository;

@Repository
public class InitiateServiceCommonControllerRepository {

    public PolicyServiceCommonResponseDto startService(PolicyServiceDto policyServiceDto, String serviceType) {
        return new PolicyServiceCommonResponseDto(true, "Service initiated successfully");
    }
}

package com.lic.epgs.policyservicing.common.commoncontroller.controller;

import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceCommonResponseDto;
import com.lic.epgs.policyservicing.common.commoncontroller.dto.PolicyServiceDto;
import com.lic.epgs.policyservicing.common.commoncontroller.service.InitiateServiceCommonControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitiateServiceCommonController {

    @Autowired
    private InitiateServiceCommonControllerService initiateServiceCommonControllerService;

    @PostMapping("/initiate-service")
    public ResponseEntity<PolicyServiceCommonResponseDto> startService(@RequestBody PolicyServiceDto policyServiceDto, String serviceType) {
        PolicyServiceCommonResponseDto response = initiateServiceCommonControllerService.startService(policyServiceDto, serviceType);
        return ResponseEntity.ok(response);
    }
}