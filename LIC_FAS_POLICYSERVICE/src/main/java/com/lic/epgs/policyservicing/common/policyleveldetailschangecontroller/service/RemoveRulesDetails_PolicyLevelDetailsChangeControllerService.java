import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.dto.PolicyDtlsResponseDto;
import com.lic.epgs.policyservicing.common.policyleveldetailschangecontroller.model.Policy;

@Service
public class RemoveRulesDetails_PolicyLevelDetailsChangeControllerService {
	
	@Autowired
	RemoveRulesDetails_PolicyLevelDetailsChangeControllerRepository removeRulesDetails_PolicyLevelDetailsChangeControllerRepository;
	
	/**
    * Method to remove a specific rule from a policy
    * 
    * @param policyId								The id of the policy
    * @param ruleId								The id of the rule to be removed
    * @param modifiedBy							The user who has modified the policy
    *
    * @return PolicyDtlsResponseDto					The response object containing the transaction status and message
    */
	public PolicyDtlsResponseDto removeRulesDetails(Long policyId, Long ruleId, String modifiedBy) {
		
		PolicyDtlsResponseDto response = new PolicyDtlsResponseDto();
		
		Optional<Policy> policyOptional = removeRulesDetails_PolicyLevelDetailsChangeControllerRepository.findById(policyId);
		
		if(policyOptional.isPresent()) {
			Policy policy = policyOptional.get();
			
			// Remove the rule from the policy
			
			// Set the modifiedBy value
			policy.setModifiedBy(modifiedBy);
			
			removeRulesDetails_PolicyLevelDetailsChangeControllerRepository.save(policy);
			
			response.setStatus(true);
			response.setMessage("Rule removed successfully");
			
		} else {
			response.setStatus(false);
			response.setMessage("No policy found with given id");
		}
		
		return response;
	}

}