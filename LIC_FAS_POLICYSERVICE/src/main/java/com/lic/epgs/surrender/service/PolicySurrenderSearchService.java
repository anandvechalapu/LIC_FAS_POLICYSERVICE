package com.lic.epgs.surrender.service;

import com.lic.epgs.surrender.dto.PolicySurrenderSearchDto;
import com.lic.epgs.surrender.repository.PolicySurrenderSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PolicySurrenderSearchService {
    @Autowired
    private PolicySurrenderSearchRepository policySurrenderSearchRepository;

    public List<PolicySurrenderSearchDto> findByPolicyNo(String policyNo) {
        return policySurrenderSearchRepository.findByPolicyNo(policyNo);
    }

    public List<PolicySurrenderSearchDto> findByMphCode(String mphCode) {
        return policySurrenderSearchRepository.findByMphCode(mphCode);
    }

    public List<PolicySurrenderSearchDto> findByMphNameContainingIgnoreCase(String mphName) {
        return policySurrenderSearchRepository.findByMphNameContainingIgnoreCase(mphName);
    }

    public List<PolicySurrenderSearchDto> findBySurrenderStatus(String surrenderStatus) {
        return policySurrenderSearchRepository.findBySurrenderStatus(surrenderStatus);
    }

    public List<PolicySurrenderSearchDto> findByProduct(String product) {
        return policySurrenderSearchRepository.findByProduct(product);
    }

    public List<PolicySurrenderSearchDto> findByUnitCode(String unitCode) {
        return policySurrenderSearchRepository.findByUnitCode(unitCode);
    }

    public List<PolicySurrenderSearchDto> findByCreatedOnBetween(Date fromDate, Date toDate) {
        return policySurrenderSearchRepository.findByCreatedOnBetween(fromDate, toDate);
    }

    public List<PolicySurrenderSearchDto> findByPageCount(int pageCount) {
        return policySurrenderSearchRepository.findByPageCount(pageCount);
    }

    public List<PolicySurrenderSearchDto> findByLimit(int limit) {
        return policySurrenderSearchRepository.findByLimit(limit);
    }

}