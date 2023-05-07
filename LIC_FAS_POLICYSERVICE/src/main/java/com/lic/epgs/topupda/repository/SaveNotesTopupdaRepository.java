package com.lic.epgs.topupda.repository;

import com.lic.epgs.topupda.dto.TopupdaApiResponseDto;
import com.lic.epgs.topupda.dto.TopupdaNotesDto;
import com.lic.epgs.topupda.entity.TopupdaNotesTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveNotesTopupdaRepository extends JpaRepository<TopupdaNotesTempEntity, Long> {

    TopupdaApiResponseDto saveNotes(TopupdaNotesDto topupdaNotesDto);

}