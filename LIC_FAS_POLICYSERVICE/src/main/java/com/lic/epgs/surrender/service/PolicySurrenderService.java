package com.lic.epgs.surrender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.surrender.model.PolicySurrenderApiResponse;
import com.lic.epgs.surrender.repository.PolicySurrenderRepository;

@Service
public class PolicySurrenderService {
 
    @Autowired
    PolicySurrenderRepository policySurrenderRepository;
 
    public PolicySurrenderApiResponse getPolicySurrenderbySurrenderId(Long surrenderId) {
        return policySurrenderRepository.getPolicySurrenderbySurrenderId(surrenderId);
    }
 
}