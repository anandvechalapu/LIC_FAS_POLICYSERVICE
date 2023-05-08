package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.ExistingPolicy;

public interface GetExistingPolicyById_PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<ExistingPolicy, Long> {
    ExistingPolicy findByPolicyNumber(String policyNumber);
    ExistingPolicy findByMembersName(String name);
    ExistingPolicy findByAdjustmentsAdjustmentNumber(String adjustmentNumber);
    ExistingPolicy findByPolicyDispatchDate(String dispatchDate);
    ExistingPolicy findByPolicyRecievedDate(String recievedDate);
    ExistingPolicy findByTotalContribution(String totalContribution);
    ExistingPolicy findByTransactionMessage(String message);
    ExistingPolicy findByTransactionStatus(String status);

}