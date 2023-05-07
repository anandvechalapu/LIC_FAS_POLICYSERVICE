package com.lic.epgs.topupda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.topupda.entity.Topupda;

@Repository
public interface ExistingCitrieaLoad_topupdaRepository extends JpaRepository<Topupda, Long> {

	@Query(value="SELECT * FROM topupda WHERE isActive=true", nativeQuery=true)
	public List<Topupda> getExistingCriteriaLoadTopupdaData();
	
	@Query(value="SELECT * FROM topupda WHERE isActive=true AND unit_code=?1 AND quotation_number=?2", nativeQuery=true)
	public List<Topupda> getExistingCriteriaLoadTopupdaDataBasedOnUnitCodeAndQuotationNumber(String unitCode,String quotationNumber);
	
}

package com.lic.epgs.topupda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.topupda.entity.Topupda;
import com.lic.epgs.topupda.service.ExistingCitrieaLoad_topupdaService;

@RestController
public class ExistingCitrieaLoad_topupdaController {

	@Autowired
	ExistingCitrieaLoad_topupdaService existingCitrieaLoad_topupdaService;
	
	@GetMapping("/getExistingCriteriaLoadTopupdaData")
	public List<Topupda> getExistingCriteriaLoadTopupdaData(){
		return existingCitrieaLoad_topupdaService.getExistingCriteriaLoadTopupdaData();
	}
	
	@GetMapping("/getExistingCriteriaLoadTopupdaDataBasedOnUnitCodeAndQuotationNumber")
	public List<Topupda> getExistingCriteriaLoadTopupdaDataBasedOnUnitCodeAndQuotationNumber(@RequestParam("unitCode") String unitCode,
			@RequestParam("quotationNumber") String quotationNumber){
		return existingCitrieaLoad_topupdaService.getExistingCriteriaLoadTopupdaDataBasedOnUnitCodeAndQuotationNumber(unitCode, quotationNumber);
	}
	
}