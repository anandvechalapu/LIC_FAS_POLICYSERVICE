package com.lic.epgs.topupda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.topupda.model.TopupdaTempEntity;
import com.lic.epgs.topupda.model.TopupdaEntity;
import com.lic.epgs.topupda.model.TopupdaDto;
import com.lic.epgs.topupda.model.TopupdaApiResponseDto;
import com.lic.epgs.topupda.model.TopupdaNotesEntity;

import java.util.HashSet;
import java.util.Date;

public interface TopupdaTempRepository extends JpaRepository<TopupdaTempEntity, Long> {

    // API endpoint for sending Topupda record for approval
    TopupdaApiResponseDto sendToApprove(Long topupId);

    // Update the TopupdaTempEntity's topupStatus to Approved and amountStatus to AmountLock
    TopupdaTempEntity updateTopupStatus(Long topupId, String topupStatus, String amountStatus);

    // Set the modifiedOn field to the current system date
    TopupdaTempEntity setModifiedOn(Long topupId, Date modifiedOn);

    // Map the TopupdaTempEntity to a TopupdaEntity using the ModelMapper library
    TopupdaEntity mapToTopupdaEntity(TopupdaTempEntity topupdaTempEntity);

    // Create a new TopupdaEntity
    TopupdaEntity createTopupdaEntity(Long topupId);

    // Set all of the TopupdaEntity's fields except the ID
    TopupdaEntity setTopupdaFields(Long topupId, TopupdaTempEntity topupdaTempEntity);

    // Create a new HashSet of TopupdaNotesEntity objects
    HashSet<TopupdaNotesEntity> createTopupdaNotesHashSet(Long topupId, TopupdaTempEntity topupdaTempEntity);

    // Copy each TopupdaNotesEntity object from the original TopupdaEntity
    TopupdaNotesEntity copyTopupdaNotesEntity(TopupdaTempEntity topupdaTempEntity);

    // Set their ID and topupdaNoteId fields to null
    TopupdaNotesEntity setIdsToNull(Long topupId, TopupdaNotesEntity topupdaNotesEntity);

    // Set their topupId field to the new TopupdaEntity's ID
    TopupdaNotesEntity setTopupId(Long topupId, TopupdaNotesEntity topupdaNotesEntity);

    // Set their isActive field to true
    TopupdaNotesEntity setIsActive(Long topupId, TopupdaNotesEntity topupdaNotesEntity);

    // Set their noteContents field to the original note contents
    TopupdaNotesEntity setNoteContents(Long topupId, TopupdaNotesEntity topupdaNotesEntity);

    // Save the new TopupdaEntity to the TopupdaRepository
    TopupdaEntity saveTopupdaEntity(TopupdaEntity topupdaEntity);

    // Map the new TopupdaEntity's ID to a TopupdaDto
    TopupdaDto mapToTopupdaDto(Long topupId);

    // Set the TopupdaDto as the responseDto field of a new TopupdaApiResponseDto object
    TopupdaApiResponseDto setResponseDto(TopupdaDto topupdaDto);

    // Set the transaction status of the response to Success
    TopupdaApiResponseDto setTransactionStatus(String transactionStatus);

    // Set the transaction message to Updated
    TopupdaApiResponseDto setTransactionMessage(String transactionMessage);

}