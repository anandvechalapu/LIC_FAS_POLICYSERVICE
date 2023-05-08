package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.entity.PolicyServiceDocumentTempEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<PolicyServiceDocumentTempEntity, Long> {

    PolicyServiceDocumentTempEntity findByDocumentId(Long documentId);
    
    PolicyServiceDocumentTempEntity save(PolicyServiceDocumentTempEntity document);
    
    void deleteByDocumentId(Long documentId);
    
}