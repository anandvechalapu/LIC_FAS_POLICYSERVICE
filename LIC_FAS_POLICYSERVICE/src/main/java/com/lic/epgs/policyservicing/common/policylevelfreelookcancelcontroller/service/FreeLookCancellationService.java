package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository.FreeLookCancellationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreeLookCancellationService {

    @Autowired
    private FreeLookCancellationRepository freeLookCancellationRepository;

    public List<FreeLookCancellationResponseDto> getFlcDocumentDetails(Long freeLookCancellationId) {
        return freeLookCancellationRepository.getFlcDocumentDetails(freeLookCancellationId);
    }

    public void moveToFlcMainTable(Long freeLookCancellationId) {
        freeLookCancellationRepository.moveToFlcMainTable(freeLookCancellationId);
    }
}