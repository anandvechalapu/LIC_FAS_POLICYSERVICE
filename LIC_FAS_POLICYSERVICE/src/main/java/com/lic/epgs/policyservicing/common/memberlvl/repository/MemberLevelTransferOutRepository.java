package com.lic.epgs.policyservicing.common.memberlvl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.memberlvl.model.TransferInAndOutResponseDto;

/**
 * This is the repository for the MemberLevelTransferOutController for getting transfer-in and transfer-out details
 */
public interface MemberLevelTransferOutRepository extends JpaRepository<TransferInAndOutResponseDto, Long> {
 
  /**
   * This method is used to get the transfer-in and transfer-out details for the given policy and member
   * @param pageName pageName should be equal to transfer-search
   * @param policyId policyId should not be null
   * @param licId licId should not be null
   * @return TransferInAndOutResponseDto
   */
  TransferInAndOutResponseDto getOverallDetails(String pageName, Integer policyId, Integer licId);

}