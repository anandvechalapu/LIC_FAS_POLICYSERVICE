package com.lic.epgs.topupda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.topupda.model.TopupdaTempEntity;

@Repository
public interface TopUpDaTempRepository extends JpaRepository<TopupdaTempEntity, Long>{
	
	TopupdaTempEntity save(TopupdaTempEntity topupda);
	
	TopupdaTempEntity findByTopupAmountAndTopupCurrencyAndTopupRemarksAndTopupDate(Double topupAmount, String topupCurrency, 
																		String topupRemarks, String topupDate);
	
	void deleteByTopupAmountAndTopupCurrencyAndTopupRemarksAndTopupDate(Double topupAmount, String topupCurrency, 
																		String topupRemarks, String topupDate);
	
	TopupdaTempEntity findByTopupStatusAndIsActiveAndCreatedOn(String topupStatus, Boolean isActive, String createdOn);
	
	void deleteByTopupStatusAndIsActiveAndCreatedOn(String topupStatus, Boolean isActive, String createdOn);
	
}