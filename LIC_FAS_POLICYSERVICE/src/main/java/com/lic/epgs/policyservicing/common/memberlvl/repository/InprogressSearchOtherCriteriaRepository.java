package com.lic.epgs.policyservicing.common.memberlvl.repository;

import com.lic.epgs.policyservicing.common.memberlvl.dto.CommonCommissionDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.CommissionSearchDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InprogressSearchOtherCriteriaRepository extends JpaRepository<CommonCommissionDto, Long> {

    @Query("SELECT c FROM CommonCommissionDto c WHERE c.role = :role AND c.searchCriteria = :searchCriteria")
    CommonCommissionDto inprogressSearchOtherCriteria(String role, CommissionSearchDto searchCriteria);

}