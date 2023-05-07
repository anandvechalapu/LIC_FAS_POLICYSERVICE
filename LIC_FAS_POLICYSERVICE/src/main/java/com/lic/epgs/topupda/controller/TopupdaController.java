package com.lic.epgs.topupda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.topupda.model.TopupdaModel;
import com.lic.epgs.topupda.service.AnnutityApiTopupdaService;

@RestController
@RequestMapping("/topupda")
public class TopupdaController {
	
	@Autowired
	private AnnutityApiTopupdaService annutityApiTopupdaService;
	
	@PostMapping("/save")
	public TopupdaModel saveTopupda(@RequestBody TopupdaModel topupdaModel) {
		return annutityApiTopupdaService.saveTopupda(topupdaModel);
	}
	
	@PostMapping("/find")
	public TopupdaModel findByQuotationNumber(@RequestBody String quotationNumber) {
		return annutityApiTopupdaService.findByQuotationNumber(quotationNumber);
	}
	
	@PostMapping("/update")
	public void updateAmountStatus(@RequestBody String action, String anReason, Long id) {
		annutityApiTopupdaService.updateAmountStatus(action, anReason, id);
	}

}