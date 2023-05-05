package com.lic.epgs.policyservicing.common.policyservicingcontroller.model;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;

public class SearchPolicyMember_PolicyServicingController7 {

    private String policyId;
    private CommonResponseDto commonResponseDto;

    public SearchPolicyMember_PolicyServicingController7() {
    }

    public SearchPolicyMember_PolicyServicingController7(String policyId, CommonResponseDto commonResponseDto) {
        this.policyId = policyId;
        this.commonResponseDto = commonResponseDto;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public CommonResponseDto getCommonResponseDto() {
        return commonResponseDto;
    }

    public void setCommonResponseDto(CommonResponseDto commonResponseDto) {
        this.commonResponseDto = commonResponseDto;
    }
}