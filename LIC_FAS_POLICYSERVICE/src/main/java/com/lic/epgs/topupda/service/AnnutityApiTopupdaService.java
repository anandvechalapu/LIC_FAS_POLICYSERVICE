package com.lic.epgs.topupda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.topupda.entity.TopupdaEntity;
import com.lic.epgs.topupda.repository.AnnutityApiTopupdaRepository;

@Service
public class AnnutityApiTopupdaService {
    
    @Autowired
    private AnnutityApiTopupdaRepository annutityApiTopupdaRepository;

    public TopupdaEntity saveTopupda(TopupdaEntity topupdaEntity){
        return annutityApiTopupdaRepository.save(topupdaEntity);
    }

    public TopupdaEntity findByQuotationNumber(String quotationNumber){
        return annutityApiTopupdaRepository.findByQuotationNumber(quotationNumber);
    }

    public void updateAmountStatus(String action, String anReason, Long id){
        annutityApiTopupdaRepository.updateAmountStatus(action, anReason, id);
    }

}