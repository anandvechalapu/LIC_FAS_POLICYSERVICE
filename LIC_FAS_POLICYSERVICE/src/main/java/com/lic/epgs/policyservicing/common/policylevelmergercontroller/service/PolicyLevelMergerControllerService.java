package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.PolicyLevelMergerControllerRepository;

@Service
public class PolicyLevelMergerControllerService {

  @Autowired
  private PolicyLevelMergerControllerRepository policyLevelMergerControllerRepository;

  public PolicyLevelMergerApiResponse getNoteList(long mergeId) {
    List<PolicyServiceNotesDto> notes = policyLevelMergerControllerRepository.getNoteList(mergeId);
    PolicyLevelMergerApiResponse response = new PolicyLevelMergerApiResponse();
    response.setNotes(notes);
    response.setStatus("SUCCESS");
    response.setMessage("Notes retrieved successfully.");
    return response;
  }

}