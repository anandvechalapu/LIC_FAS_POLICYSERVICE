package com.lic.epgs.fund.policyinterestratefundcontroller.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.lic.epgs.fund.policyinterestratefundcontroller.repository.MemberCreditBulkRepository;

@Service
public class MemberCreditBulkService {

    private MemberCreditBulkRepository memberCreditBulkRepository;

    public MemberCreditBulkService(MemberCreditBulkRepository memberCreditBulkRepository){
        this.memberCreditBulkRepository = memberCreditBulkRepository;
    }

    public ResponseEntity<Object> creditInterestForMultiplePolicyMembers(String policyNo, List<String> memberIds){
        return memberCreditBulkRepository.creditInterestForMultiplePolicyMembers(policyNo, memberIds);
    }

}