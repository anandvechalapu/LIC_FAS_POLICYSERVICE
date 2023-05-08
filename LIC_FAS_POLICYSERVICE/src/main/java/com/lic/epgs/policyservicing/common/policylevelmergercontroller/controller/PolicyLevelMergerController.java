package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.MemberMasterEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerTempEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyMasterEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceDocumentEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.ApprovedAndRejectPolicyLevelMerger_PolicyLevelMergerControllerService;

@RestController
public class PolicyLevelMergerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PolicyLevelMergerController.class);
    
    @Autowired
    ApprovedAndRejectPolicyLevelMerger_PolicyLevelMergerControllerService approvedAndRejectPolicyLevelMerger_PolicyLevelMergerControllerService;
    
    @GetMapping("/getPolicyLevelMerger")
    public List<PolicyLevelMergerTempEntity> findByMergeIdAndMergeStatus(@RequestParam Long mergeId, 
                                                                        @RequestParam Integer mergeStatus) {
        LOGGER.info("getPolicyLevelMerger with mergeId : {} and mergeStatus : {}", mergeId, mergeStatus);
        return approvedAndRejectPolicyLevelMerger_PolicyLevelMergerControllerService.findByMergeIdAndMergeStatus(mergeId, mergeStatus);
    }
    
    @GetMapping("/getPolicyMaster")
    public List<PolicyMasterEntity> findByMergeIdAndMergeStatusInPolicyMaster(@RequestParam Long mergeId, 
                                                                             @RequestParam Integer mergeStatus) {
        LOGGER.info("getPolicyMaster with mergeId : {} and mergeStatus : {}", mergeId, mergeStatus);
        return approvedAndRejectPolicyLevelMerger_PolicyLevelMergerControllerService.findByMergeIdAndMergeStatus(mergeId, mergeStatus);
    }
    
    @GetMapping("/getMemberMaster")
    public List<MemberMasterEntity> findByMergeIdAndMergeStatusInMemberMaster(@RequestParam Long mergeId, 
                                                                             @RequestParam Integer mergeStatus) {
        LOGGER.info("getMemberMaster with mergeId : {} and mergeStatus : {}", mergeId, mergeStatus);
        return approvedAndRejectPolicyLevelMerger_PolicyLevelMergerControllerService.findByMergeIdAndMergeStatus(mergeId, mergeStatus);
    }
    
    @PutMapping("/savePolicyMasterEntity")
    public void savePolicyMasterEntity(@RequestBody @Valid PolicyMasterEntity policyMasterEntity) {
        LOGGER.info("savePolicyMasterEntity : {}", policyMasterEntity);
        approvedAndRejectPolicyLevelMerger_PolicyLevelMergerControllerService.savePolicyMasterEntity(policyMasterEntity);
    }
    
    @PutMapping("/savePolicyServiceDocumentEntity")
    public void savePolicyServiceDocumentEntity(@RequestBody @Valid PolicyServiceDocumentEntity policyServiceDocumentEntity) {
        LOGGER.info("savePolicyServiceDocumentEntity : {}", policyServiceDocumentEntity