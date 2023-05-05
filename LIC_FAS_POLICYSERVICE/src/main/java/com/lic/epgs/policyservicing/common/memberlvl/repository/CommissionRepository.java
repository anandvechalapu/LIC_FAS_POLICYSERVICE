package com.lic.epgs.policyservicing.common.memberlvl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionEntity;
import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionDetailsEntity;

public interface CommissionRepository extends JpaRepository<CommissionEntity, Long> {
	
	@Query("SELECT c FROM CommissionEntity c WHERE c.role = :role AND c.unitCode = :unitCode")
	public CommissionEntity getInprogressLoad(String role, String unitCode);
	
	@Query("SELECT c FROM CommissionDetailsEntity c WHERE c.maker = :role AND c.unitCode = :unitCode")
	public CommissionDetailsEntity getInprogressMakerLoad(String role, String unitCode);

}