Answer:

package com.lic.epgs.surrender.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lic.epgs.surrender.model.CommonResponseDto;

public interface InProgressCriteriaSearch_PolicySurrenderRepository extends JpaRepository<CommonResponseDto, Long> {

	@Query("SELECT t FROM CommonResponseDto t WHERE t.policyNo = :policyNo OR t.mphCode = :mphCode OR t.mphName = :mphName OR t.surrenderStatus = :surrenderStatus OR t.product = :product OR t.unitCode = :unitCode OR t.role = :role OR (t.createdOn BETWEEN :fromDate AND :toDate) ORDER BY t.createdOn DESC")
    public CommonResponseDto searchInProgressPolicySurrenders(@Param("policyNo") String policyNo, @Param("mphCode") String mphCode, @Param("mphName") String mphName, @Param("surrenderStatus") String surrenderStatus, @Param("product") String product, @Param("unitCode") String unitCode, @Param("role") String role, @Param("fromDate") String fromDate, @Param("toDate") String toDate, @Param("pageCount") Integer pageCount, @Param("limit") Integer limit);

}