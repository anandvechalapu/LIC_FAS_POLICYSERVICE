package com.lic.epgs.policyservicing.common.policylevelmergercontroller.service;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.SearchParametersDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository.NewcitrieaSearchPolicyLevelMergerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class NewcitrieaSearchPolicyLevelMergerControllerService {

    @Autowired
    NewcitrieaSearchPolicyLevelMergerControllerRepository newcitrieaSearchPolicyLevelMergerControllerRepository;

    public ResponseEntity<PolicyResponseDto> citrieaSearch(@Validated @RequestBody SearchParametersDto searchParameters) {
        return newcitrieaSearchPolicyLevelMergerControllerRepository.citrieaSearch(searchParameters);
    }
}