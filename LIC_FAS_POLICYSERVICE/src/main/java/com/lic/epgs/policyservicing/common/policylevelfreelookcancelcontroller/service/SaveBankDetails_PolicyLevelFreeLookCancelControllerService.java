package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.domain.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.domain.PolicyBankOldDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository.SaveBankDetails_PolicyLevelFreeLookCancelControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveBankDetails_PolicyLevelFreeLookCancelControllerService {

    @Autowired
    private SaveBankDetails_PolicyLevelFreeLookCancelControllerRepository saveBankDetails_PolicyLevelFreeLookCancelControllerRepository;

    public FreeLookCancellationResponseDto saveBankDetails(PolicyBankOldDto policyBankOldDto) {
        return saveBankDetails_PolicyLevelFreeLookCancelControllerRepository.saveBankDetails(policyBankOldDto);
    }

}