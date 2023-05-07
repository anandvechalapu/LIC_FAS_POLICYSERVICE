@Repository
public interface InprogressSurrenderPolicyRepository {

    /**
     * Finds all the in-progress or existing policy surrenders based on the role type.
     *
     * @param roleType The role type for which the policy surrenders should be retrieved.
     * @return List of policy surrenders in DTO format.
     */
    List<PolicySurrenderDTO> findByRoleType(String roleType);
    
    /**
     * Checks if there are any policy surrenders matching the roleType and pageName.
     *
     * @param roleType The role type for which the policy surrenders should be checked.
     * @param pageName The page name for which the policy surrenders should be checked.
     * @return True if any policy surrenders are found, false otherwise.
     */
    boolean existsByRoleTypeAndPageName(String roleType, String pageName);
}