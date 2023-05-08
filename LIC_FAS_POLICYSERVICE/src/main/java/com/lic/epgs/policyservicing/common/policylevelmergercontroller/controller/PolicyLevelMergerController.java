package com.lic.epgs.policyservicing.common.policylevelmergercontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.SearchParametersDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.service.NewcitrieaSearchPolicyLevelMergerControllerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Api(value = "Policy Level Merger Controller")
public class PolicyLevelMergerController {

    @Autowired
    NewcitrieaSearchPolicyLevelMergerControllerService newcitrieaSearchPolicyLevelMergerControllerService;

    @ApiOperation(value = "Search for policy level", notes = "Search for policy level using citriea search.")
    @PostMapping("/v1/search/policy-level")
    public ResponseEntity<PolicyResponseDto> citrieaSearch(
            @ApiParam(value = "Search parameters for citriea search.", required = true) @Valid @RequestBody SearchParametersDto searchParameters
    ) {
        return newcitrieaSearchPolicyLevelMergerControllerService.citrieaSearch(searchParameters);
    }

}