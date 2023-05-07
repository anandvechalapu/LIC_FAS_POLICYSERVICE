package com.lic.epgs.surrender.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lic.epgs.surrender.dto.CommonNotesDto;
import com.lic.epgs.surrender.model.CommonNoteTempEntity;
import com.lic.epgs.surrender.repository.SurrenderNotesListRepository;

@Service
public class PolicySurrenderServiceImpl{
    
    @Autowired
    private SurrenderNotesListRepository surrenderNotesListRepository;
    
    public ResponseEntity<List<CommonNotesDto>> getSurrenderNotesList(Long surrenderId){
        CommonNoteTempEntity commonNoteTempEntity = surrenderNotesListRepository.findBySurrenderId(surrenderId);
        if(commonNoteTempEntity == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        if(surrenderId == null || surrenderId <= 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        List<CommonNotesDto> commonNotesDtoList = commonNoteTempEntity.getCommonNotesDtoList();
        return new ResponseEntity<>(commonNotesDtoList ,HttpStatus.OK);
    }
}