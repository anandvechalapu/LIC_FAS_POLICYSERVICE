package com.lic.epgs.policyservicing.common.memberlvl.repository;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionDetailsEntity;
import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommissionRepository extends JpaRepository<CommissionEntity, Long> {

    // Get in progress commissions for specified unit code
    @Query("SELECT c FROM CommissionEntity c WHERE c.isInprogress = true AND c.unitCode = :unitCode")
    Iterable<CommissionEntity> getInprogressLoad(@Param("unitCode") String unitCode);

    // Get in progress commissions created by makers for specified unit code
    @Query("SELECT c FROM CommissionEntity c JOIN c.details d WHERE c.isInprogress = true AND c.unitCode = :unitCode AND d.maker = true")
    Iterable<CommissionEntity> getInprogressMakerLoad(@Param("unitCode") String unitCode);

}