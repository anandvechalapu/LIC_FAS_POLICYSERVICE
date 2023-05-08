@Service
public class SavePolicyLevelConversionDetails_PolicyLevelConversionControllerService {

    @Autowired
    private SavePolicyLevelConversionDetails_PolicyLevelConversionControllerRepository savePolicyLevelConversionDetails_PolicyLevelConversionControllerRepository;

    public PolicyLevelConversionTempEntity savePolicyLevelConversionDetails(PolicyLevelConversionTempEntity policyLevelConversionTempEntity) {
        return savePolicyLevelConversionDetails_PolicyLevelConversionControllerRepository.save(policyLevelConversionTempEntity);
    }
}

package com.lic.epgs.policyservicing.common.policylevelconversioncontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.PolicyLevelConversionTempEntity;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.GetInprogressOverallDetails_PolicyLevelConversionControllerService;
import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.service.SavePolicyLevelConversionDetails_PolicyLevelConversionControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/policylevelconversioncontroller")
public class PolicyLevelConversionController {

    @Autowired
    private GetInprogressOverallDetails_PolicyLevelConversionControllerService getInprogressOverallDetails_PolicyLevelConversionControllerService;

    @Autowired
    private SavePolicyLevelConversionDetails_PolicyLevelConversionControllerService savePolicyLevelConversionDetails_PolicyLevelConversionControllerService;

    @GetMapping("/getinprogressoveralldetails/{serviceId}")
    public Optional<PolicyLevelConversionTempEntity> getInprogressOverallDetails(@PathVariable Long serviceId) {
        return getInprogressOverallDetails_PolicyLevelConversionControllerService.getInprogressOverallDetails(serviceId);
    }

    @PostMapping("/savepolicylevelconversiondetails")
    public PolicyLevelConversionTempEntity savePolicyLevelConversionDetails(@RequestBody PolicyLevelConversionTempEntity policyLevelConversionTempEntity) {
        return savePolicyLevelConversionDetails_PolicyLevelConversionControllerService.savePolicyLevelConversionDetails(policyLevelConversionTempEntity);
    }
}