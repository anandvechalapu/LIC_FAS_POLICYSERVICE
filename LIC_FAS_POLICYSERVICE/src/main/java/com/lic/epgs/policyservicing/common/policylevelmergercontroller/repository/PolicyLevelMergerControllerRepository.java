import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerApiResponse;
import com.lic.epgs.policyservicing.common.policylevelmergercontroller.model.PolicyLevelMergerTempEntity;

@Repository
public interface PolicyLevelMergerControllerRepository extends JpaRepository<PolicyLevelMergerTempEntity, Long> {

	PolicyLevelMergerApiResponse getPolicyMergebyMergeId(Long mergeId);

}