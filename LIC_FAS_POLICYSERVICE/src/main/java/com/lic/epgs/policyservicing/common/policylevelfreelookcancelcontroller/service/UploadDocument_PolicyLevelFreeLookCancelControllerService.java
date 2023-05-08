package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.entity.PolicyServiceDocumentTempEntity;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository.UploadDocument_PolicyLevelFreeLookCancelControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadDocument_PolicyLevelFreeLookCancelControllerService {

    @Autowired
    private UploadDocument_PolicyLevelFreeLookCancelControllerRepository uploadDocument_PolicyLevelFreeLookCancelControllerRepository;

    public PolicyServiceDocumentTempEntity getDocumentById(long documentId) {
        return uploadDocument_PolicyLevelFreeLookCancelControllerRepository.findByDocumentId(documentId);
    }

}