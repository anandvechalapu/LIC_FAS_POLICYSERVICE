package com.lic.epgs.topupda.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.topupda.dto.TopupdaApiResponseDto;
import com.lic.epgs.topupda.dto.TopupdaDto;
import com.lic.epgs.topupda.service.InprogressCriteriaLoadTopupdaService;

@RestController
@RequestMapping("/topupda")
public class InprogressCriteriaLoadTopupdaController {

    private static final Logger logger = LoggerFactory.getLogger(InprogressCriteriaLoadTopupdaController.class);

    @Autowired
    private InprogressCriteriaLoadTopupdaService inprogressCriteriaLoadTopupdaService;

    @GetMapping
    public ResponseEntity<TopupdaApiResponseDto> getRequestsByCriteria(@RequestParam(name = "role") String role,
        @RequestParam(name = "unitCode") String unitCode, @RequestParam(name = "quotationNumber") String quotationNumber) {

        logger.info("Starting method to get requests by criteria");

        TopupdaApiResponseDto responseDto = inprogressCriteriaLoadTopupdaService.getRequestsByCriteria(role, unitCode, quotationNumber);

        if (responseDto == null) {
            return new ResponseEntity<TopupdaApiResponseDto>(HttpStatus.NO_CONTENT);
        }

        logger.info("Ending method to get requests by criteria");
        return new ResponseEntity<TopupdaApiResponseDto>(responseDto, HttpStatus.OK);
    }

}