package com.lic.epgs.topupda.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lic.epgs.topupda.model.TopupdaTempEntity;
import com.lic.epgs.topupda.model.TopupdaEntity;
import com.lic.epgs.topupda.repository.TopupdaRepository;
import com.lic.epgs.topupda.repository.TopupdaTempRepository;

@Service
public class TopupdaService {

	@Autowired
	private TopupdaTempRepository topupdaTempRepository;

	@Autowired
	private TopupdaRepository topupdaRepository;

	public TopupdaTempEntity findTopupdaTempByTopupId(Long topupId) {
		return topupdaTempRepository.findByTopupId(topupId);
	}

	public TopupdaTempEntity saveTopupdaTemp(TopupdaTempEntity topupdaTempEntity) {
		return topupdaTempRepository.save(topupdaTempEntity);
	}

	public TopupdaEntity findTopupdaByTopupId(Long topupId) {
		return topupdaRepository.findByTopupId(topupId);
	}

	public TopupdaEntity saveTopupda(TopupdaEntity topupdaEntity) {
		return topupdaRepository.save(topupdaEntity);
	}

}