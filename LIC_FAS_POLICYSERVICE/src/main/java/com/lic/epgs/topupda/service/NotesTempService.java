package com.lic.epgs.topupda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.topupda.entity.NoteTempEntity;
import com.lic.epgs.topupda.repository.NotesTempRepository;

@Service
public class NotesTempService {
	
	@Autowired
	private NotesTempRepository notesTempRepository;
	
	public List<NoteTempEntity> getNotesList(Long topupId){
		return notesTempRepository.getNotesList(topupId);
	}

}