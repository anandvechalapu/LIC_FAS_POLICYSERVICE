@Repository
public interface FundInterestFundControllerRepository {

    /**
     * Retrieve the latest policy details for a given policy number
     *
     * @param policyNo The policy number
     * @return The latest policy details
     */
    @Query("SELECT * FROM policy WHERE policy_no = :policyNo ORDER BY policy_start DESC LIMIT 1")
    Optional<Policy> findLatestPolicyByPolicyNo(@Param("policyNo") String policyNo);

}