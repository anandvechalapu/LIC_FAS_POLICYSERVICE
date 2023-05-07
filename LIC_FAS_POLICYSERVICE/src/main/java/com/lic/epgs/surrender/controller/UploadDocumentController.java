package com.lic.epgs.surrender.controller;

import com.lic.epgs.surrender.entity.CommonDocsTempEntity;
import com.lic.epgs.surrender.service.UploadDocumentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadDocumentController {

    @Autowired
    private UploadDocumentService uploadDocumentService;

    @PostMapping("/uploadDocument")
    public CommonDocsTempEntity save(@RequestBody CommonDocsTempEntity commonDocsTempEntity) {
        return uploadDocumentService.save(commonDocsTempEntity);
    }

    @GetMapping("/uploadDocument/{id}")
    public CommonDocsTempEntity findById(@PathVariable Long id) {
        return uploadDocumentService.findById(id);
    }

    @GetMapping("/uploadDocument")
    public CommonDocsTempEntity findByIsActiveTrue() {
        return uploadDocumentService.findByIsActiveTrue();
    }

    @DeleteMapping("/uploadDocument/{id}")
    public void deleteById(@PathVariable Long id) {
        uploadDocumentService.deleteById(id);
    }

}