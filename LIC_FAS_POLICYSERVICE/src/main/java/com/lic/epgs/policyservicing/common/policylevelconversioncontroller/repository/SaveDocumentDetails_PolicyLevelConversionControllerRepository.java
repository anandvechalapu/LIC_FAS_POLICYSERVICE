package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.DocumentDetails;

public interface SaveDocumentDetails_PolicyLevelConversionControllerRepository extends JpaRepository<DocumentDetails, Long> {

    // Method to save the document details
    DocumentDetails save(DocumentDetails documentDetails);

    // Method to retrieve list of documents for a specific conversion
    List<DocumentDetails> findByConversionId(Long conversionId);
}