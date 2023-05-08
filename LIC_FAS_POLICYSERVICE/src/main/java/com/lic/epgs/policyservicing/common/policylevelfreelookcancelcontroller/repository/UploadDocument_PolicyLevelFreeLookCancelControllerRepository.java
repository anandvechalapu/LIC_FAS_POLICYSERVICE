package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.entity.PolicyServiceDocumentTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UploadDocument_PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<PolicyServiceDocumentTempEntity, Long> {

    PolicyServiceDocumentTempEntity findByDocumentId(long documentId);

}