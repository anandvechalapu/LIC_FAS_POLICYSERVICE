@Repository
public interface SavePolicyLevelMemberAdditionControllerRepository {

  // Save policy service member details
  public void savePolicyServiceMemberDetails(Map<String, Object> policyServiceMemberDetails);

  // Update policy service member details
  public void updatePolicyServiceMemberDetails(Map<String, Object> policyServiceMemberDetails);

  // Save policy service member details as draft
  public void savePolicyServiceMemberDetailsAsDraft(Map<String, Object> policyServiceMemberDetails);

  // Save policy service member details as active
  public void savePolicyServiceMemberDetailsAsActive(Map<String, Object> policyServiceMemberDetails);

  // Set member addition status as Draft Status
  public void setMemberAdditionStatusAsDraftStatus(String memberAdditionId);

  // Set member addition status as Active Status
  public void setMemberAdditionStatusAsActiveStatus(String memberAdditionId);

  // Get updated policy service member details
  public Map<String, Object> getUpdatedPolicyServiceMemberDetails(String memberAdditionId);

  // Handle exceptions gracefully
  public void handleExceptionsGracefully();

  // Secure policy service member details
  public void securePolicyServiceMemberDetails();

}