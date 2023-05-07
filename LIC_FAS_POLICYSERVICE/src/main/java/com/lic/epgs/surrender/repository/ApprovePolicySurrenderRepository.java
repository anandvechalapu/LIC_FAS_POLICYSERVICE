package com.lic.epgs.surrender.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.lic.epgs.surrender.model.PolicySurrenderTemporary;
import com.lic.epgs.surrender.model.PolicySurrenderEntity;

public interface ApprovePolicySurrenderRepository extends JpaRepository<PolicySurrenderTemporary, Long> {

	@Transactional
	@Modifying
	@Query("UPDATE PolicySurrenderTemporary SET surrenderStatus = :surrenderStatus, modifiedBy = :modifiedBy, modifiedOn = :modifiedOn WHERE surrenderId = :surrenderId")
	int updateSurrenderStatus(@Param("surrenderStatus") String surrenderStatus, @Param("modifiedBy") String modifiedBy,
			@Param("modifiedOn") String modifiedOn, @Param("surrenderId") String surrenderId);

	@Transactional
	@Modifying
	@Query("INSERT INTO PolicySurrenderEntity (surrenderId, isActive, notes, docs, surrenderPayouts) VALUES (:surrenderId, :isActive, :notes, :docs, :surrenderPayouts)")
	int insertToPolicySurrenderEntity(@Param("surrenderId") String surrenderId, @Param("isActive") boolean isActive,
			@Param("notes") String notes, @Param("docs") String docs, @Param("surrenderPayouts") String surrenderPayouts);

	@Transactional
	@Modifying
	@Query("INSERT INTO PolicySurrenderPayoutEntity (payoutId, surrenderId) VALUES (:payoutId, :surrenderId)")
	int insertToPolicySurrenderPayoutEntity(@Param("payoutId") String payoutId, @Param("surrenderId") String surrenderId);

	@Transactional
	@Modifying
	@Query("INSERT INTO CommonDocsEntity (docId, surrenderId) VALUES (:docId, :surrenderId)")
	int insertToCommonDocsEntity(@Param("docId") String docId, @Param("surrenderId") String surrenderId);

	@Transactional
	@Modifying
	@Query("INSERT INTO CommonNotesEntity (noteId, surrenderId) VALUES (:noteId, :surrenderId)")
	int insertToCommonNotesEntity(@Param("noteId") String noteId, @Param("surrenderId") String surrenderId);

	@Transactional
	@Modifying
	@Query("UPDATE PolicyMasterEntity SET policyDetails = :policyDetails WHERE policyId = :policyId")
	int updatePolicyDetails(@Param("policyDetails") String policyDetails, @Param("policyId") String policyId);

	@Transactional
	@Modifying
	@Query("UPDATE MemberMasterEntity SET memberStatus = 'SURRENDERED' WHERE policyId = :policyId")
	int updateMemberStatus(@Param("policyId") String policyId);

	@Transactional
	@Modifying
	@Query("UPDATE MphMasterEntity SET mphStatus = 'SURRENDERED' WHERE policyId = :policyId")
	int updateMphStatus(@Param("policyId") String policyId);

	PolicySurrenderEntity findBySurrenderId(String surrenderId);

}