package com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.service;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.repository.GetNotesPolicyLevelMemberAdditionControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetNotesPolicyLevelMemberAdditionControllerService {

    @Autowired
    private GetNotesPolicyLevelMemberAdditionControllerRepository getNotesPolicyLevelMemberAdditionControllerRepository;

    public String getNotes(Long memberAdditionId) {
        try {
            return getNotesPolicyLevelMemberAdditionControllerRepository.getNotes(memberAdditionId);
        } catch (Exception e) {
            return "An unexpected exception occurred. Please try again later.";
        }
    }

}