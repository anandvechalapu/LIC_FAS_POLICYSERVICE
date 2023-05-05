package com.lic.epgs.policyservicing.common.memberlvl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionSearchPage;

@Repository
public interface LoadExistingCommissionSearchPageRepository extends JpaRepository<CommissionSearchPage, Long> {

	@Query("SELECT c FROM CommissionSearchPage c WHERE c.unitCode = :unitCode")
	public CommissionSearchPage findByUnitCode(@Param("unitCode") String unitCode);

}