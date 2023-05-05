//Spring Boot Controller Class

package com.lic.epgs.policyservicing.common.memberlvl.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionDetailsEntity;
import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionEntity;
import com.lic.epgs.policyservicing.common.memberlvl.service.CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionController {

    @Autowired
    CommissionService commissionService;

    @GetMapping("/inprogress-load/{role}/{unitCode}")
    public List<CommissionEntity> getInprogressLoad(@PathVariable String role, @PathVariable String unitCode) {
        return commissionService.getInprogressLoad(role, unitCode);
    }

    @GetMapping("/inprogress-maker-load/{role}/{unitCode}")
    public List<CommissionEntity> getInprogressMakerLoad(@PathVariable String role, @PathVariable String unitCode) {
        return commissionService.getInprogressMakerLoad(role, unitCode);
    }

    @GetMapping("/{id}")
    public Optional<CommissionEntity> findById(@PathVariable Long id) {
        return commissionService.findById(id);
    }

    @PostMapping
    public CommissionEntity save(@RequestBody CommissionEntity commissionEntity) {
        return commissionService.save(commissionEntity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        commissionService.delete(commissionService.findById(id).get());
    }

    @PutMapping
    public CommissionDetailsEntity saveCommissionDetails(@RequestBody CommissionDetailsEntity commissionDetailsEntity) {
        return commissionService.saveCommissionDetails(commissionDetailsEntity);
    }

    @DeleteMapping
    public void deleteCommissionDetails(@RequestBody CommissionDetailsEntity commissionDetailsEntity) {
        commissionService.deleteCommissionDetails(commissionDetailsEntity);
    }
}