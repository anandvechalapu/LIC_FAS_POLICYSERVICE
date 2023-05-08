import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyAomDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMemberAdditionDto;
import com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyServiceMbrDto;

public interface PolicyLevelMemberAdditionControllerRepository extends JpaRepository<CommonResponseDto<Object>, Long> {

	@Query("SELECT new com.lic.epgs.policyservicing.common.policylevelmemberadditioncontroller.dto.PolicyAomDto(p.POLICY_NUMBER, p.MPH_NAME, p.MPH_CODE, p.LINE_OF_BUSINESS, p.PRODUCT_ID, p.VARIANT, p.NO_OF_CATEGORY, mbr, madd) "
			+ "FROM PolicyAomDto p, PolicyServiceMbrDto mbr, PolicyServiceMemberAdditionDto madd "
			+ "WHERE p.POLICY_NUMBER = mbr.POLICY_NUMBER AND p.POLICY_NUMBER = madd.POLICY_NUMBER")
	public CommonResponseDto<Object> getAllPolicyLevelMemberAdditionController(PolicyServiceMemberAdditionDto policyServiceMemberAdditionDto);

	@Query("SELECT mbr FROM PolicyServiceMbrDto mbr")
	public List<PolicyServiceMbrDto> getMemberDetails();

	@Query("SELECT madd FROM PolicyServiceMemberAdditionDto madd")
	public List<PolicyServiceMemberAdditionDto> getMemberAdditionDetails();

	public List<String> getNotes();

}