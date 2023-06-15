package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository.PolicyLevelFreeLookCancelControllerRepository;

@Service
public class PolicyLevelFreeLookCancelControllerService {

    @Autowired
    private PolicyLevelFreeLookCancelControllerRepository policyLevelFreeLookCancelControllerRepository;

    public List<Object> getTableauDataFeed() {
        return policyLevelFreeLookCancelControllerRepository.findTableauDataFeed();
    }
}