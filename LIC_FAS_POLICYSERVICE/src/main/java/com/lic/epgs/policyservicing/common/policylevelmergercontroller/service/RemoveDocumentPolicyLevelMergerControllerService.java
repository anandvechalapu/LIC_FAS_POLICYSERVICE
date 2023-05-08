package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.domain.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.RemoveDocumentPolicyLevelMergerControllerRepository;

@Service
public class RemoveDocumentPolicyLevelMergerControllerService {

    @Autowired
    private RemoveDocumentPolicyLevelMergerControllerRepository removeDocumentPolicyLevelMergerControllerRepository;

    public PolicyLevelMergerApiResponse removeDocument(Long documentId, Long mergeId) {
        return removeDocumentPolicyLevelMergerControllerRepository.removeDocument(documentId, mergeId);
    }
}