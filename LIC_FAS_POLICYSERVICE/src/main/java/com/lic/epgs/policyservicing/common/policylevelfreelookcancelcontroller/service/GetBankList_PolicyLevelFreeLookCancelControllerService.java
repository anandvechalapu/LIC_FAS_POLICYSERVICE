package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.MphBankDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.PolicyBankOldDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository.GetBankList_PolicyLevelFreeLookCancelControllerRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class GetBankList_PolicyLevelFreeLookCancelControllerService {

    private static final Logger log = LoggerFactory.getLogger(GetBankList_PolicyLevelFreeLookCancelControllerService.class);

    @Autowired
    private GetBankList_PolicyLevelFreeLookCancelControllerRepository getBankList_PolicyLevelFreeLookCancelControllerRepository;
    private final ModelMapper modelMapper;

    public GetBankList_PolicyLevelFreeLookCancelControllerService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public FreeLookCancellationResponseDto getBankList(Long id) {
        FreeLookCancellationResponseDto commonDto = new FreeLookCancellationResponseDto();
        try {
            log.info("getBankList method execution started at {}", LocalTime.now());
            // call repository
            commonDto = getBankList_PolicyLevelFreeLookCancelControllerRepository.getBankList(id);
            log.info("getBankList method execution finished at {}", LocalTime.now());
        } catch (Exception e) {
            log.error("Error while fetching bank details. {}", e.getMessage());
            commonDto.setTransactionStatus("ERROR");
            commonDto.setTransactionMessage("FAIL");
        }
        return commonDto;
    }

    public PolicyBankOldDto convertNewDtoToOld(MphBankDto mphBankDto) {
        // convert new dto to old
        PolicyBankOldDto policyBankOldDto = new PolicyBankOldDto();
        policyBankOldDto.setBankId(mphBankDto.getBankId());
        policyBankOldDto.setBankName(mphBankDto.getBankName());
        policyBankOldDto.setBranchName(mphBankDto.getBranchName());
        policyBankOldDto.setAccountNumber(mphBankDto.getAccountNumber());
        policyBankOldDto.setIfscCode(mphBankDto.getIfscCode());
        policyBankOldDto.setMicrCode(mphBankDto.getMicrCode());
        return policyBankOldDto;
    }

}