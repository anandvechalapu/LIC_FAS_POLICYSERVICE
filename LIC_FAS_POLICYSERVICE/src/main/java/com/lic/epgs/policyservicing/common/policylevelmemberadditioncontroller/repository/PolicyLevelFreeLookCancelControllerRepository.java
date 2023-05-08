import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMemberAdditionDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.entity.PolicyServiceMemberEntity;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMbrDto;

public interface PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<PolicyServiceMemberAdditionDto, CommonResponseDto<Object>> {

    CommonResponseDto<Object> getAllMembers(Long memberAdditionId);
    
    List<PolicyServiceMbrDto> findByMemberAdditionId(Long memberAdditionId);
    
    List<PolicyServiceMemberEntity> findByActiveAddressAndActiveNominee(Boolean activeAddress, Boolean activeNominee);
}