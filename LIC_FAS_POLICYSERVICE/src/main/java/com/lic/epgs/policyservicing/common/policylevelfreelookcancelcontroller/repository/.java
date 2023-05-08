package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.MphBankDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.PolicyBankOldDto;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;

@Repository
public class GetBankList_PolicyLevelFreeLookCancelControllerRepository {

    private static final Logger log = LoggerFactory.getLogger(GetBankList_PolicyLevelFreeLookCancelControllerRepository.class);

    private final MphBankTempRepository mphBankTempRepository;
    private final ModelMapper modelMapper;

    public GetBankList_PolicyLevelFreeLookCancelControllerRepository(MphBankTempRepository mphBankTempRepository, ModelMapper modelMapper) {
        this.mphBankTempRepository = mphBankTempRepository;
        this.modelMapper = modelMapper;
    }

    public FreeLookCancellationResponseDto getBankList(Long id) {
        FreeLookCancellationResponseDto commonDto = new FreeLookCancellationResponseDto();
        try {
            log.info("getBankList method execution started at {}", LocalTime.now());
            // fetch bank info
            MphBankTempEntity mphBankTempEntity = mphBankTempRepository.findByMphBankId(id);
            if (mphBankTempEntity != null) {
                // map entity to dto
                MphBankDto mphBankDto = modelMapper.map(mphBankTempEntity, MphBankDto.class);
                // convert new dto to old
                PolicyBankOldDto policyBankOldDto = convertNewDtoToOld(mphBankDto);
                // set response
                commonDto.setTransactionStatus("SUCCESS");
                commonDto.setTransactionMessage("FETCH");
                commonDto.setPolicyBankDto(policyBankOldDto);
            } else {
                commonDto.setTransactionStatus("ERROR");
                commonDto.setTransactionMessage("DENY");
            }
            log.info("getBankList method execution finished at {}", LocalTime.now());
        } catch (Exception e) {
            log.error("Error while fetching bank details. {}", e.getMessage());
            commonDto.setTransactionStatus("ERROR");
            commonDto.setTransactionMessage("FAIL");
        }
        return commonDto;
    }

    private PolicyBankOldDto convertNewDtoToOld(MphBankDto mphBankDto) {
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