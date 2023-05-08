package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.GetNoteListPolicyLevelMergerControllerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetNoteListPolicyLevelMergerControllerService {

  @Autowired private GetNoteListPolicyLevelMergerControllerRepository getNoteListPolicyLevelMergerControllerRepository;

  public List<PolicyServiceNotesDto> findAllByMergeId(Long mergeId) {
    return getNoteListPolicyLevelMergerControllerRepository.findAllByMergeId(mergeId);
  }
}