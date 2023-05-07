package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.PolicyLevelConversionDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.PolicyLevelConversionTempEntity;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.repository.SendToChecker_PolicyLevelConversionControllerRepository;

@Service
@Transactional
public class SendToChecker_PolicyLevelConversionControllerService {
    
    @Autowired
    private SendToChecker_PolicyLevelConversionControllerRepository sendToChecker_PolicyLevelConversionControllerRepository;
    
    public PolicyLevelConversionDto findByConversionId(String conversionId) {
        return sendToChecker_PolicyLevelConversionControllerRepository.findByConversionId(conversionId);
    }
    
    public PolicyLevelConversionDto findByConversionIdAndStatus(String conversionId) {
        return sendToChecker_PolicyLevelConversionControllerRepository.findByConversionIdAndStatus(conversionId);
    }
    
    public void updateConversionStatusByConversionId(String conversionId) {
        sendToChecker_PolicyLevelConversionControllerRepository.updateConversionStatusByConversionId(conversionId);
    }
    
    public List<PolicyLevelConversionTempEntity> findAll() {
        return sendToChecker_PolicyLevelConversionControllerRepository.findAll();
    }
}