package com.lic.epgs.policyservicing.common.memberlvl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.memberlvl.model.CommissionDto;
import com.lic.epgs.policyservicing.common.memberlvl.repository.CommissionTempRepository;

@Service
public class CommissionTempService {

  @Autowired
  private CommissionTempRepository commissionTempRepository;

  /**
   * Method to approve the commission by the checker role.
   *
   * @param commissionId the ID of the commission to be approved
   * @param role the role of the checker user who is approving the commission
   * @return CommissionDto the CommissionDto object of the updated commission
   */
  public CommissionDto checkerApprove(int commissionId, String role) {
    return commissionTempRepository.checkerApprove(commissionId, role);
  }

}