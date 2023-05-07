package com.lic.epgs.surrender.controller;

import java.util.Date;
import java.util.List;

import com.lic.epgs.surrender.dto.PolicySurrenderSearchDto;
import com.lic.epgs.surrender.service.PolicySurrenderSearchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/surrender")
public class PolicySurrenderSearchController {
    @Autowired
    private PolicySurrenderSearchService policySurrenderSearchService;

    @GetMapping("/policyNo/{policyNo}")
    public List<PolicySurrenderSearchDto> findByPolicyNo(@PathVariable String policyNo) {
        return policySurrenderSearchService.findByPolicyNo(policyNo);
    }

    @GetMapping("/mphCode/{mphCode}")
    public List<PolicySurrenderSearchDto> findByMphCode(@PathVariable String mphCode) {
        return policySurrenderSearchService.findByMphCode(mphCode);
    }

    @GetMapping("/mphName/{mphName}")
    public List<PolicySurrenderSearchDto> findByMphNameContainingIgnoreCase(@PathVariable String mphName) {
        return policySurrenderSearchService.findByMphNameContainingIgnoreCase(mphName);
    }

    @GetMapping("/surrenderStatus/{surrenderStatus}")
    public List<PolicySurrenderSearchDto> findBySurrenderStatus(@PathVariable String surrenderStatus) {
        return policySurrenderSearchService.findBySurrenderStatus(surrenderStatus);
    }

    @GetMapping("/product/{product}")
    public List<PolicySurrenderSearchDto> findByProduct(@PathVariable String product) {
        return policySurrenderSearchService.findByProduct(product);
    }

    @GetMapping("/unitCode/{unitCode}")
    public List<PolicySurrenderSearchDto> findByUnitCode(@PathVariable String unitCode) {
        return policySurrenderSearchService.findByUnitCode(unitCode);
    }

    @GetMapping("/createdOn/{fromDate}/{toDate}")
    public List<PolicySurrenderSearchDto> findByCreatedOnBetween(@PathVariable Date fromDate, @PathVariable Date toDate) {
        return policySurrenderSearchService.findByCreatedOnBetween(fromDate, toDate);
    }

    @GetMapping("/pageCount/{pageCount}")
    public List<PolicySurrenderSearchDto> findByPageCount(@PathVariable int pageCount) {
        return policySurrenderSearchService.findByPageCount(pageCount);
    }

    @GetMapping("/limit/{limit}")
    public List<PolicySurrenderSearchDto> findByLimit(@PathVariable int limit) {
        return policySurrenderSearchService.findByLimit(limit);
    }
}