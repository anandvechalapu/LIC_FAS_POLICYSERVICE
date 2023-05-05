package com.lic.epgs.fund.interestratelogcontroller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.fund.interestratelogcontroller.model.InterestRateLog;
import com.lic.epgs.fund.interestratelogcontroller.service.InterestRateLogService;

@RestController
@RequestMapping("/interestRateLogs")
public class InterestRateLogController {

    @Autowired
    private InterestRateLogService interestRateLogService;

    @GetMapping("/errors/{memberId}")
    public List<InterestRateLog> getErrorLogsByMemberId(@PathVariable Long memberId){
        return interestRateLogService.findErrorLogsByMemberId(memberId);
    }

}