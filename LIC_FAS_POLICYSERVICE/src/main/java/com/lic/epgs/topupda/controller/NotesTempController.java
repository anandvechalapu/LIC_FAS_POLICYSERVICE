package com.lic.epgs.topupda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.topupda.entity.NoteTempEntity;
import com.lic.epgs.topupda.service.NotesTempService;

@RestController
@RequestMapping("/notes")
public class NotesTempController {
	
	@Autowired
	private NotesTempService notesTempService;
	
	@GetMapping("/{topupId}")
	public List<NoteTempEntity> getNotesList(@PathVariable Long topupId){
		return notesTempService.getNotesList(topupId);
	}

}