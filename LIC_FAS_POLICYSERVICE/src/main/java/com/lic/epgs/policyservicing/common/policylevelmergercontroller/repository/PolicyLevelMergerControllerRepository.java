@Repository
public interface PolicyLevelMergerControllerRepository { 
 
    /**
     * Saves or updates the policy level merger details.
     *
     * @param policyLevelMergerDto the policy level merger details
     * @return the PolicyLevelMergerApiResponse object
     */
    PolicyLevelMergerApiResponse saveAndUpdatePolicyLevelMerger(PolicyLevelMergerDto policyLevelMergerDto);

    /**
     * Validates the policy numbers and types.
     *
     * @param policyNumber the policy number
     * @param policyType the policy type
     * @return true if valid, false otherwise
     */
    boolean validPolicyNumberAndType(String policyNumber, String policyType);

}