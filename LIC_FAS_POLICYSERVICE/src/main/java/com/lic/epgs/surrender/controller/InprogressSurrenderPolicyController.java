package com.lic.epgs.surrender.controller;

import com.lic.epgs.surrender.dto.PolicySurrenderDTO;
import com.lic.epgs.surrender.service.InprogressSurrenderPolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inprogress-surrender-policy")
public class InprogressSurrenderPolicyController {

    @Autowired
    private InprogressSurrenderPolicyService inprogressSurrenderPolicyService;

    @GetMapping("/find-by-role-type/{roleType}")
    public List<PolicySurrenderDTO> findByRoleType(@PathVariable String roleType) {
        return inprogressSurrenderPolicyService.findByRoleType(roleType);
    }

    @GetMapping("/exists-by-role-type-and-page-name/{roleType}/{pageName}")
    public boolean existsByRoleTypeAndPageName(@PathVariable String roleType, @PathVariable String pageName) {
        return inprogressSurrenderPolicyService.existsByRoleTypeAndPageName(roleType, pageName);
    }

}