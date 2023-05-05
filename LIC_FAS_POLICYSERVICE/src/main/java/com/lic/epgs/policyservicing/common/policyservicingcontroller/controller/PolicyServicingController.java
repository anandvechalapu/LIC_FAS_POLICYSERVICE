package com.lic.epgs.policyservicing.common.policyservicingcontroller.controller;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceRequestDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.exceptions.ApplicationException;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.exceptions.RequiredFieldException;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.exceptions.RequestValidationException;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.service.PolicyServicingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policyServicing")
public class PolicyServicingController {

    @Autowired
    private PolicyServicingService policyServicingService;

    @GetMapping("/getPolicyServiceById")
    public ResponseEntity<CommonResponseDto<PolicyServiceDto>> getPolicyServiceById(PolicyServiceRequestDto PolicyServiceRequestDto)
            throws ApplicationException, RequiredFieldException, RequestValidationException {
        CommonResponseDto<PolicyServiceDto> response = policyServicingService.getPolicyServiceById(PolicyServiceRequestDto);
        return new ResponseEntity<CommonResponseDto<PolicyServiceDto>>(response, HttpStatus.OK);
    }
}