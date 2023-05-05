package com.lic.epgs.policyservicing.common.memberlvl.controller;

import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutResponseDto;
import com.lic.epgs.policyservicing.common.memberlvl.service.GetExistingLoadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetExistingLoadController {

    private final GetExistingLoadService getExistingLoadService;

    @Autowired
    public GetExistingLoadController(GetExistingLoadService getExistingLoadService) {
        this.getExistingLoadService = getExistingLoadService;
    }

    @GetMapping("/get-existing-load")
    public TransferInAndOutResponseDto getExistingLoad(@RequestParam String role, @RequestParam String unitCode) {
        return getExistingLoadService.getExistingLoad(role, unitCode);
    }

}