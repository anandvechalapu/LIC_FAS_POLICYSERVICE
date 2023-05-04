@Repository
public interface PolicyServiceProcessControllerRepository {
	
	public CommonResponseDto processPolicy(PolicyServiceProcessDto policyServiceProcessDto);

	public PolicyContributionDto getPolicyContribution(String policyId);

	public void logProcessStartAndEnd();

	public void validateStatusRequest(PolicyServicingObjectMappingUtils policyServicingObjectMappingUtils);

	public PolicyContributionDto copyProperties(PolicyContributionEntity policyContributionEntity);

}