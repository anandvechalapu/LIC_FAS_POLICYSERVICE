package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.entity.FreeLookCancellationEntity;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.MphBankDto;

import java.util.List;

@Repository
public interface FreeLookCancellationRepository extends JpaRepository<FreeLookCancellationEntity, Long> {

    @Query("SELECT f FROM FreeLookCancellationEntity f LEFT JOIN FETCH f.policyMaster pm LEFT JOIN FETCH pm.mphBankDtos WHERE f.id = ?1")
    FreeLookCancellationEntity getExistingFreeLookCancellationById(Long freeLookId);
}