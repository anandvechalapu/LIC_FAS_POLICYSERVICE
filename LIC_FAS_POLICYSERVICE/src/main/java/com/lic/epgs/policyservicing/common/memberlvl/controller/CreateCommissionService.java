@Service
public class CreateCommissionService {

    @Autowired
    CreateCommissionRepository createCommissionRepository;

    public ResponseEntity<CommissionDto> saveCommission(CommissionDto commissionDto){
        return createCommissionRepository.saveCommission(commissionDto);
    }

    public ResponseEntity<String> getErrorMessageWithStatusCode400(){
        return createCommissionRepository.getErrorMessageWithStatusCode400();
    }

    public ResponseEntity<String> getErrorMessageWithStatusCode404(){
        return createCommissionRepository.getErrorMessageWithStatusCode404();
    }

}

package com.lic.epgs.policyservicing.common.memberlvl.controller;

import com.lic.epgs.policyservicing.common.memberlvl.model.CommissionDto;
import com.lic.epgs.policyservicing.common.memberlvl.service.CreateCommissionService;
import com.lic.epgs.policyservicing.common.memberlvl.service.GetAllExistingCommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/commission")
public class CommissionController {

    @Autowired
    private GetAllExistingCommissionService getAllExistingCommissionService;

    @Autowired
    private CreateCommissionService createCommissionService;

    @GetMapping("/{commissionId}")
    public ResponseEntity<?> getExistingCommission(@PathVariable Integer commissionId) {
        return getAllExistingCommissionService.getAllExistingCommission(commissionId);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createCommission(@Valid @RequestBody CommissionDto commissionDto) {
        return createCommissionService.saveCommission(commissionDto);
    }

}