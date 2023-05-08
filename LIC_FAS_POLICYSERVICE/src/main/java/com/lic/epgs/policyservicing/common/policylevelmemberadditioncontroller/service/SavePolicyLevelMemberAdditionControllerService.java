package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.model.SavePolicyLevelMemberAdditionController;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository.SavePolicyLevelMemberAdditionControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SavePolicyLevelMemberAdditionControllerService {

    @Autowired
    private SavePolicyLevelMemberAdditionControllerRepository savePolicyLevelMemberAdditionControllerRepository;

    public SavePolicyLevelMemberAdditionController save(SavePolicyLevelMemberAdditionController savePolicyLevelMemberAdditionController) {
        return savePolicyLevelMemberAdditionControllerRepository.save(savePolicyLevelMemberAdditionController);
    }

    public SavePolicyLevelMemberAdditionController saveAndFlush(SavePolicyLevelMemberAdditionController savePolicyLevelMemberAdditionController) {
        return savePolicyLevelMemberAdditionControllerRepository.saveAndFlush(savePolicyLevelMemberAdditionController);
    }

    public void delete(SavePolicyLevelMemberAdditionController savePolicyLevelMemberAdditionController) {
        savePolicyLevelMemberAdditionControllerRepository.delete(savePolicyLevelMemberAdditionController);
    }

    public boolean existsByComponentName(String componentName) {
        return savePolicyLevelMemberAdditionControllerRepository.existsByComponentName(componentName);
    }

    public SavePolicyLevelMemberAdditionController findByComponentName(String componentName) {
        return savePolicyLevelMemberAdditionControllerRepository.findByComponentName(componentName);
    }

    public SavePolicyLevelMemberAdditionController findByMemberAdditionId(String memberAdditionId) {
        return savePolicyLevelMemberAdditionControllerRepository.findByMemberAdditionId(memberAdditionId);
    }

    public void deleteByComponentName(String componentName) {
        savePolicyLevelMemberAdditionControllerRepository.deleteByComponentName(componentName);
    }

    public void deleteByMemberAdditionId(String memberAdditionId) {
        savePolicyLevelMemberAdditionControllerRepository.deleteByMemberAdditionId(memberAdditionId);
    }

    public List<SavePolicyLevelMemberAdditionController> findAll(){
        return savePolicyLevelMemberAdditionControllerRepository.findAll();
    }

}