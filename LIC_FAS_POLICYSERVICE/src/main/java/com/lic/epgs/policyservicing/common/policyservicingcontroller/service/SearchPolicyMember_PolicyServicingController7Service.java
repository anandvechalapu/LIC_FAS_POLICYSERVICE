package com.lic.epgs.policyservicing.common.policyservicingcontroller.service;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.repository.SearchPolicyMember_PolicyServicingController7Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchPolicyMember_PolicyServicingController7Service {

    @Autowired
    private SearchPolicyMember_PolicyServicingController7Repository searchPolicyMember_PolicyServicingController7Repository;

    public CommonResponseDto getMembersById(String policyId) throws Exception {
        return searchPolicyMember_PolicyServicingController7Repository.getMembersById(policyId);
    }
}