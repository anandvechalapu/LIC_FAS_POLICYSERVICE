package com.lic.epgs.topupda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.topupda.model.TopupdaTempEntity;
import com.lic.epgs.topupda.repository.TopUpDaTempRepository;

@Service
public class TopUpDaTempService {

	@Autowired
	TopUpDaTempRepository topUpDaTempRepository;
	
	public TopupdaTempEntity save(TopupdaTempEntity topupda) {
		return topUpDaTempRepository.save(topupda);
	}
	
	public TopupdaTempEntity findByTopupAmountAndTopupCurrencyAndTopupRemarksAndTopupDate(Double topupAmount, String topupCurrency, 
			String topupRemarks, String topupDate) {
		return topUpDaTempRepository.findByTopupAmountAndTopupCurrencyAndTopupRemarksAndTopupDate(topupAmount, topupCurrency, topupRemarks, topupDate);
	}
	
	public void deleteByTopupAmountAndTopupCurrencyAndTopupRemarksAndTopupDate(Double topupAmount, String topupCurrency, 
			String topupRemarks, String topupDate) {
		topUpDaTempRepository.deleteByTopupAmountAndTopupCurrencyAndTopupRemarksAndTopupDate(topupAmount, topupCurrency, topupRemarks, topupDate);
	}
	
	public TopupdaTempEntity findByTopupStatusAndIsActiveAndCreatedOn(String topupStatus, Boolean isActive, String createdOn) {
		return topUpDaTempRepository.findByTopupStatusAndIsActiveAndCreatedOn(topupStatus, isActive, createdOn);
	}
	
	public void deleteByTopupStatusAndIsActiveAndCreatedOn(String topupStatus, Boolean isActive, String createdOn) {
		topUpDaTempRepository.deleteByTopupStatusAndIsActiveAndCreatedOn(topupStatus, isActive, createdOn);
	}
	
	public List<TopupdaTempEntity> findAll() {
		return topUpDaTempRepository.findAll();
	}
	
	public Optional<TopupdaTempEntity> findById(Long id) {
		return topUpDaTempRepository.findById(id);
	}
	
	public void deleteById(Long id) {
		topUpDaTempRepository.deleteById(id);
	}
	
}