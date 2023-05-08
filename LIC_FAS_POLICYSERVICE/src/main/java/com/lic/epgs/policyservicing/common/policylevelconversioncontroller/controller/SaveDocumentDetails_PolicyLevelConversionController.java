package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.DocumentDetails;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.SaveDocumentDetails_PolicyLevelConversionControllerService;

@RestController
public class SaveDocumentDetails_PolicyLevelConversionController {

    @Autowired
    SaveDocumentDetails_PolicyLevelConversionControllerService saveDocumentDetails_PolicyLevelConversionControllerService;

    // API to save the document details
    @RequestMapping(value = "/saveDocument", method = RequestMethod.POST)
    public DocumentDetails save(@RequestBody DocumentDetails documentDetails) {
        return saveDocumentDetails_PolicyLevelConversionControllerService.save(documentDetails);
    }

    // API to retrieve list of documents for a specific conversion
    @RequestMapping(value = "/getDocuments", method = RequestMethod.GET)
    public List<DocumentDetails> findByConversionId(@RequestParam Long conversionId) {
        return saveDocumentDetails_PolicyLevelConversionControllerService.findByConversionId(conversionId);
    }

}