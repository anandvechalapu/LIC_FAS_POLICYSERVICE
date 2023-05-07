package com.lic.epgs.topupda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.topupda.entity.TopupdaEntity;

public interface AnnutityApiTopupdaRepository extends JpaRepository<TopupdaEntity, Long>{

    public TopupdaEntity findByQuotationNumber(String quotationNumber);

    public TopupdaEntity save(TopupdaEntity topupdaEntity);

    public void updateAmountStatus(String action, String anReason, Long id);

}