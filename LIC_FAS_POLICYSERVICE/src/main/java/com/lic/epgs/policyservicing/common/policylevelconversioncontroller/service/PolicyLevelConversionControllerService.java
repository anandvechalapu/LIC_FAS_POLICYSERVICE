package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.Document;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.PolicyLevelConversionControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyLevelConversionControllerService {

    @Autowired
    PolicyLevelConversionControllerRepository policyLevelConversionControllerRepository;

    public List<Document> getDocumentList(Long conversionId){
        return policyLevelConversionControllerRepository.getDocumentList(conversionId);
    }

}