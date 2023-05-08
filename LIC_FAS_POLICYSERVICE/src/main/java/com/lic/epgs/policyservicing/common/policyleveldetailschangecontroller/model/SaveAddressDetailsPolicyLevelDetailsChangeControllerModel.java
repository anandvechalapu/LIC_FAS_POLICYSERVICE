package com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.dto.PolicyAddressOldDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.dto.PolicyDtlsResponseDto;

public class SaveAddressDetailsPolicyLevelDetailsChangeControllerModel {

    private PolicyAddressOldDto mphAddressNewDto;
    private PolicyDtlsResponseDto responseDto;

    public SaveAddressDetailsPolicyLevelDetailsChangeControllerModel(PolicyAddressOldDto mphAddressNewDto, PolicyDtlsResponseDto responseDto) {
        this.mphAddressNewDto = mphAddressNewDto;
        this.responseDto = responseDto;
    }

    public PolicyAddressOldDto getMphAddressNewDto() {
        return mphAddressNewDto;
    }

    public void setMphAddressNewDto(PolicyAddressOldDto mphAddressNewDto) {
        this.mphAddressNewDto = mphAddressNewDto;
    }

    public PolicyDtlsResponseDto getResponseDto() {
        return responseDto;
    }

    public void setResponseDto(PolicyDtlsResponseDto responseDto) {
        this.responseDto = responseDto;
    }
}