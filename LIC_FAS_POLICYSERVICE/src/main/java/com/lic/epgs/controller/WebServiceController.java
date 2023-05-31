package com.lic.epgs.controller;

import com.lic.epgs.model.WebService;
import com.lic.epgs.service.WebServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServiceController {

    @Autowired
    WebServiceService webServiceService;

    @GetMapping("/customer/{authentication}")
    public Object getCustomerData(@PathVariable String authentication) {
        return webServiceService.getCustomerData(authentication);
    }

    @GetMapping("/policy/{authentication}")
    public Object getPolicyData(@PathVariable String authentication) {
        return webServiceService.getPolicyData(authentication);
    }

    @GetMapping("/premium/{authentication}")
    public Object processPremiumPayments(@PathVariable String authentication) {
        return webServiceService.processPremiumPayments(authentication);
    }

    @GetMapping("/cois/{authentication}")
    public Object getCOIs(@PathVariable String authentication) {
        return webServiceService.getCOIs(authentication);
    }

}