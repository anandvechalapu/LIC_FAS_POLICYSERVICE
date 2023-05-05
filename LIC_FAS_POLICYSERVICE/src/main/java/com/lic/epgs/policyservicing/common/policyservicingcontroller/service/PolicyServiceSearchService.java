package com.lic.epgs.policyservicing.common.policyservicingcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicySearchDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.repository.PolicyServiceSearchRepository;

@Service
public class PolicyServiceSearchService {
	
	@Autowired
	PolicyServiceSearchRepository policyServiceSearchRepository;
	
	public CommonResponseDto searchForPolicyServices(PolicySearchDto searchDto){
		return policyServiceSearchRepository.searchForPolicyServices(searchDto);
	}
	
	public CommonResponseDto getPolicyServicesByPageNumber(PolicySearchDto searchDto){
		return policyServiceSearchRepository.getPolicyServicesByPageNumber(searchDto);
	}
	
	public CommonResponseDto getPolicyServicesByPageSize(PolicySearchDto searchDto){
		return policyServiceSearchRepository.getPolicyServicesByPageSize(searchDto);
	}
	
	public CommonResponseDto getPolicyServicesByStartDate(PolicySearchDto searchDto){
		return policyServiceSearchRepository.getPolicyServicesByStartDate(searchDto);
	}
	
	public CommonResponseDto getPolicyServicesByEndDate(PolicySearchDto searchDto){
		return policyServiceSearchRepository.getPolicyServicesByEndDate(searchDto);
	}
	
	public CommonResponseDto getPolicyServicesByServiceType(PolicySearchDto searchDto){
		return policyServiceSearchRepository.getPolicyServicesByServiceType(searchDto);
	}
	
	public List<PolicyServiceDto> findByPolicyNumber(String policyNumber){
		return policyServiceSearchRepository.findByPolicyNumber(policyNumber);
	}
	
	public List<PolicyServiceDto> findBySearchCriteria(String page){
		return policyServiceSearchRepository.findBySearchCriteria(page);
	}
}