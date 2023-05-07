package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.PolicyLevelConversionDto;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.model.PolicyLevelConversionTempEntity;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncontroller.service.SendToChecker_PolicyLevelConversionControllerService;

@RestController
@RequestMapping("/api/v1")
public class SendToChecker_PolicyLevelConversionController {
    
    @Autowired
    private SendToChecker_PolicyLevelConversionControllerService sendToChecker_PolicyLevelConversionControllerService;
    
    @GetMapping("/conversion/{conversionId}")
    public ResponseEntity<PolicyLevelConversionDto> findByConversionId(@PathVariable String conversionId) {
        PolicyLevelConversionDto policyLevelConversionDto = sendToChecker_PolicyLevelConversionControllerService.findByConversionId(conversionId);
        return new ResponseEntity<>(policyLevelConversionDto, HttpStatus.OK);
    }
    
    @GetMapping("/conversion/status/{conversionId}")
    public ResponseEntity<PolicyLevelConversionDto> findByConversionIdAndStatus(@PathVariable String conversionId) {
        PolicyLevelConversionDto policyLevelConversionDto = sendToChecker_PolicyLevelConversionControllerService.findByConversionIdAndStatus(conversionId);
        return new ResponseEntity<>(policyLevelConversionDto, HttpStatus.OK);
    }
    
    @PutMapping("/conversion/status/{conversionId}")
    public ResponseEntity<Object> updateConversionStatusByConversionId(@PathVariable String conversionId) {
        sendToChecker_PolicyLevelConversionControllerService.updateConversionStatusByConversionId(conversionId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @GetMapping("/conversions")
    public ResponseEntity<List<PolicyLevelConversionTempEntity>> findAll() {
        List<PolicyLevelConversionTempEntity> policyLevelConversionTempEntities = sendToChecker_PolicyLevelConversionControllerService.findAll();
        return new ResponseEntity<>(policyLevelConversionTempEntities, HttpStatus.OK);
    }
}