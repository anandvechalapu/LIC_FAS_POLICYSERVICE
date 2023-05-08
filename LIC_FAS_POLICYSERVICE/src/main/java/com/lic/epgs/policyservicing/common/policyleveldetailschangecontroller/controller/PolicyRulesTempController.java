package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.controller;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyDtlsResponseDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.PolicyRulesTempService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policyRulesTemp")
public class PolicyRulesTempController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyRulesTempController.class);

    @Autowired
    private PolicyRulesTempService policyRulesTempService;

    /**
     * This method is used to retrieve the list of policy rules for a given policy ID
     *
     * @param policyId the policy ID to look up
     * @return a ResponseEntity containing a PolicyDtlsResponseDto object
     */
    @GetMapping("/{policyId}")
    public ResponseEntity<PolicyDtlsResponseDto> getRulesList(@PathVariable Long policyId) {
        LOGGER.info("Retrieving policy rules for policy ID: {}", policyId);
        PolicyDtlsResponseDto policyDtlsResponseDto = policyRulesTempService.getRulesList(policyId);
        LOGGER.info("Finished retrieving policy rules for policy ID: {}", policyId);
        return new ResponseEntity<>(policyDtlsResponseDto, HttpStatus.OK);
    }

}