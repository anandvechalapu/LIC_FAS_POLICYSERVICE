Spring Boot Service Class

package com.lic.epgs.topupda.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.topupda.dto.TopupdaApiResponseDto;
import com.lic.epgs.topupda.dto.TopupdaDto;
import com.lic.epgs.topupda.repository.InprogressCriteriaLoadTopupdaRepository;

@Service
public class InprogressCriteriaLoadTopupdaService {

    private static final Logger logger = LoggerFactory.getLogger(InprogressCriteriaLoadTopupdaService.class);

    @Autowired
    private InprogressCriteriaLoadTopupdaRepository inprogressCriteriaLoadTopupdaRepository;

    public TopupdaApiResponseDto getRequestsByCriteria(String role, String unitCode, String quotationNumber) {
        logger.info("Starting method to get requests by criteria");

        TopupdaApiResponseDto responseDto = inprogressCriteriaLoadTopupdaRepository.getRequestsByCriteria(role, unitCode, quotationNumber);

        logger.info("Ending method to get requests by criteria");
        return responseDto;
    }

}