package com.lic.epgs.topupda.service;

import com.lic.epgs.topupda.dto.TopupdaApiResponseDto;
import com.lic.epgs.topupda.dto.TopupdaNotesDto;
import com.lic.epgs.topupda.entity.TopupdaNotesTempEntity;
import com.lic.epgs.topupda.repository.SaveNotesTopupdaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveNotesTopupdaService {

    @Autowired
    private SaveNotesTopupdaRepository saveNotesTopupdaRepository;

    public TopupdaApiResponseDto saveNotes(TopupdaNotesDto topupdaNotesDto){
        TopupdaNotesTempEntity topupdaNotesTempEntity = new TopupdaNotesTempEntity();
        topupdaNotesTempEntity.setNotes(topupdaNotesDto.getNotes());

        TopupdaNotesTempEntity savedEntity = saveNotesTopupdaRepository.save(topupdaNotesTempEntity);

        TopupdaApiResponseDto topupdaApiResponseDto = new TopupdaApiResponseDto();
        topupdaApiResponseDto.setMessage("Successfully saved the notes");
        topupdaApiResponseDto.setNoteId(savedEntity.getNoteId());

        return topupdaApiResponseDto;
    }
}