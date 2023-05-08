package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.FreeLookCancellationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/freelookcancellation")
public class FreeLookCancellationController {

    @Autowired
    private FreeLookCancellationService freeLookCancellationService;

    @GetMapping("/documents/{freeLookCancellationId}")
    public List<FreeLookCancellationResponseDto> getFlcDocumentDetails(@PathVariable Long freeLookCancellationId) {
        return freeLookCancellationService.getFlcDocumentDetails(freeLookCancellationId);
    }

    @PostMapping("/save")
    public void moveToFlcMainTable(@RequestParam Long freeLookCancellationId) {
        freeLookCancellationService.moveToFlcMainTable(freeLookCancellationId);
    }
}