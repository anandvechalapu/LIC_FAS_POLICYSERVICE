@Repository
public interface PolicyServicingCommonRepository {

    PolicyServiceCommonResponseDto getServiceDetailsByPolicyId(Long policyId);

}