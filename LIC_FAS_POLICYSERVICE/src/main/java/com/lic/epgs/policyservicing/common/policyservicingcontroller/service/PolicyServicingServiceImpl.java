package com.lic.epgs.policyservicing.common.policyservicingcontroller.service;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceRequestDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.exceptions.ApplicationException;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.exceptions.RequiredFieldException;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.exceptions.RequestValidationException;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.repository.PolicyServicingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyServicingServiceImpl implements PolicyServicingService {

    @Autowired
    private PolicyServicingRepository policyServicingRepository;

    @Override
    public CommonResponseDto<PolicyServiceDto> getPolicyServiceById(PolicyServiceRequestDto PolicyServiceRequestDto)
            throws ApplicationException, RequiredFieldException, RequestValidationException {
        return policyServicingRepository.getPolicyServiceById(PolicyServiceRequestDto);
    }
}