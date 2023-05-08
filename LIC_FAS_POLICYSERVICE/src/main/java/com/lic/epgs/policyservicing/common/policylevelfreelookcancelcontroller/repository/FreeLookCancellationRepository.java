package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FreeLookCancellationRepository extends JpaRepository<FreeLookCancellationResponseDto, Long> {

    @Query("SELECT f FROM FreeLookCancellationResponseDto f WHERE f.freeLookCancellationId = ?1")
    List<FreeLookCancellationResponseDto> getFlcDocumentDetails(Long freeLookCancellationId);
    
    @Query("INSERT INTO FreeLookCancellationResponseDto SELECT * FROM tempTable WHERE freeLookCancellationId = ?1")
    void moveToFlcMainTable(Long freeLookCancellationId);
}