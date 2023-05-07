package com.lic.epgs.surrender.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.surrender.model.PolicySurrender;

@Repository
public interface PolicySurrenderRepository extends JpaRepository<PolicySurrender, Long> {

    public PolicySurrenderApiResponse getPolicySurrenderbySurrenderId(Long surrenderId);

}

package com.lic.epgs.surrender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.surrender.model.PolicySurrenderApiResponse;
import com.lic.epgs.surrender.service.PolicySurrenderService;

@RestController
public class PolicySurrenderController {
    
    @Autowired
    private PolicySurrenderService policySurrenderService;
    
    @GetMapping("/surrender/{surrenderId}")
    public PolicySurrenderApiResponse getPolicySurrenderbySurrenderId(@PathVariable("surrenderId") Long surrenderId) {
        return policySurrenderService.getPolicySurrenderbySurrenderId(surrenderId);
    }

}