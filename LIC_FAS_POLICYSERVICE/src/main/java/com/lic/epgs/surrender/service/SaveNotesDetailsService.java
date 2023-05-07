package com.lic.epgs.surrender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.surrender.model.CommonNoteTempEntity;
import com.lic.epgs.surrender.repository.SaveNotesDetailsRepository;

@Service
public class SaveNotesDetailsService {
    
    @Autowired
    private SaveNotesDetailsRepository saveNotesRepository;
    
    public CommonNoteTempEntity save(CommonNoteTempEntity entity) {
        return saveNotesRepository.save(entity);
    }

}