package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.PolicyLevelMemberAdditionController;

@Repository
public interface GetNotesPolicyLevelMemberAdditionControllerRepository extends JpaRepository<PolicyLevelMemberAdditionController, Long> {

    String getNotes(Long memberAdditionId);

}

package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.PolicyLevelMemberAdditionController;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service.GetNotesPolicyLevelMemberAdditionControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policylevelmemberadditioncontroller")
public class PolicyLevelMemberAdditionControllerController {

    @Autowired
    private GetNotesPolicyLevelMemberAdditionControllerService getNotesPolicyLevelMemberAdditionControllerService;

    @GetMapping("/{memberAdditionId}")
    public String getNotes(@PathVariable Long memberAdditionId){
        return getNotesPolicyLevelMemberAdditionControllerService.getNotes(memberAdditionId);
    }

}