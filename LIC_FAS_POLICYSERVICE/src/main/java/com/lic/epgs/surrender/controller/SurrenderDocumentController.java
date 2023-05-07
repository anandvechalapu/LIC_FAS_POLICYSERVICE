package com.lic.epgs.surrender.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.surrender.model.PolicySurrenderApiResponse;
import com.lic.epgs.surrender.service.GetSurrenderDocumentDetailsService;

@RestController
public class SurrenderDocumentController {

    @Autowired
    private GetSurrenderDocumentDetailsService getSurrenderDocumentDetailsService;

    @GetMapping("/surrender/{surrenderId}")
    public Optional<PolicySurrenderApiResponse> getSurrenderDocument(@PathVariable Long surrenderId) {
        return getSurrenderDocumentDetailsService.getSurrenderDocumentDetails(surrenderId);
    }
}