package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.entity.PolicyLevelConversionTempEntity;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.repository.SendToChecker_PolicyLevelConversionControllerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendToChecker_PolicyLevelConversionControllerService {
    
    @Autowired
    private SendToChecker_PolicyLevelConversionControllerRepository sendToChecker_PolicyLevelConversionControllerRepository;
    
    public PolicyLevelConversionTempEntity findByConversionId(String conversionId) {
        return sendToChecker_PolicyLevelConversionControllerRepository.findByConversionId(conversionId);
    }

    public PolicyLevelConversionTempEntity saveAndFlush(PolicyLevelConversionTempEntity policyLevelConversionTempEntity) {
        return sendToChecker_PolicyLevelConversionControllerRepository.saveAndFlush(policyLevelConversionTempEntity);
    }

}