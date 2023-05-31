package com.lic.epgs.service;

import com.lic.epgs.repository.WebServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebServiceService {
    
    @Autowired
    WebServiceRepository webServiceRepository;

    public Object getCustomerData(String authentication) {
        return webServiceRepository.getCustomerData(authentication);
    }

    public Object getPolicyData(String authentication) {
        return webServiceRepository.getPolicyData(authentication);
    }

    public Object processPremiumPayments(String authentication) {
        return webServiceRepository.processPremiumPayments(authentication);
    }

    public Object getCOIs(String authentication) {
        return webServiceRepository.getCOIs(authentication);
    }
}