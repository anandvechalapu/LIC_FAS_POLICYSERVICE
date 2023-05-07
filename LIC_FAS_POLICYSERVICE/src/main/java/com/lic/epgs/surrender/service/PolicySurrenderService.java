package com.lic.epgs.surrender.service;

import com.lic.epgs.model.MphBankDto;
import com.lic.epgs.model.PolicySurrenderApiResponse;
import com.lic.epgs.surrender.repository.MphBankRepository;
import com.lic.epgs.surrender.repository.PolicySurrenderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicySurrenderService {

    private static final Logger logger = LoggerFactory.getLogger(PolicySurrenderService.class);

    @Autowired
    private PolicySurrenderRepository policySurrenderRepository;

    // Service method to call repository method
    public PolicySurrenderApiResponse getPolicyBankDetails(String mphId) {
        logger.info("Calling policy surrender repository to get policy bank details for mphId: {}", mphId);
        return policySurrenderRepository.getPolicyBankDetails(mphId);
    }

}