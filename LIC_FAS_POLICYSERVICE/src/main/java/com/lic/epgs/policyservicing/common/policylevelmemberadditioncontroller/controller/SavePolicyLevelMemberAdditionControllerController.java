package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.SavePolicyLevelMemberAdditionController;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service.SavePolicyLevelMemberAdditionControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policylevelmemberadditioncontroller")
public class SavePolicyLevelMemberAdditionControllerController {

    @Autowired
    private SavePolicyLevelMemberAdditionControllerService savePolicyLevelMemberAdditionControllerService;

    @PostMapping
    public SavePolicyLevelMemberAdditionController save(@RequestBody SavePolicyLevelMemberAdditionController savePolicyLevelMemberAdditionController) {
        return savePolicyLevelMemberAdditionControllerService.save(savePolicyLevelMemberAdditionController);
    }

    @PutMapping
    public SavePolicyLevelMemberAdditionController saveAndFlush(@RequestBody SavePolicyLevelMemberAdditionController savePolicyLevelMemberAdditionController) {
        return savePolicyLevelMemberAdditionControllerService.saveAndFlush(savePolicyLevelMemberAdditionController);
    }

    @DeleteMapping
    public void delete(@RequestBody SavePolicyLevelMemberAdditionController savePolicyLevelMemberAdditionController) {
        savePolicyLevelMemberAdditionControllerService.delete(savePolicyLevelMemberAdditionController);
    }

    @GetMapping("/findByComponentName/{componentName}")
    public SavePolicyLevelMemberAdditionController findByComponentName(@PathVariable String componentName) {
        return savePolicyLevelMemberAdditionControllerService.findByComponentName(componentName);
    }

    @GetMapping("/findByMemberAdditionId/{memberAdditionId}")
    public SavePolicyLevelMemberAdditionController findByMemberAdditionId(@PathVariable String memberAdditionId) {
        return savePolicyLevelMemberAdditionControllerService.findByMemberAdditionId(memberAdditionId);
    }

    @DeleteMapping("/deleteByComponentName/{componentName}")
    public void deleteByComponentName(@PathVariable String componentName) {
        savePolicyLevelMemberAdditionControllerService.deleteByComponentName(componentName);
    }

    @DeleteMapping("/deleteByMemberAdditionId/{memberAdditionId}")
    public void deleteByMemberAdditionId(@PathVariable String memberAdditionId) {
        savePolicyLevelMemberAdditionControllerService.deleteByMemberAdditionId(memberAdditionId);
    }

    @GetMapping("/findAll")
    public List<SavePolicyLevelMemberAdditionController> findAll(){
        return savePolicyLevelMemberAdditionControllerService.findAll();
    }

}