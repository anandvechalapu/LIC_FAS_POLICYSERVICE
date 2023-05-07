package com.lic.epgs.surrender.service;

import com.lic.epgs.surrender.entity.CommonDocsTempEntity;
import com.lic.epgs.surrender.repository.UploadDocumentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadDocumentService {

    @Autowired
    private UploadDocumentRepository uploadDocumentRepository;

    public CommonDocsTempEntity save(CommonDocsTempEntity commonDocsTempEntity) {
        return uploadDocumentRepository.save(commonDocsTempEntity);
    }

    public CommonDocsTempEntity findById(Long id) {
        return uploadDocumentRepository.findById(id);
    }

    public CommonDocsTempEntity findByIsActiveTrue() {
        return uploadDocumentRepository.findByIsActiveTrue();
    }

    public void deleteById(Long id) {
        uploadDocumentRepository.deleteById(id);
    }
}