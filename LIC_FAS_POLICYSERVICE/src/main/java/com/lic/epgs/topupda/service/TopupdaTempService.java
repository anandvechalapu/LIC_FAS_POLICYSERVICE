package com.lic.epgs.topupda.service;

import com.lic.epgs.topupda.repository.TopupdaTempRepository;
import com.lic.epgs.topupda.model.TopupdaTempEntity;
import com.lic.epgs.topupda.model.TopupdaEntity;
import com.lic.epgs.topupda.model.TopupdaDto;
import com.lic.epgs.topupda.model.TopupdaApiResponseDto;
import com.lic.epgs.topupda.model.TopupdaNotesEntity;

import java.util.HashSet;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopupdaTempService {

    @Autowired
    private TopupdaTempRepository topupdaTempRepository;

    public TopupdaApiResponseDto sendToApprove(Long topupId) {
        TopupdaApiResponseDto response = topupdaTempRepository.sendToApprove(topupId);
        return response;
    }

    public TopupdaTempEntity updateTopupStatus(Long topupId, String topupStatus, String amountStatus) {
        TopupdaTempEntity topupdaTempEntity = topupdaTempRepository.updateTopupStatus(topupId, topupStatus, amountStatus);
        return topupdaTempEntity;
    }

    public TopupdaTempEntity setModifiedOn(Long topupId, Date modifiedOn) {
        TopupdaTempEntity topupdaTempEntity = topupdaTempRepository.setModifiedOn(topupId, modifiedOn);
        return topupdaTempEntity;
    }

    public TopupdaEntity mapToTopupdaEntity(TopupdaTempEntity topupdaTempEntity) {
        TopupdaEntity topupdaEntity = topupdaTempRepository.mapToTopupdaEntity(topupdaTempEntity);
        return topupdaEntity;
    }

    public TopupdaEntity createTopupdaEntity(Long topupId) {
        TopupdaEntity topupdaEntity = topupdaTempRepository.createTopupdaEntity(topupId);
        return topupdaEntity;
    }

    public TopupdaEntity setTopupdaFields(Long topupId, TopupdaTempEntity topupdaTempEntity) {
        TopupdaEntity topupdaEntity = topupdaTempRepository.setTopupdaFields(topupId, topupdaTempEntity);
        return topupdaEntity;
    }

    public HashSet<TopupdaNotesEntity> createTopupdaNotesHashSet(Long topupId, TopupdaTempEntity topupdaTempEntity) {
        HashSet<TopupdaNotesEntity> notesHashSet = topupdaTempRepository.createTopupdaNotesHashSet(topupId, topupdaTempEntity);
        return notesHashSet;
    }

    public TopupdaNotesEntity copyTopupdaNotesEntity(TopupdaTempEntity topupdaTempEntity) {
        TopupdaNotesEntity topupdaNotesEntity = topupdaTempRepository.copyTopupdaNotesEntity(topupdaTempEntity);
        return topupdaNotesEntity;
    }

    public TopupdaNotesEntity setIdsToNull(Long topupId, TopupdaNotesEntity topupdaNotesEntity) {
        TopupdaNotesEntity notesEntity = topupdaTempRepository.setIdsToNull(topupId, topupdaNotesEntity);
        return notesEntity;
    }

    public TopupdaNotesEntity setTopupId(Long topupId, TopupdaNotesEntity topupdaNotesEntity) {
        TopupdaNotesEntity notesEntity = topupdaTempRepository.setTopupId(topupId, topupdaNotesEntity);
        return notesEntity;
    }

    public TopupdaNotesEntity setIsActive(Long topupId, TopupdaNotesEntity topupdaNotesEntity) {
        TopupdaNotesEntity notesEntity = topupdaTempRepository.setIsActive(topupId, topupdaNotesEntity);
        return notesEntity;
    }

    public TopupdaNotesEntity setNoteContents(