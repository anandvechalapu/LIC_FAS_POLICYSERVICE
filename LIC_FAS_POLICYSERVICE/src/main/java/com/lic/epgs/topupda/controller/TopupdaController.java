package com.lic.epgs.topupda.controller;

import com.lic.epgs.topupda.dto.TopupdaApiResponseDto;
import com.lic.epgs.topupda.dto.TopupdaNotesDto;
import com.lic.epgs.topupda.service.SaveNotesTopupdaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topupda")
public class TopupdaController {

    @Autowired
    private SaveNotesTopupdaService saveNotesTopupdaService;

    @PostMapping("/saveNotes")
    public TopupdaApiResponseDto saveNotes(@RequestBody TopupdaNotesDto topupdaNotesDto) {
        return saveNotesTopupdaService.saveNotes(topupdaNotesDto);
    }
}