import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesTempEntity;

@Repository
public interface PolicyLevelMergerControllerRepository extends JpaRepository<PolicyServiceNotesTempEntity, Integer> {
	
	// Method to save the PolicyServiceNotesDto object to the database as PolicyServiceNotesTempEntity with isActive set to true.
	public PolicyServiceNotesTempEntity saveNotedPolicyMeger(PolicyServiceNotesDto policyServiceNotesDto);
	
	// Method to validate that the mergeId is not null or equal to 0.
	public PolicyLevelMergerApiResponse validateMergeId(int mergeId);
	
	// Method to check if there exists a policy level merger with the given mergeId and isActive true.
	public PolicyLevelMergerApiResponse checkMergeIdExists(int mergeId);
}