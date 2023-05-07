package com.lic.epgs.surrender.controller;

import com.lic.epgs.model.MphBankDto;
import com.lic.epgs.model.PolicySurrenderApiResponse;
import com.lic.epgs.surrender.service.PolicySurrenderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PolicySurrenderController {

    private static final Logger logger = LoggerFactory.getLogger(PolicySurrenderController.class);

    @Autowired
    private PolicySurrenderService policySurrenderService;

    // Controller method to call service method
    @GetMapping(value = "/policy/bank/details")
    public PolicySurrenderApiResponse getPolicyBankDetails(@RequestParam("mphId") String mphId) {
        logger.info("Calling policy surrender service to get policy bank details for mphId: {}", mphId);
        return policySurrenderService.getPolicyBankDetails(mphId);
    }

}