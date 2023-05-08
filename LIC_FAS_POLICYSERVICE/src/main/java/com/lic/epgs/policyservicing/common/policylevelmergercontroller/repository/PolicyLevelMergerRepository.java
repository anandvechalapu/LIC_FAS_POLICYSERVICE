package com.lic.epgs.policyservicing.common.policylevelmergercontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.dto.PolicyLevelMergerSearchDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PolicyLevelMergerRepository extends JpaRepository<PolicyLevelMergerSearchDto, Long>, JpaSpecificationExecutor<PolicyLevelMergerSearchDto> {

    @Query("SELECT p FROM PolicyLevelMergerSearchDto p "
            + "WHERE (:policyNumber IS NULL OR p.policyNumber = :policyNumber) "
            + "AND (:product IS NULL OR p.product = :product) "
            + "AND (:lineOfBusiness IS NULL OR p.lineOfBusiness = :lineOfBusiness) "
            + "AND (:mergeStatus IS NULL OR p.mergeStatus = :mergeStatus) "
            + "AND (:unitCode IS NULL OR p.unitCode = :unitCode) "
            + "AND (:mphCode IS NULL OR p.mphCode = :mphCode) "
            + "AND (:mphName IS NULL OR p.mphName = :mphName) "
            + "ORDER BY p.modifiedDate DESC")
    PolicyLevelMergerApiResponse getCriteriaSearchPolicy(@Param("policyNumber") String policyNumber,
                                                        @Param("product") String product,
                                                        @Param("lineOfBusiness") String lineOfBusiness,
                                                        @Param("mergeStatus") String mergeStatus,
                                                        @Param("unitCode") String unitCode,
                                                        @Param("mphCode") String mphCode,
                                                        @Param("mphName") String mphName);
}