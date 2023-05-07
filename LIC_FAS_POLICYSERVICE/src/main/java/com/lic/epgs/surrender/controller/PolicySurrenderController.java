package com.lic.epgs.surrender.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.surrender.dto.CommonNotesDto;
import com.lic.epgs.surrender.service.PolicySurrenderServiceImpl;

@RestController
@RequestMapping("/api/surrender")
public class PolicySurrenderController {
    
    @Autowired
    private PolicySurrenderServiceImpl policySurrenderService;

    @GetMapping("/{surrenderId}")
    public ResponseEntity<List<CommonNotesDto>> getSurrenderNotesList(@PathVariable("surrenderId") Long surrenderId){
        return policySurrenderService.getSurrenderNotesList(surrenderId);
    }
}