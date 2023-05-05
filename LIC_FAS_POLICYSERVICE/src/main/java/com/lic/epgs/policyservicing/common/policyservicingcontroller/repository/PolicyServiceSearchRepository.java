import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.CommonResponseDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicySearchDto;
import com.lic.epgs.policyservicing.common.policyservicingcontroller.dto.PolicyServiceDto;

public interface PolicyServiceSearchRepository  extends JpaRepository<PolicySearchDto, Long>{
    CommonResponseDto searchForPolicyServices(PolicySearchDto searchDto);
    CommonResponseDto getPolicyServicesByPageNumber(PolicySearchDto searchDto);
    CommonResponseDto getPolicyServicesByPageSize(PolicySearchDto searchDto);
    CommonResponseDto getPolicyServicesByStartDate(PolicySearchDto searchDto);
    CommonResponseDto getPolicyServicesByEndDate(PolicySearchDto searchDto);
    CommonResponseDto getPolicyServicesByServiceType(PolicySearchDto searchDto);
    List<PolicyServiceDto> findByPolicyNumber(String policyNumber);
    List<PolicyServiceDto> findBySearchCriteria(String page);
}