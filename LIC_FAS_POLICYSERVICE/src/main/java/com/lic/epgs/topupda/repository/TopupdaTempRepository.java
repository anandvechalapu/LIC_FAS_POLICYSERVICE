package com.lic.epgs.topupda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.topupda.model.TopupdaTempEntity;
import com.lic.epgs.topupda.model.TopupdaEntity;

public interface TopupdaTempRepository extends JpaRepository<TopupdaTempEntity, Long> {

	public TopupdaTempEntity findByTopupId(Long topupId);

	public TopupdaTempEntity save(TopupdaTempEntity topupdaTempEntity);

}


public interface TopupdaRepository extends JpaRepository<TopupdaEntity, Long> {

	public TopupdaEntity findByTopupId(Long topupId);

	public TopupdaEntity save(TopupdaEntity topupdaEntity);

}