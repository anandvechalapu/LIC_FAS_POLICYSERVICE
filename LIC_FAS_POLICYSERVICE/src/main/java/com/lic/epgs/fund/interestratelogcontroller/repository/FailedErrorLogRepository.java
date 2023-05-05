package com.lic.epgs.fund.interestratelogcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.fund.interestratelogcontroller.model.FailedErrorLog;

@Repository
public interface FailedErrorLogRepository extends JpaRepository<FailedErrorLog, Long> {
	
	// Method to get all failed error logs ordered by ID in ascending order
	List<FailedErrorLog> findAllByOrderByIdAsc();
	
}