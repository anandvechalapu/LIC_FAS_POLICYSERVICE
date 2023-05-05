package com.lic.epgs.policyservicing.common.policyservicingcontroller.controller;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.service.SearchPolicyMember_PolicyServicingController7Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search-policy-member")
public class SearchPolicyMember_PolicyServicingController7Controller {

    @Autowired
    private SearchPolicyMember_PolicyServicingController7Service searchPolicyMember_PolicyServicingController7Service;

    @GetMapping
    public CommonResponseDto getMembersById(@RequestParam("policyId") String policyId) throws Exception {
        return searchPolicyMember_PolicyServicingController7Service.getMembersById(policyId);
    }
}