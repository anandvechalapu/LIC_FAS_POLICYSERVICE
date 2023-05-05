package com.lic.epgs.fund.interestratelogcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.fund.interestratelogcontroller.model.ErrorLog;

@Repository
public interface ErrorLogRepository extends JpaRepository<ErrorLog, Long> {
	
	public ErrorLog findByRefNumber(String refNumber);
	
	public void deleteByRefNumber(String refNumber);

}