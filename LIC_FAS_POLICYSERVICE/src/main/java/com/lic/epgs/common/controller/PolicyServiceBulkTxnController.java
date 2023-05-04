package com.lic.epgs.common.controller;

import com.lic.epgs.common.dto.CommonResponseDto;
import com.lic.epgs.common.dto.PolicyServiceProcessDto;
import com.lic.epgs.common.service.PolicyServiceBulkTxnService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/policy-service")
public class PolicyServiceBulkTxnController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyServiceBulkTxnController.class);

    @Autowired
    private PolicyServiceBulkTxnService policyServiceBulkTxnService;

    @PostMapping
    public CommonResponseDto processMember(@RequestBody PolicyServiceProcessDto policyServiceProcessDto) {
        LOGGER.info("Start - processMember");
        CommonResponseDto responseDto = policyServiceBulkTxnService.processMember(policyServiceProcessDto);
        LOGGER.info("End - processMember");
        return responseDto;
    }

}