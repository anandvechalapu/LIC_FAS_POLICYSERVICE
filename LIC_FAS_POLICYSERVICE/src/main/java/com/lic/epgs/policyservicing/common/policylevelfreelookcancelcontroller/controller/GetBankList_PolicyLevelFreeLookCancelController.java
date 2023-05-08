package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.MphBankDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.PolicyBankOldDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.MphBankTempEntity;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.GetBankList_PolicyLevelFreeLookCancelControllerService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class GetBankList_PolicyLevelFreeLookCancelController {

    private static final Logger log = LoggerFactory.getLogger(GetBankList_PolicyLevelFreeLookCancelController.class);

    @Autowired
    private GetBankList_PolicyLevelFreeLookCancelControllerService getBankList_PolicyLevelFreeLookCancelControllerService;
    private final ModelMapper modelMapper;

    public GetBankList_PolicyLevelFreeLookCancelController(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @GetMapping(value = "/getBankList/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FreeLookCancellationResponseDto> getBankList(@PathVariable("id") Long id) {
        FreeLookCancellationResponseDto commonDto = new FreeLookCancellationResponseDto();
        try {
            log.info("getBankList method execution started at {}", LocalTime.now());
            // call service
            commonDto = getBankList_PolicyLevelFreeLookCancelControllerService.getBankList(id);
            log.info("getBankList method execution finished at {}", LocalTime.now());
        } catch (Exception e) {
            log.error("Error while fetching bank details. {}", e.getMessage());
            commonDto.setTransactionStatus("ERROR");
            commonDto.setTransactionMessage("FAIL");
        }
        return ResponseEntity.ok(commonDto);
    }

    @GetMapping(value = "/convertNewDtoToOld/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PolicyBankOldDto> convertNewDtoToOld(@PathVariable("id") Long id) {
        MphBankDto mphBankDto = new MphBankDto();
        try {
            log.info("convertNewDtoToOld method execution started at {}", LocalTime.now());
            // call repository
            MphBankTempEntity mphBankTempEntity = getBankList_PolicyLevelFreeLookCancelControllerService.getBankList(id);
            // convert entity to dto
            mphBankDto = modelMapper.map(mphBankTempEntity, MphBankDto.class);
            // call service
            PolicyBankOldDto policyBankOldDto = getBankList_PolicyLevelFreeLookCancelControllerService.convertNewDtoToOld(mphBankDto);
            log.info("convertNewDtoToOld method execution finished at {}", LocalTime.now());
            return ResponseEntity.ok(policyBankOldDto);
        } catch (Exception e) {
            log.error("Error while converting new dto to old. {}",