package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.MphBankDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.entity.FreeLookCancellationEntity;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository.FreeLookCancellationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreeLookCancellationService {

    @Autowired
    private FreeLookCancellationRepository freeLookCancellationRepository;

    public FreeLookCancellationEntity getExistingFreeLookCancellationById(Long freeLookId) {
        return freeLookCancellationRepository.getExistingFreeLookCancellationById(freeLookId);
    }

    public List<MphBankDto> getMphBankDtosByFreeLookId(Long freeLookId) {
        return freeLookCancellationRepository.getExistingFreeLookCancellationById(freeLookId).getPolicyMaster().getMphBankDtos();
    }

    public FreeLookCancellationEntity saveFreeLookCancellation(FreeLookCancellationEntity freeLookCancellationEntity) {
        return freeLookCancellationRepository.save(freeLookCancellationEntity);
    }
}