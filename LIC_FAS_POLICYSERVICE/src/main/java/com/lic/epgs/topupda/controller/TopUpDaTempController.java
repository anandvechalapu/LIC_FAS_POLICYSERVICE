package com.lic.epgs.topupda.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.topupda.model.TopupdaTempEntity;
import com.lic.epgs.topupda.service.TopUpDaTempService;

@RestController
@RequestMapping("/topupda")
public class TopUpDaTempController {
	
	@Autowired
	TopUpDaTempService topUpDaTempService;
	
	@PostMapping
	public TopupdaTempEntity save(@RequestBody TopupdaTempEntity topupda) {
		return topUpDaTempService.save(topupda);
	}
	
	@GetMapping("/{id}")
	public Optional<TopupdaTempEntity> findById(@PathVariable Long id){
		return topUpDaTempService.findById(id);
	}
	
	@GetMapping
	public List<TopupdaTempEntity> findAll(){
		return topUpDaTempService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id){
		topUpDaTempService.deleteById(id);
	}
	
	@DeleteMapping("/topupAmount/{topupAmount}/topupCurrency/{topupCurrency}/topupRemarks/{topupRemarks}/topupDate/{topupDate}")
	public void deleteByTopupAmountAndTopupCurrencyAndTopupRemarksAndTopupDate(@PathVariable Double topupAmount, 
			@PathVariable String topupCurrency, @PathVariable String topupRemarks, @PathVariable String topupDate) {
		topUpDaTempService.deleteByTopupAmountAndTopupCurrencyAndTopupRemarksAndTopupDate(topupAmount, topupCurrency, topupRemarks, topupDate);
	}
	
	@DeleteMapping("/topupStatus/{topupStatus}/isActive/{isActive}/createdOn/{createdOn}")
	public void deleteByTopupStatusAndIsActiveAndCreatedOn(@PathVariable String topupStatus, @PathVariable Boolean isActive, 
			@PathVariable String createdOn) {
		topUpDaTempService.deleteByTopupStatusAndIsActiveAndCreatedOn(topupStatus, isActive, createdOn);
	}

}