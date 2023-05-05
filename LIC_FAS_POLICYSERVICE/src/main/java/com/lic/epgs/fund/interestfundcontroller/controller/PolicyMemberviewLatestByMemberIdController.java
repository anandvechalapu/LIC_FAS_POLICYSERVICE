package com.lic.epgs.fund.interestfundcontroller.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.fund.interestfundcontroller.model.Policy;

@Repository
public interface PolicyMemberviewLatestByMemberIdRepository extends CrudRepository<Policy, Long> {

    @Query("SELECT p FROM Policy p WHERE p.memberId = :memberId ORDER BY p.date DESC")
    Policy findLatestByMemberId(@Param("memberId") Long memberId);

    @Modifying
    @Transactional
    @Query("UPDATE Policy SET date = :date WHERE memberId = :memberId")
    void updateLatestByMemberId(@Param("memberId") Long memberId, @Param("date") LocalDate date);

    @Modifying
    @Transactional
    @Query("DELETE FROM Policy WHERE memberId = :memberId AND date = :date")
    void deleteLatestByMemberId(@Param("memberId") Long memberId, @Param("date") LocalDate date);

    @Query("SELECT COUNT(p) FROM Policy p WHERE p.memberId = :memberId")
    Long countByMemberId(@Param("memberId") Long memberId);

}

package com.lic.epgs.fund.interestfundcontroller.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.fund.interestfundcontroller.model.Policy;
import com.lic.epgs.fund.interestfundcontroller.service.PolicyMemberviewLatestByMemberIdService;

@RestController
@RequestMapping("/policy")
public class PolicyMemberviewLatestByMemberIdController {

    private final PolicyMemberviewLatestByMemberIdService policyMemberviewLatestByMemberIdService;

    @Autowired
    public PolicyMemberviewLatestByMemberIdController(PolicyMemberviewLatestByMemberIdService policyMemberviewLatestByMemberIdService) {
        this.policyMemberviewLatestByMemberIdService = policyMemberviewLatestByMemberIdService;
    }

    @GetMapping("/member/{memberId}")
    public Policy findLatestByMemberId(@PathVariable Long memberId) {
        return policyMemberviewLatestByMemberIdService.findLatestByMemberId(memberId);
    }

    @PostMapping("/member/{memberId}/update")
    public void updateLatestByMemberId(@PathVariable Long memberId, LocalDate date) {
        policyMemberviewLatestByMemberIdService.updateLatestByMemberId(memberId, date);
    }

    @PostMapping("/member/{memberId}/delete")
    public void deleteLatestByMemberId(@PathVariable Long memberId, LocalDate date) {
        policyMemberviewLatestByMemberIdService.deleteLatestByMemberId(memberId, date);
    }

    @GetMapping("/member/{memberId}/count")
    public Long countByMemberId(@PathVariable Long memberId) {
        return policyMemberviewLatestByMemberIdService.countByMemberId(memberId);
    }

}