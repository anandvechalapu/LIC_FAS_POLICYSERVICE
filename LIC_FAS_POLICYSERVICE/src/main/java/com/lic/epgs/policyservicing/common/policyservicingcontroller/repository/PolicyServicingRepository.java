package com.lic.epgs.policyservicing.common.policyservicingcontroller.repository;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceRequestDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.exceptions.ApplicationException;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.exceptions.RequiredFieldException;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.exceptions.RequestValidationException;

public interface PolicyServicingRepository {

    CommonResponseDto<PolicyServiceDto> getPolicyServiceById(PolicyServiceRequestDto PolicyServiceRequestDto) throws ApplicationException, RequiredFieldException, RequestValidationException;

}