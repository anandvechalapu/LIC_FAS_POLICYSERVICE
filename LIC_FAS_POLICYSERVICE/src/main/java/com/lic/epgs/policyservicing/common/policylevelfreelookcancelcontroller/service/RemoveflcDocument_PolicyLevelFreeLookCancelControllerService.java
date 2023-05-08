package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.freeLookCancellationDocumentDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository.RemoveflcDocument_PolicyLevelFreeLookCancelControllerRepository;

@Service
public class RemoveflcDocument_PolicyLevelFreeLookCancelControllerService {

    @Autowired
    private RemoveflcDocument_PolicyLevelFreeLookCancelControllerRepository removeflcDocument_PolicyLevelFreeLookCancelControllerRepository;

    public freeLookCancellationDocumentDto removeFLCDocument(String documentId, String freeLookId, String modifiedBy) {
        return removeflcDocument_PolicyLevelFreeLookCancelControllerRepository.removeFLCDocument(documentId, freeLookId, modifiedBy);
    }

    public TransactionStatus removeFlcDocumentStatus(String documentId, String freeLookId) {
        return removeflcDocument_PolicyLevelFreeLookCancelControllerRepository.removeFlcDocumentStatus(documentId, freeLookId);
    }

}