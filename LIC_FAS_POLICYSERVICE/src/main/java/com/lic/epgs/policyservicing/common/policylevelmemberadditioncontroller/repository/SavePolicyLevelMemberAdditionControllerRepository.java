@Repository
public interface SavePolicyLevelMemberAdditionControllerRepository {

    // Method to save policy service member details
    public PolicyServiceMember save(PolicyServiceMember policyServiceMember);

    // Method to update policy service member details
    public PolicyServiceMember update(PolicyServiceMember policyServiceMember);

    // Method to check if component name is valid or not
    public boolean isValidComponentName(String componentName);

    // Method to set member addition status as Draft Status
    public void setDraftStatus();

    // Method to set member addition status as Active Status
    public void setActiveStatus();

}