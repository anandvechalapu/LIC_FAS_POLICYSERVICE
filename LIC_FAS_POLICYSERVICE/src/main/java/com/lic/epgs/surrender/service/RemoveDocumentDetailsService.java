package com.lic.epgs.surrender.service;

import com.lic.epgs.surrender.entity.CommonDocsTempEntity;
import com.lic.epgs.surrender.repository.RemoveDocumentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RemoveDocumentDetailsService {

    @Autowired
    private RemoveDocumentDetailsRepository removeDocumentDetailsRepository;

    @Transactional
    public void removeDocumentDetails(Long surrenderId, Integer docId) {
        CommonDocsTempEntity commonDocsTempEntity = removeDocumentDetailsRepository.findBySurrenderIdAndDocId(surrenderId, docId);
        commonDocsTempEntity.setActive(false);
        removeDocumentDetailsRepository.save(commonDocsTempEntity);
    }
}