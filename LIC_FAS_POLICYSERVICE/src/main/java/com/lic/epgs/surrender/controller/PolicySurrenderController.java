package com.lic.epgs.surrender.controller;

import com.lic.epgs.surrender.model.PolicySurrenderApiResponse;
import com.lic.epgs.surrender.service.GetExistingSurrenderOverallDetails_PolicySurrenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/surrender")
public class PolicySurrenderController {

    @Autowired
    private GetExistingSurrenderOverallDetails_PolicySurrenderService getExistingSurrenderOverallDetails_PolicySurrenderService;

    @GetMapping("/{surrenderId}")
    public Optional<PolicySurrenderApiResponse> findBySurrenderId(@PathVariable Long surrenderId) {
        return getExistingSurrenderOverallDetails_PolicySurrenderService.findBySurrenderId(surrenderId);
    }

    @PostMapping
    public PolicySurrenderApiResponse getExistingSurrenderOverallDetails_PolicySurrender(@RequestBody Long surrenderId) {
        return getExistingSurrenderOverallDetails_PolicySurrenderService.getExistingSurrenderOverallDetails_PolicySurrender(surrenderId);
    }

}