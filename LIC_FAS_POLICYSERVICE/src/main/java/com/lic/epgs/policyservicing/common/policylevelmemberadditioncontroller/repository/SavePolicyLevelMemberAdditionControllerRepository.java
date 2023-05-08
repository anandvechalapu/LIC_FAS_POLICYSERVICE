@Repository
public interface SavePolicyLevelMemberAdditionControllerRepository {

    void savePolicyServiceMemberDetails(String personalDetails, String addressDetails, String bankDetails,
                                       String nomineeDetails, String appointeeDetails);

    void savePolicyServiceMemberDetailsAsDraft(String personalDetails, String addressDetails, String bankDetails,
                                              String nomineeDetails, String appointeeDetails, String memberAdditionID);

    void savePolicyServiceMemberDetailsAsActive(String personalDetails, String addressDetails, String bankDetails,
                                               String nomineeDetails, String appointeeDetails, String memberAdditionID);

    void modifyAndUpdatePolicyServiceMemberDetails(String personalDetails, String addressDetails, String bankDetails,
                                                   String nomineeDetails, String appointeeDetails, String memberAdditionID);

    void saveUpdatedPolicyServiceMemberDetails();

    void viewUpdatedPolicyServiceMemberDetails();

    void handleErrorsAndExceptions();

    void securePolicyServiceMemberDetails();
}