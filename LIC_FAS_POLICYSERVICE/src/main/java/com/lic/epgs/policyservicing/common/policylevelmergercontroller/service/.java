package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.MemberMasterEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerTempEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyMasterEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceDocumentEntity;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesEntity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApprovedAndRejectPolicyLevelMerger_PolicyLevelMergerControllerService {

    List<PolicyLevelMergerTempEntity> findByMergeIdAndMergeStatus(Long mergeId, Integer mergeStatus);
    
    List<PolicyMasterEntity> findByMergeIdAndMergeStatus(Long mergeId, Integer mergeStatus);
    
    List<MemberMasterEntity> findByMergeIdAndMergeStatus(Long mergeId, Integer mergeStatus);
    
    void savePolicyMasterEntity(PolicyMasterEntity policyMasterEntity);
    
    void savePolicyServiceDocumentEntity(PolicyServiceDocumentEntity policyServiceDocumentEntity);
    
    void savePolicyServiceNotesEntity(PolicyServiceNotesEntity policyServiceNotesEntity);
    
    List<PolicyLevelMergerApiResponse> findByMergeIdAndMergeStatusAndWorkflowStatus(Long mergeId, Integer mergeStatus, String workflowStatus);
    
}