import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.dto.PolicyDtlsResponseDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.Policy;

public interface RemoveRulesDetails_PolicyLevelDetailsChangeControllerRepository extends JpaRepository<Policy, Long>  {
    
    /**
    * Method to remove a specific rule from a policy
    * 
    * @param policyId								The id of the policy
    * @param ruleId								The id of the rule to be removed
    * @param modifiedBy							The user who has modified the policy
    *
    * @return PolicyDtlsResponseDto					The response object containing the transaction status and message
    */
    public PolicyDtlsResponseDto removeRulesDetails(Long policyId, Long ruleId, String modifiedBy);
}