package com.lic.epgs.policyservicing.common.memberlvl.controller;

import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutMasterModel;
import com.lic.epgs.policyservicing.common.memberlvl.service.TransferInAndOutMasterService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transferinandoutmaster")
public class TransferInAndOutMasterController {
    
    @Autowired
    TransferInAndOutMasterService transferInAndOutMasterService;

    @GetMapping("/get")
    public TransferInAndOutMasterModel getTransferInAndOutMaster(@RequestParam(name="unitCode") String unitCode, @RequestParam(name="transferId") String transferId) {
        return transferInAndOutMasterService.getTransferInAndOutMaster(unitCode, transferId);
    }

}