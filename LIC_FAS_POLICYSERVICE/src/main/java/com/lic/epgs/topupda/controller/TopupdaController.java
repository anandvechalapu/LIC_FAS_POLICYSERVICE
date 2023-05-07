package com.lic.epgs.topupda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.topupda.model.TopupdaTempEntity;
import com.lic.epgs.topupda.model.TopupdaEntity;
import com.lic.epgs.topupda.service.TopupdaService;

@RestController
@RequestMapping("/topupda")
public class TopupdaController {

	@Autowired
	private TopupdaService topupdaService;

	@GetMapping("/temp/{topupId}")
	public TopupdaTempEntity findTopupdaTempByTopupId(@PathVariable Long topupId) {
		return topupdaService.findTopupdaTempByTopupId(topupId);
	}

	@PostMapping("/temp")
	public TopupdaTempEntity saveTopupdaTemp(@RequestBody TopupdaTempEntity topupdaTempEntity) {
		return topupdaService.saveTopupdaTemp(topupdaTempEntity);
	}

	@GetMapping("/{topupId}")
	public TopupdaEntity findTopupdaByTopupId(@PathVariable Long topupId) {
		return topupdaService.findTopupdaByTopupId(topupId);
	}

	@PostMapping
	public TopupdaEntity saveTopupda(@RequestBody TopupdaEntity topupdaEntity) {
		return topupdaService.saveTopupda(topupdaEntity);
	}

}