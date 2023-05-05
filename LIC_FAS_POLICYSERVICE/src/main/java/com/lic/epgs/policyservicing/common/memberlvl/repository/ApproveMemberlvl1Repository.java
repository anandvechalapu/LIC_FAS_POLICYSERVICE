package com.lic.epgs.policyservicing.common.memberlvl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.policyservicing.common.memberlvl.model.Transfer;

public interface ApproveMemberlvl1Repository extends JpaRepository<Transfer, Long> {
 
    @Modifying
    @Transactional
    @Query("UPDATE Transfer t SET t.status = :status, t.modifiedBy = :modifiedBy WHERE t.transferId = :transferId and t.status = 'pending_approval'")
    int updateStatusForApproval(@Param("status") String status, @Param("transferId") long transferId, @Param("modifiedBy") String modifiedBy);
    
    @Query("SELECT t FROM Transfer t WHERE t.transferId = :transferId")
    Transfer getTransferDetails(@Param("transferId") long transferId);
    
    @Modifying
    @Transactional
    @Query("UPDATE Transfer t SET t.status = :status, t.modifiedBy = :modifiedBy WHERE t.transferId = :transferId and t.status = 'pending_destination'")
    int updateStatusForDestination(@Param("status") String status, @Param("transferId") long transferId, @Param("modifiedBy") String modifiedBy);
}