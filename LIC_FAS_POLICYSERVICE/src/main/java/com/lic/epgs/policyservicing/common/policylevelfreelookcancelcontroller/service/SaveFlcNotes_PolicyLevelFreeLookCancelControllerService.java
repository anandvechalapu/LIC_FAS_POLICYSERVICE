package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationNotesDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository.SaveFlcNotes_PolicyLevelFreeLookCancelControllerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveFlcNotes_PolicyLevelFreeLookCancelControllerService {

    Logger logger = LoggerFactory.getLogger(SaveFlcNotes_PolicyLevelFreeLookCancelControllerService.class);

    @Autowired
    SaveFlcNotes_PolicyLevelFreeLookCancelControllerRepository saveFlcNotes_PolicyLevelFreeLookCancelControllerRepository;

    public FreeLookCancellationResponseDto saveFlcNotes(Long freeLookId, Long policyId, Long serviceId, String notesText) {
        saveFlcNotes_PolicyLevelFreeLookCancelControllerRepository.validateInputs(freeLookId, policyId, serviceId, notesText);

        FreeLookCancellationNotesDto freeLookCancellationNotesDto = new FreeLookCancellationNotesDto();
        freeLookCancellationNotesDto.setFreeLookId(freeLookId);
        freeLookCancellationNotesDto.setPolicyId(policyId);
        freeLookCancellationNotesDto.setServiceId(serviceId);
        freeLookCancellationNotesDto.setNotesText(notesText);

        return saveFlcNotes_PolicyLevelFreeLookCancelControllerRepository.saveFlcNotes(freeLookId, policyId, serviceId, notesText);
    }

}