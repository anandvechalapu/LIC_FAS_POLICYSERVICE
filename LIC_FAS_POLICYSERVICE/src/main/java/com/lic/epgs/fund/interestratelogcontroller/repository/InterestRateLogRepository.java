package com.lic.epgs.fund.interestratelogcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.fund.interestratelogcontroller.model.InterestRateLog;

public interface InterestRateLogRepository extends JpaRepository<InterestRateLog, Long> {

    @Query(value = "SELECT * FROM interest_rate_logs WHERE member_id = ?1 ORDER BY id ASC", nativeQuery = true)
    List<InterestRateLog> findErrorLogsByMemberId(Long memberId);

}