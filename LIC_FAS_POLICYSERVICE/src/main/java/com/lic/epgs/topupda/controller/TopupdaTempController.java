Long topupId, TopupdaNotesEntity topupdaNotesEntity) {
        TopupdaNotesEntity notesEntity = topupdaTempRepository.setNoteContents(topupId, topupdaNotesEntity);
        return notesEntity;
    }

}

package com.lic.epgs.topupda.controller;

import com.lic.epgs.topupda.model.TopupdaTempEntity;
import com.lic.epgs.topupda.model.TopupdaEntity;
import com.lic.epgs.topupda.model.TopupdaDto;
import com.lic.epgs.topupda.model.TopupdaApiResponseDto;
import com.lic.epgs.topupda.model.TopupdaNotesEntity;
import com.lic.epgs.topupda.service.TopupdaTempService;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topupda")
public class TopupdaTempController {
    
    @Autowired
    private TopupdaTempService topupdaTempService;

    @PutMapping("/sendToApprove/{topupId}")
    public TopupdaApiResponseDto sendToApprove(@PathVariable Long topupId) {
        return topupdaTempService.sendToApprove(topupId);
    }

    @PostMapping("/updateTopupStatus/{topupId}")
    public TopupdaTempEntity updateTopupStatus(@PathVariable Long topupId, @RequestParam String topupStatus, @RequestParam String amountStatus) {
        return topupdaTempService.updateTopupStatus(topupId, topupStatus, amountStatus);
    }

    @PostMapping("/setModifiedOn/{topupId}")
    public TopupdaTempEntity setModifiedOn(@PathVariable Long topupId, @RequestParam Date modifiedOn) {
        return topupdaTempService.setModifiedOn(topupId, modifiedOn);
    }

    @PostMapping("/mapToTopupdaEntity")
    public TopupdaEntity mapToTopupdaEntity(@RequestBody TopupdaTempEntity topupdaTempEntity) {
        return topupdaTempService.mapToTopupdaEntity(topupdaTempEntity);
    }

    @PostMapping("/createTopupdaEntity/{topupId}")
    public TopupdaEntity createTopupdaEntity(@PathVariable Long topupId) {
        return topupdaTempService.createTopupdaEntity(topupId);
    }

    @PostMapping("/setTopupdaFields/{topupId}")
    public TopupdaEntity setTopupdaFields(@PathVariable Long topupId, @RequestBody TopupdaTempEntity topupdaTempEntity) {
        return topupdaTempService.setTopupdaFields(topupId, topupdaTempEntity);
    }

    @PostMapping("/createTopupdaNotesHashSet/{topupId}")
    public HashSet<TopupdaNotesEntity> createTopupdaNotesHashSet(@PathVariable Long topupId, @RequestBody TopupdaTempEntity topupdaTempEntity) {
        return topupdaTempService.createTopupdaNotesHashSet(topupId, topupdaTempEntity);
    }

    @PostMapping("/copyTopupdaNotesEntity")
    public TopupdaNotesEntity copyTopupdaNotesEntity(@RequestBody TopupdaTempEntity topupdaTempEntity) {
        return topupdaTempService.copyTopupdaNotesEntity(topupdaTempEntity);
    }

    @PostMapping("/setIdsToNull/{topupId}")
    public TopupdaNotesEntity setIdsToNull(@PathVariable Long topupId, @RequestBody TopupdaNotesEntity topupdaNotesEntity) {
        return topupdaTempService.setIdsToNull(topupId, topupdaNotesEntity);
    }

    @PostMapping("/setTopupId/{topupId}")
    public TopupdaNotesEntity setTopupId(@Path