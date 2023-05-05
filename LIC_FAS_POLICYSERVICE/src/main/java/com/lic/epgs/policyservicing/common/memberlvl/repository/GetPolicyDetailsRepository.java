import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.memberlvl.model.PolicyDetails;

@Repository
public interface GetPolicyDetailsRepository extends JpaRepository<PolicyDetails, Long> {
    
    Logger logger = LoggerFactory.getLogger(GetPolicyDetailsRepository.class);
    
    public default PolicyDetails getPolicyDetailsByMemberLvl(String policyNumber) {
        logger.info("Method getPolicyDetailsByMemberLvl execution started");
        PolicyDetails policyDetails = null;
        if (policyNumber == null || policyNumber.isEmpty()) {
            logger.error("Policy Number is Null");
            policyDetails.setTransactionStatus("FAIL");
            policyDetails.setTransactionMessage("Policy Number is Null");
        } else {
            policyDetails = findByPolicyNumber(policyNumber);
            if (policyDetails == null) {
                policyDetails.setTransactionStatus("FAIL");
                policyDetails.setTransactionMessage("NO_RECORD_FOUND");
            } else {
                policyDetails.setTransactionStatus("SUCCESS");
                policyDetails.setTransactionMessage("FETCH");
            }
        }
        logger.info("Method getPolicyDetailsByMemberLvl execution ended");
        return policyDetails;
    }
}