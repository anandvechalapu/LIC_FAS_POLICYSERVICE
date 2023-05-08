package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.GetNoteListPolicyLevelMergerControllerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/policylevelmerger")
public class PolicyLevelMergerController {

  @Autowired private GetNoteListPolicyLevelMergerControllerService getNoteListPolicyLevelMergerControllerService;

  @GetMapping("/{mergeId}")
  public ResponseEntity<List<PolicyServiceNotesDto>> getNoteListByMergeId(@PathVariable Long mergeId) {
    List<PolicyServiceNotesDto> notesDtoList = getNoteListPolicyLevelMergerControllerService.findAllByMergeId(mergeId);
    return ResponseEntity.ok(notesDtoList);
  }

}