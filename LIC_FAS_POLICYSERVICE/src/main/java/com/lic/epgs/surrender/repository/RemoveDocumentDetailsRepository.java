package com.lic.epgs.surrender.repository;

import com.lic.epgs.surrender.entity.CommonDocsTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface RemoveDocumentDetailsRepository extends JpaRepository<CommonDocsTempEntity, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE CommonDocsTempEntity c SET c.isActive = false WHERE c.surrenderId = ?1 AND c.docId = ?2")
    void removeDocumentDetails(Long surrenderId, Integer docId);
}