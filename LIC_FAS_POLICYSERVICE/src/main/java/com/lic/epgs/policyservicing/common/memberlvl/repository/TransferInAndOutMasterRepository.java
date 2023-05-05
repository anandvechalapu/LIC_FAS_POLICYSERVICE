package com.lic.epgs.policyservicing.common.memberlvl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.memberlvl.entity.TransferInAndOutMasterEntity;

@Repository
public interface TransferInAndOutMasterRepository extends JpaRepository<TransferInAndOutMasterEntity, Long> {

    TransferInAndOutMasterEntity findByUnitCodeAndTransferId(String unitCode, String transferId);

}