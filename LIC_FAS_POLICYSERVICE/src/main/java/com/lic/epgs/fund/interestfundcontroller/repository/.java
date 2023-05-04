package com.lic.epgs.fund.interestfundcontroller.repository;

import com.lic.epgs.fund.interestfundcontroller.model.DebitRequestDto;
import com.lic.epgs.fund.interestfundcontroller.model.InterestErrorDto;
import com.lic.epgs.fund.interestfundcontroller.model.InterestRateResponseDto;
import com.lic.epgs.fund.interestfundcontroller.service.FundRestApiService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PolicyDebitRepository {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyDebitRepository.class);

    @Autowired
    private FundRestApiService fundRestApiService;

    public InterestRateResponseDto debitPolicy(DebitRequestDto debitRequestDto) {
        InterestRateResponseDto responseDto = new InterestRateResponseDto();
        try {
            if (debitRequestDto.isActivePolicy()) {
                responseDto = fundRestApiService.debitPolicy(debitRequestDto);
                responseDto.setStatus("SUCCESS");
            } else {
                responseDto.setStatus("ERROR");
                responseDto.getErrorData().add(new InterestErrorDto("INVALID_POLICY", "Invalid policy number"));
            }
            saveErrorDetails(responseDto);
            LOGGER.info("Debited policy number: {}", debitRequestDto.getPolicyNumber());
        } catch (Exception e) {
            LOGGER.error("Error while debiting policy: {}", debitRequestDto.getPolicyNumber(), e);
            responseDto.setStatus("ERROR");
            responseDto.getErrorData().add(new InterestErrorDto("INTERNAL_ERROR", e.getMessage()));
        }
        return responseDto;
    }

    private void saveErrorDetails(InterestRateResponseDto responseDto) {
        //todo: save error details to the database
    }

}