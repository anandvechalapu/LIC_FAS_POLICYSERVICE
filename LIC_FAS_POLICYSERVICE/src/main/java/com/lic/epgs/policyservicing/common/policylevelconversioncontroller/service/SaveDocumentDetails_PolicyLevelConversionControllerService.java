package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.DocumentDetails;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.SaveDocumentDetails_PolicyLevelConversionControllerRepository;

@Service
public class SaveDocumentDetails_PolicyLevelConversionControllerService {

    @Autowired
    private SaveDocumentDetails_PolicyLevelConversionControllerRepository saveDocumentDetails_PolicyLevelConversionControllerRepository;

    // Method to save the document details
    public DocumentDetails save(DocumentDetails documentDetails) {
        return saveDocumentDetails_PolicyLevelConversionControllerRepository.save(documentDetails);
    }

    // Method to retrieve list of documents for a specific conversion
    public List<DocumentDetails> findByConversionId(Long conversionId) {
        return saveDocumentDetails_PolicyLevelConversionControllerRepository.findByConversionId(conversionId);
    }
}