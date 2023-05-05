package com.lic.epgs.policyservicing.common.memberlvl.controller;

import com.lic.epgs.policyservicing.common.memberlvl.entity.CommissionEntity;
import com.lic.epgs.policyservicing.common.memberlvl.service.CommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api/commission")
public class CommissionController {

    @Autowired
    private CommissionService commissionService;

    @GetMapping("/inprogress")
    public ResponseEntity<List<CommissionEntity>> getInprogressLoad(@RequestParam(name = "unitCode") String unitCode) {
        List<CommissionEntity> commissionEntities = commissionService.getInprogressLoad(unitCode);
        return new ResponseEntity<>(commissionEntities, HttpStatus.OK);
    }

    @GetMapping("/inprogress/maker")
    public ResponseEntity<List<CommissionEntity>> getInprogressMakerLoad(@RequestParam(name = "unitCode") String unitCode) {
        List<CommissionEntity> commissionEntities = commissionService.getInprogressMakerLoad(unitCode);
        return new ResponseEntity<>(commissionEntities, HttpStatus.OK);
    }

}