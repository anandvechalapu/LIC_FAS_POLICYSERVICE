package com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesDto;

@Repository
public interface PolicyLevelMergerControllerRepository extends JpaRepository<PolicyServiceNotesDto, Long> {

  @Query("SELECT n FROM PolicyServiceNotesDto n WHERE n.mergeId = ?1")
  List<PolicyServiceNotesDto> getNoteList(long mergeId);

}

package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.PolicyLevelMergerControllerService;

@RestController
public class PolicyLevelMergerController {
  
  @Autowired
  private PolicyLevelMergerControllerService policyLevelMergerControllerService;

  @GetMapping("/policies/{mergeId}/notes")
  public PolicyLevelMergerApiResponse getNoteList(@PathVariable long mergeId) {
    return policyLevelMergerControllerService.getNoteList(mergeId);
  }
}