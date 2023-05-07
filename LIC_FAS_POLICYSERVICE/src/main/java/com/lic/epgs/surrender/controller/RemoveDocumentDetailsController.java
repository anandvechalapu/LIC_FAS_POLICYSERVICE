package com.lic.epgs.surrender.controller;

import com.lic.epgs.surrender.model.CommonDocsTempModel;
import com.lic.epgs.surrender.service.RemoveDocumentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/surrender")
public class RemoveDocumentDetailsController {

    @Autowired
    private RemoveDocumentDetailsService removeDocumentDetailsService;

    @PostMapping("/remove-document-details")
    public void removeDocumentDetails(@RequestBody CommonDocsTempModel commonDocsTempModel) {
        removeDocumentDetailsService.removeDocumentDetails(commonDocsTempModel.getSurrenderId(), commonDocsTempModel.getDocId());
    }
}