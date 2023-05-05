package com.lic.epgs.fund.interestratelogcontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.fund.interestratelogcontroller.model.InterestRateLog;
import com.lic.epgs.fund.interestratelogcontroller.repository.InterestRateLogRepository;

@Service
public class InterestRateLogService {

    @Autowired
    private InterestRateLogRepository interestRateLogRepository;

    public List<InterestRateLog> findErrorLogsByMemberId(Long memberId){
        return interestRateLogRepository.findErrorLogsByMemberId(memberId);
    }
}