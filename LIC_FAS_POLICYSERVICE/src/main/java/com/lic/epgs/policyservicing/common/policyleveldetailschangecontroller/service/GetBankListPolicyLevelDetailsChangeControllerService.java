package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.MphBankDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.PolicyBankOldDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.repository.GetBankListPolicyLevelDetailsChangeControllerRepository;

@Service
public class GetBankListPolicyLevelDetailsChangeControllerService {

    @Autowired
    GetBankListPolicyLevelDetailsChangeControllerRepository getBankListPolicyLevelDetailsChangeControllerRepository;
    
    public PolicyBankOldDto convertNewDtoToOld(Long mphId) {
        return getBankListPolicyLevelDetailsChangeControllerRepository.convertNewDtoToOld(mphId);
    }
    
    public List<MphBankDto> getBankList(Long mphId) {
        return getBankListPolicyLevelDetailsChangeControllerRepository.getBankList(mphId);
    }
    
}