package com.lic.epgs.policyservicing.common.commoncontroller.repository;

import com.lic.epgs.policyservicing.common.commoncontroller.model.ServiceDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyServicingCommonRepository extends JpaRepository<ServiceDetails, Long> {
}

package com.lic.epgs.policyservicing.common.commoncontroller.controller;

import com.lic.epgs.policyservicing.common.commoncontroller.model.ServiceDetails;
import com.lic.epgs.policyservicing.common.commoncontroller.service.PolicyServicingCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyServicingCommonController {

    @Autowired
    private PolicyServicingCommonService policyServicingCommonService;

    @GetMapping("/services/{serviceId}")
    public ResponseEntity<ServiceDetails> getServiceDetailsById(@PathVariable("serviceId") Long serviceId) {
        ServiceDetails serviceDetails = policyServicingCommonService.getServiceDetailsById(serviceId).orElse(null);
        if (serviceDetails == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(serviceDetails, HttpStatus.OK);
    }
}