package com.lic.epgs.policyservicing.common.memberlvl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutTempEntity;
import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutMasterEntity;
import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutMemberTempEntity;

@Repository
public interface RejectMemberlvl16Repository extends JpaRepository<TransferInAndOutTempEntity, Long> {
	
	@Query("SELECT t FROM TransferInAndOutTempEntity t WHERE t.unitCode = ?1 AND t.transferId = ?2")
	TransferInAndOutTempEntity findByUnitCodeAndTransferId(String unitCode, Long transferId);
	
	TransferInAndOutMasterEntity save(TransferInAndOutMasterEntity transferInAndOutMasterEntity);
	
	TransferInAndOutMemberTempEntity save(TransferInAndOutMemberTempEntity transferInAndOutMemberTempEntity);
	
	TransferInAndOutTempEntity save(TransferInAndOutTempEntity transferInAndOutTempEntity);
	
}