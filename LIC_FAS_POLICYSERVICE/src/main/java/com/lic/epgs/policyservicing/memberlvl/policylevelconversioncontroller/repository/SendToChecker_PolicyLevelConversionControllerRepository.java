package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.PolicyLevelConversionDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.PolicyLevelConversionTempEntity;

public interface SendToChecker_PolicyLevelConversionControllerRepository 
    extends JpaRepository<PolicyLevelConversionTempEntity, String> {
    
    @Query(value = "SELECT * FROM PolicyLevelConversionTempEntity WHERE conversionId = ?1", 
        nativeQuery=true)
    PolicyLevelConversionDto findByConversionId(String conversionId);
    
    @Query(value = "SELECT * FROM PolicyLevelConversionTempEntity WHERE conversionId = ?1 AND status = 'Approved' OR status = 'Rejected'", 
        nativeQuery=true)
    PolicyLevelConversionDto findByConversionIdAndStatus(String conversionId);
    
    @Modifying
    @Transactional
    @Query(value = "UPDATE PolicyLevelConversionTempEntity SET status = 'SendForApproval', workflowStatus = 'SendForApproval' WHERE conversionId = ?1", 
        nativeQuery=true)
    void updateConversionStatusByConversionId(String conversionId);
}