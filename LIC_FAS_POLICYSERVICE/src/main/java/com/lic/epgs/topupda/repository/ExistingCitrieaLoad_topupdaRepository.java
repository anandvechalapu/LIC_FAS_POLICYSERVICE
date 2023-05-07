package com.lic.epgs.topupda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.topupda.entity.Topupda;

@Repository
public interface ExistingCitrieaLoad_topupdaRepository extends JpaRepository<Topupda, Long> {

	@Query(value = "SELECT * FROM topupda WHERE is_active = true AND topup_status IN ( 'APPROVED', 'REJECTED' ) ORDER BY modified_on DESC", nativeQuery = true)
	public List<Topupda> getExistingCriteriaLoadTopupdaData(String unitCode, String quotationNumber);
	
	
	@Query(value = "SELECT * FROM topupda WHERE unit_code = ? and quotation_number = ? and is_active = true AND topup_status IN ( 'APPROVED', 'REJECTED' ) ORDER BY modified_on DESC", nativeQuery = true)
	public List<Topupda> getExistingCriteriaLoadTopupdaDataBasedOnUnitCodeAndQuotationNumber(String unitCode, String quotationNumber);

}