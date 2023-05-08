package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyLevelDetailsChangeController;

public interface SendToRejectPolicyLevelDetailsChangeControllerRepository extends JpaRepository<PolicyLevelDetailsChangeController, Integer> {
    
    @Modifying
    @Query(value="UPDATE PolicyLevelDetailsChangeController policy SET policy.policyStatus = 'REJECTED', policy.rejectionRemarks = :rejectionRemarks, policy.reasonCode = :reasonCode WHERE policy.policyDtlsId = :policyDtlsId")
    int updatePolicyStatusAndRejectionRemarksAndReasonCode(@Param("policyDtlsId") Integer policyDtlsId, @Param("rejectionRemarks") String rejectionRemarks, @Param("reasonCode") String reasonCode);
    
    @Query(value="SELECT * FROM PolicyLevelDetailsChangeController policy WHERE policy.policyDtlsId = :policyDtlsId", nativeQuery=true)
    PolicyLevelDetailsChangeController findByPolicyDtlsId(@Param("policyDtlsId") Integer policyDtlsId);
    
    @Query(value="INSERT INTO PolicyLevelDetailsChangeController policy (policy.policyDtlsId, policy.policyStatus, policy.rejectionRemarks, policy.reasonCode) VALUES (:policyDtlsId, 'REJECTED', :rejectionRemarks, :reasonCode)", nativeQuery=true)
    int insertPolicyDtlsIdAndRejectionRemarksAndReasonCode(@Param("policyDtlsId") Integer policyDtlsId, @Param("rejectionRemarks") String rejectionRemarks, @Param("reasonCode") String reasonCode);
    
    @Query(value="SELECT policy.policyDtlsId FROM PolicyLevelDetailsChangeController policy WHERE policy.policyDtlsId = :policyDtlsId", nativeQuery=true)
    Integer findPolicyDtlsIdByPolicyDtlsId(@Param("policyDtlsId") Integer policyDtlsId);
}