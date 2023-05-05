package com.lic.epgs.fund.interestfundcontroller.service;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.fund.interestfundcontroller.repository.PolicyMemberviewLatestByMemberIdRepository;

@Service
public class PolicyMemberviewLatestByMemberIdService {

    private final PolicyMemberviewLatestByMemberIdRepository policyMemberviewLatestByMemberIdRepository;

    public PolicyMemberviewLatestByMemberIdService(PolicyMemberviewLatestByMemberIdRepository policyMemberviewLatestByMemberIdRepository) {
        this.policyMemberviewLatestByMemberIdRepository = policyMemberviewLatestByMemberIdRepository;
    }

    public Policy findLatestByMemberId(Long memberId) {
        return policyMemberviewLatestByMemberIdRepository.findLatestByMemberId(memberId);
    }

    public void updateLatestByMemberId(Long memberId, LocalDate date) {
        policyMemberviewLatestByMemberIdRepository.updateLatestByMemberId(memberId, date);
    }

    public void deleteLatestByMemberId(Long memberId, LocalDate date) {
        policyMemberviewLatestByMemberIdRepository.deleteLatestByMemberId(memberId, date);
    }

    public Long countByMemberId(Long memberId) {
        return policyMemberviewLatestByMemberIdRepository.countByMemberId(memberId);
    }
}