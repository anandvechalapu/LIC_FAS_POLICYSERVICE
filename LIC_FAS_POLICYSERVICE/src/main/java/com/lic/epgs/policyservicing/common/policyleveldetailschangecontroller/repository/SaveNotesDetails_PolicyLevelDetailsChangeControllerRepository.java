package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyServiceNotesTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface SaveNotesDetails_PolicyLevelDetailsChangeControllerRepository extends JpaRepository<PolicyServiceNotesTempEntity, Long> {

    @Transactional
    @Modifying
    @Query("UPDATE PolicyServiceNotesTempEntity p SET p.active = true WHERE p.policyId = ?1")
    void setPolicyServiceNotesActive(Long policyId);

}