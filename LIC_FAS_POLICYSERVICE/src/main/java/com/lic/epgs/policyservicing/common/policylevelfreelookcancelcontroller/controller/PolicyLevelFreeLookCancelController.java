package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.ExistingCitrieaSearch_PolicyLevelFreeLookCancelControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/policyLevelFreeLookCancel")
public class PolicyLevelFreeLookCancelController {

    @Autowired
    ExistingCitrieaSearch_PolicyLevelFreeLookCancelControllerService existingCitrieaSearch_PolicyLevelFreeLookCancelControllerService;

    @GetMapping("/{policyNumber}/{mphCode}/{mphName}/{from}/{to}/{product}/{lineOfBusiness}/{freeLookStatus}/{unitCode}")
    public ResponseEntity<List<FreeLookCancellationDto>> getByAllParameters(@PathVariable String policyNumber, @PathVariable String mphCode, @PathVariable String mphName, @PathVariable Date from, @PathVariable Date to, @PathVariable String product, @PathVariable String lineOfBusiness, @PathVariable String freeLookStatus, @PathVariable String unitCode){
        List<FreeLookCancellationDto> freeLookCancellationDtos =  existingCitrieaSearch_PolicyLevelFreeLookCancelControllerService.findAllByPolicyNumberAndMphCodeAndMphNameAndFromAndToAndProductAndLineOfBusinessAndFreeLookStatusAndUnitCode(policyNumber,mphCode,mphName,from,to,product,lineOfBusiness,freeLookStatus,unitCode);
        return new ResponseEntity<>(freeLookCancellationDtos, HttpStatus.OK);
    }

    @GetMapping("/{mphCode}/{mphName}/{from}/{to}/{product}/{lineOfBusiness}/{freeLookStatus}/{unitCode}")
    public ResponseEntity<List<FreeLookCancellationDto>> getByMphCodeMphNameFromToProductLineOfBusinessFreeLookStatusUnitCode(@PathVariable String mphCode, @PathVariable String mphName, @PathVariable Date from, @PathVariable Date to, @PathVariable String product, @PathVariable String lineOfBusiness, @PathVariable String freeLookStatus, @PathVariable String unitCode){
        List<FreeLookCancellationDto> freeLookCancellationDtos = existingCitrieaSearch_PolicyLevelFreeLookCancelControllerService.findAllByMphCodeAndMphNameAndFromAndToAndProductAndLineOfBusinessAndFreeLookStatusAndUnitCode(mphCode,mphName,from,to,product,lineOfBusiness,freeLookStatus,unitCode);
        return new ResponseEntity<>(freeLookCancellationDtos, HttpStatus.OK);
    }

    @GetMapping("/{policyNumber}/{mphName}/{from}/{to}/{product}/{lineOfBusiness}/{freeLookStatus}/{unitCode}")
    public ResponseEntity<List<FreeLookCancellationDto>> getByPolicyNumberMphNameFromToProductLineOfBusinessFreeLookStatusUnitCode(@PathVariable String policyNumber, @PathVariable String mphName, @PathVariable Date from, @PathVariable Date to, @PathVariable String product, @PathVariable String lineOfBusiness, @PathVariable String freeLookStatus, @PathVariable String unitCode){
        List<FreeLookCancellationDto> freeLookCancellationDtos = existingCitrieaSearch_PolicyLevelFreeLookCancelControllerService.findAllByPolicyNumberAndMphNameAndFromAndToAndProductAndLineOfBusinessAndFreeLookStatusAndUnitCode(policyNumber,mphName,from,to,product,lineOfBusiness,freeLookStatus,unitCode);
        return new ResponseEntity<>(freeLookCancellationDtos