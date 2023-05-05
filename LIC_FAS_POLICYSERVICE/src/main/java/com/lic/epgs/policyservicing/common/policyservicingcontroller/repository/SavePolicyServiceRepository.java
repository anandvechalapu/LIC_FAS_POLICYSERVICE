import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.PolicyServiceModuleDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.model.PolicyServiceDto;

@Repository
public interface SavePolicyServiceRepository extends JpaRepository<PolicyServiceModuleDto, Long> {
    CommonResponseDto<PolicyServiceDto> savePolicyService(PolicyServiceModuleDto policyServiceModuleDto);
}