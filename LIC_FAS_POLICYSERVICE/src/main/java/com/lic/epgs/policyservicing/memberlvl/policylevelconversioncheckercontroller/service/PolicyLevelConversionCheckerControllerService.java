package com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.service;

import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.model.PolicyConversion;
import com.lic.epgs.policyservicing.memberlvl.policylevelconversioncheckercontroller.repository.PolicyLevelConversionCheckerControllerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyLevelConversionCheckerControllerService {
    
    @Autowired
    private PolicyLevelConversionCheckerControllerRepository policyLevelConversionCheckerControllerRepository;

    // Method to perform existing common search using various search parameters
    public List<PolicyConversion> existingCommonSearch(String mphCode, String mphName, String status, String product, String unitCode, int pageCount, int limit){
        return policyLevelConversionCheckerControllerRepository.existingCommonSearch(mphCode, mphName, status, product, unitCode, pageCount, limit);
    }

    // Method to set transaction status
    public void setStatus(String status){
        policyLevelConversionCheckerControllerRepository.setStatus(status);
    }

    // Method to set transaction message
    public void setMessage(String message){
        policyLevelConversionCheckerControllerRepository.setMessage(message);
    }

    // Method to set default limit of 5000 records
    public void setDefaultLimit(int limit){
        policyLevelConversionCheckerControllerRepository.setDefaultLimit(limit);
    }

    // Method to set default page count of 0
    public void setDefaultPageCount(int pageCount){
        policyLevelConversionCheckerControllerRepository.setDefaultPageCount(pageCount);
    }

    // Method to sort the results in descending order by the createdOn field
    public void sortByCreatedOn(){
        policyLevelConversionCheckerControllerRepository.sortByCreatedOn();
    }

    // Method to ignore blank search parameters
    public void ignoreBlankSearchParameters(){
        policyLevelConversionCheckerControllerRepository.ignoreBlankSearchParameters();
    }

    // Method to return error transaction status and message
    public void returnErrorTransactionStatusAndMessage(){
        policyLevelConversionCheckerControllerRepository.returnErrorTransactionStatusAndMessage();
    }

}