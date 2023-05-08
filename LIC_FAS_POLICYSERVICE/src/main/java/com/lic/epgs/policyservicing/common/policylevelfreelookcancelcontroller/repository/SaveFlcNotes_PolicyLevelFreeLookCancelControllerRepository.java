package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationNotesDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface SaveFlcNotes_PolicyLevelFreeLookCancelControllerRepository {

    Logger logger = LoggerFactory.getLogger(SaveFlcNotes_PolicyLevelFreeLookCancelControllerRepository.class);

    FreeLookCancellationResponseDto saveFlcNotes(Long freeLookId, Long policyId, Long serviceId, String notesText);

    default void validateInputs(Long freeLookId, Long policyId, Long serviceId, String notesText){
        if(freeLookId == null || policyId == null || serviceId == null || notesText == null){
            throw new IllegalArgumentException("Missing one of the required parameters");
        }
    }

}