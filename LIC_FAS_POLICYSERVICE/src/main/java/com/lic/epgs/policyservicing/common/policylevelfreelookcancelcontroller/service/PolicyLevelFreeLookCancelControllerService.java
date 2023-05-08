package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.entity.PolicyServiceDocumentTempEntity;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository.PolicyLevelFreeLookCancelControllerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyLevelFreeLookCancelControllerService {

    @Autowired
    private PolicyLevelFreeLookCancelControllerRepository policyLevelFreeLookCancelControllerRepository;

    public PolicyServiceDocumentTempEntity save(PolicyServiceDocumentTempEntity document) {
        return policyLevelFreeLookCancelControllerRepository.save(document);
    }

    public void deleteByDocumentId(Long documentId) {
        policyLevelFreeLookCancelControllerRepository.deleteByDocumentId(documentId);
    }

    public PolicyServiceDocumentTempEntity findByDocumentId(Long documentId) {
        return policyLevelFreeLookCancelControllerRepository.findByDocumentId(documentId);
    }

}