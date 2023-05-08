package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.PolicyLevelConversionController;

@Repository
public interface RemoveDocumentDetails_PolicyLevelConversionControllerRepository extends JpaRepository<PolicyLevelConversionController, Long> {
    
    void deleteByDocumentIdAndConversionIdAndModifiedBy(Long documentId, Long conversionId, String modifiedBy);
    
}