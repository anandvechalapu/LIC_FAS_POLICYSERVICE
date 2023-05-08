package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationSearchDto;

public interface InprogressCitrieaSearch_PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<FreeLookCancellationResponseDto, Long> {

    // Query to search for in-progress free-look cancellation policies
    @Query("SELECT p FROM FreeLookCancellationResponseDto p WHERE p.role = ?1 AND p.policyNumber = ?2 AND p.mphCode = ?3 AND p.mphName = ?4 AND p.dateRange BETWEEN ?5 AND ?6 AND p.product = ?7 AND p.lob = ?8 AND p.freeLookStatus = ?9 AND p.unitCode = ?10")
    public List<FreeLookCancellationResponseDto> searchInProgressFreeLookCancellationPolicies(String role, String policyNumber, String mphCode, String mphName, String fromDate, String toDate, String product, String lob, String freeLookStatus, String unitCode);

    // Query to search for in-progress free-look cancellation policies based on maker role
    @Query("SELECT p FROM FreeLookCancellationResponseDto p WHERE p.role = ?1 AND p.dateRange BETWEEN ?2 AND ?3 AND p.freeLookStatus NOT IN ('Approved', 'Rejected', 'Checked')")
    public List<FreeLookCancellationResponseDto> searchInProgressFreeLookCancellationPoliciesByMakerRole(String role, String fromDate, String toDate);

    // Query to search for in-progress free-look cancellation policies based on checker role
    @Query("SELECT p FROM FreeLookCancellationResponseDto p WHERE p.role = ?1 AND p.dateRange BETWEEN ?2 AND ?3 AND p.freeLookStatus NOT IN ('Approved', 'Rejected', 'Drafted', 'Made', 'Reopened')")
    public List<FreeLookCancellationResponseDto> searchInProgressFreeLookCancellationPoliciesByCheckerRole(String role, String fromDate, String toDate);

}