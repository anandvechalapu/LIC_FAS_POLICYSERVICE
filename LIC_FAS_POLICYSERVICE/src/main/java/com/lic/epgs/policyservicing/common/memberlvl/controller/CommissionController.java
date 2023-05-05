package com.lic.epgs.policyservicing.common.memberlvl.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.memberlvl.model.CommissionModel;
import com.lic.epgs.policyservicing.common.memberlvl.service.CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionController {

    @Autowired
    private CommissionService commissionService;
    
    @GetMapping("/{unitCode}/{role}")
    public CommissionModel getCommissionByUnitCodeAndRole(@PathVariable String unitCode, @PathVariable String role) {
        return commissionService.findByUnitCodeAndRole(unitCode, role);
    }
    
    @GetMapping("/{commissionId}")
    public CommissionModel getCommissionDetailsByCommissionId(@PathVariable Long commissionId) {
        return commissionService.findByCommissionId(commissionId);
    }
    
    @PostMapping
    public CommissionModel createCommission(@Valid @RequestBody CommissionModel commissionModel) {
              return commissionService.save(commissionModel);
    }
    
    @PutMapping
    public CommissionModel updateCommissionDetails(@Valid @RequestBody CommissionModel commissionModel) {
              return commissionService.save(commissionModel);
    }
    
    @DeleteMapping("/{commissionId}")
    public void deleteCommission(@PathVariable Long commissionId) {
              commissionService.deleteByCommissionId(commissionId);
    }
    
    @GetMapping
    public List<CommissionModel> getAllCommissions() {
        return commissionService.findAllCommissions();
    }

}