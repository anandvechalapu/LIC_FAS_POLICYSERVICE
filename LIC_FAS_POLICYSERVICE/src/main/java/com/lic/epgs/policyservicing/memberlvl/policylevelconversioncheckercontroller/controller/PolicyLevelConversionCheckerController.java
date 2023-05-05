package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.controller;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.PolicyConversion;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.service.PolicyLevelConversionCheckerControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PolicyLevelConversionCheckerController {

    @Autowired
    private PolicyLevelConversionCheckerControllerService policyLevelConversionCheckerControllerService;

    @GetMapping("/policyConversion")
    public List<PolicyConversion> existingCommonSearch(@RequestParam(value="mphCode", required = false) String mphCode,
                                                       @RequestParam(value="mphName", required = false) String mphName,
                                                       @RequestParam(value="status", required = false) String status,
                                                       @RequestParam(value="product", required = false) String product,
                                                       @RequestParam(value="unitCode", required = false) String unitCode,
                                                       @RequestParam(value="pageCount") int pageCount,
                                                       @RequestParam(value="limit") int limit) {
        return policyLevelConversionCheckerControllerService.existingCommonSearch(mphCode, mphName, status, product, unitCode, pageCount, limit);
    }

    @PostMapping("/policyConversion/setStatus")
    public void setStatus(@RequestParam(value="status") String status){
        policyLevelConversionCheckerControllerService.setStatus(status);
    }

    @PostMapping("/policyConversion/setMessage")
    public void setMessage(@RequestParam(value="message") String message){
        policyLevelConversionCheckerControllerService.setMessage(message);
    }

    @PostMapping("/policyConversion/setDefaultLimit")
    public void setDefaultLimit(@RequestParam(value="limit") int limit){
        policyLevelConversionCheckerControllerService.setDefaultLimit(limit);
    }

    @PostMapping("/policyConversion/setDefaultPageCount")
    public void setDefaultPageCount(@RequestParam(value="pageCount") int pageCount){
        policyLevelConversionCheckerControllerService.setDefaultPageCount(pageCount);
    }

    @PostMapping("/policyConversion/sortByCreatedOn")
    public void sortByCreatedOn(){
        policyLevelConversionCheckerControllerService.sortByCreatedOn();
    }

    @PostMapping("/policyConversion/ignoreBlankSearchParameters")
    public void ignoreBlankSearchParameters(){
        policyLevelConversionCheckerControllerService.ignoreBlankSearchParameters();
    }

    @PostMapping("/policyConversion/returnErrorTransactionStatusAndMessage")
    public void returnErrorTransactionStatusAndMessage(){
        policyLevelConversionCheckerControllerService.returnErrorTransactionStatusAndMessage();
    }

}