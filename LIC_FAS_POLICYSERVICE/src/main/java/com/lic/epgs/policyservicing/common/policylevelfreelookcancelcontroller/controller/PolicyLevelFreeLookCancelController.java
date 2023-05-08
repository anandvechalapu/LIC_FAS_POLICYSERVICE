OB) {
        this.policyHolderDOB = policyHolderDOB;
    }

    public String getPolicyHolderAddress() {
        return policyHolderAddress;
    }

    public void setPolicyHolderAddress(String policyHolderAddress) {
        this.policyHolderAddress = policyHolderAddress;
    }

    public String getFreeLookCancellationDate() {
        return freeLookCancellationDate;
    }

    public void setFreeLookCancellationDate(String freeLookCancellationDate) {
        this.freeLookCancellationDate = freeLookCancellationDate;
    }

    public String getFreeLookCancellationReason() {
        return freeLookCancellationReason;
    }

    public void setFreeLookCancellationReason(String freeLookCancellationReason) {
        this.freeLookCancellationReason = freeLookCancellationReason;
    }

}

package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.PolicyLevelFreeLookCancelControllerService;

@RestController
@RequestMapping("/freeLookCancellation")
public class PolicyLevelFreeLookCancelController {
    
    @Autowired
    PolicyLevelFreeLookCancelControllerService policyLevelFreeLookCancelControllerService;

    @GetMapping("/{freeLookCancellationId}")
    public FreeLookCancellationResponseDto getFreeLookCancellationDetails(@PathVariable("freeLookCancellationId") Long freeLookCancellationId) {
        return policyLevelFreeLookCancelControllerService.getFreeLookCancellationDetails(freeLookCancellationId);
    }
}