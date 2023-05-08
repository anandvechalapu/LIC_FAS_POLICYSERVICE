package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyServiceNotesTempModel;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service.PolicyServiceNotesTempService;

@RestController
@RequestMapping("/policyleveldetailschangecontroller")
public class PolicyServiceNotesTempController {

  @Autowired
  private PolicyServiceNotesTempService policyServiceNotesTempService;
  
  @GetMapping("/{policyId}/{serviceId}")
  public PolicyServiceNotesTempModel getByPolicyIdAndServiceId(@PathVariable Long policyId, @PathVariable Long serviceId) {
    return policyServiceNotesTempService.findByPolicyIdAndServiceId(policyId, serviceId);
  }
  
  @GetMapping("/")
  public List<PolicyServiceNotesTempModel> getAll() {
    return policyServiceNotesTempService.findAll();
  }
  
  @PostMapping("/")
  public PolicyServiceNotesTempModel save(@RequestBody PolicyServiceNotesTempModel policyServiceNotesTempModel) {
    return policyServiceNotesTempService.save(policyServiceNotesTempModel);
  }

}