package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.SaveFlcNotes_PolicyLevelFreeLookCancelControllerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policylevelfreelookcancel")
public class PolicyLevelFreeLookCancelController {

    Logger logger = LoggerFactory.getLogger(PolicyLevelFreeLookCancelController.class);

    @Autowired
    SaveFlcNotes_PolicyLevelFreeLookCancelControllerService saveFlcNotes_PolicyLevelFreeLookCancelControllerService;

    @PostMapping("/notes")
    public ResponseEntity<FreeLookCancellationResponseDto> saveFlcNotes(@RequestBody SaveFlcNotesRequestDto saveFlcNotesRequestDto) {
        FreeLookCancellationResponseDto freeLookCancellationResponseDto = saveFlcNotes_PolicyLevelFreeLookCancelControllerService.saveFlcNotes(saveFlcNotesRequestDto.getFreeLookId(), saveFlcNotesRequestDto.getPolicyId(), saveFlcNotesRequestDto.getServiceId(), saveFlcNotesRequestDto.getNotesText());
        return new ResponseEntity<>(freeLookCancellationResponseDto, HttpStatus.OK);
    }

}

class SaveFlcNotesRequestDto {

    private Long freeLookId;
    private Long policyId;
    private Long serviceId;
    private String notesText;

    public Long getFreeLookId() {
        return freeLookId;
    }

    public void setFreeLookId(Long freeLookId) {
        this.freeLookId = freeLookId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getNotesText() {
        return notesText;
    }

    public void setNotesText(String notesText) {
        this.notesText = notesText;
    }

}