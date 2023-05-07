package com.lic.epgs.surrender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.surrender.model.CommonNoteTempEntity;
import com.lic.epgs.surrender.service.SaveNotesDetailsService;

@RestController
public class SaveNotesDetailsController {
    
    @Autowired
    private SaveNotesDetailsService saveNotesService;
    
    @PostMapping("/saveNote")
    public CommonNoteTempEntity saveNote(@RequestBody CommonNoteTempEntity entity) {
        return saveNotesService.save(entity);
    }
}