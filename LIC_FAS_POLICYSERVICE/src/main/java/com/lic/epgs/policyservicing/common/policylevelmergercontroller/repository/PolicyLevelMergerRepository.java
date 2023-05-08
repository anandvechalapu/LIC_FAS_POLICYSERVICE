import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerDto;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyServiceNotesDto;

public interface PolicyLevelMergerRepository extends JpaRepository<PolicyLevelMergerDto, Long> {
	
	public PolicyLevelMergerDto getMasterPolicyMergebyMergeId(Long mergeId);
	
	public List<PolicyServiceNotesDto> getNotesByMergeIdAndIsActive(Long mergeId, boolean isActive);
	
}