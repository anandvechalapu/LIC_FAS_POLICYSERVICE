package com.lic.epgs.surrender.controller;

import com.lic.epgs.surrender.dto.PolicySurrenderPayOutDto;
import com.lic.epgs.surrender.entity.PolicySurrenderPayOutTempEntity;
import com.lic.epgs.surrender.service.SavePayoutDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/surrender")
public class SurrenderController {

    @Autowired
    private SavePayoutDetailsService savePayoutDetailsService;

    @PostMapping("/save")
    public PolicySurrenderPayOutTempEntity save(@RequestBody PolicySurrenderPayOutDto policySurrenderPayOutDto) {
        return savePayoutDetailsService.save(policySurrenderPayOutDto);
    }

    @GetMapping("/find-all-by-is-active")
    public List<PolicySurrenderPayOutTempEntity> findAllByIsActive(@RequestParam(name = "isActive") boolean isActive) {
        return savePayoutDetailsService.findAllByIsActive(isActive);
    }

    @GetMapping("/find-by-created-by-and-modified-by")
    public PolicySurrenderPayOutTempEntity findByCreatedByAndModifiedBy(@RequestParam(name = "createdBy") String createdBy, @RequestParam(name = "modifiedBy") String modifiedBy) {
        return savePayoutDetailsService.findByCreatedByAndModifiedBy(createdBy, modifiedBy);
    }

    @DeleteMapping("/delete-by-id")
    public void deleteById(@RequestParam(name = "id") Long id) {
        savePayoutDetailsService.deleteById(id);
    }

    @DeleteMapping("/delete-by-created-by-and-modified-by")
    public void deleteByCreatedByAndModifiedBy(@RequestParam(name = "createdBy") String createdBy, @RequestParam(name = "modifiedBy") String modifiedBy) {
        savePayoutDetailsService.deleteByCreatedByAndModifiedBy(createdBy, modifiedBy);
    }

    @DeleteMapping("/delete-by-is-active")
    public void deleteByIsActive(@RequestParam(name = "isActive") boolean isActive) {
        savePayoutDetailsService.deleteByIsActive(isActive);
    }

}