package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.PolicyBankOldDto;

public class PolicyLevelFreeLookCancelControllerModel {

    private PolicyBankOldDto policyBankOldDto;
    private FreeLookCancellationResponseDto freeLookCancellationResponseDto;

    public PolicyLevelFreeLookCancelControllerModel() {
    }

    public PolicyLevelFreeLookCancelControllerModel(PolicyBankOldDto policyBankOldDto, FreeLookCancellationResponseDto freeLookCancellationResponseDto) {
        this.policyBankOldDto = policyBankOldDto;
        this.freeLookCancellationResponseDto = freeLookCancellationResponseDto;
    }

    public PolicyBankOldDto getPolicyBankOldDto() {
        return policyBankOldDto;
    }

    public void setPolicyBankOldDto(PolicyBankOldDto policyBankOldDto) {
        this.policyBankOldDto = policyBankOldDto;
    }

    public FreeLookCancellationResponseDto getFreeLookCancellationResponseDto() {
        return freeLookCancellationResponseDto;
    }

    public void setFreeLookCancellationResponseDto(FreeLookCancellationResponseDto freeLookCancellationResponseDto) {
        this.freeLookCancellationResponseDto = freeLookCancellationResponseDto;
    }
}