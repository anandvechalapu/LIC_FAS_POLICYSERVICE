@Repository
public interface PolicySearchForFreeLookCancellation_PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<PolicyDetails, Long> {
    /**
     * Retrieve policy details for free look cancellation.
     *
     * @param policyNumber The policy number.
     * @return The policy details for free look cancellation.
     */
    Optional<PolicyDetails> findByPolicyNumber(String policyNumber);

    /**
     * Log the start and end of the process.
     *
     * @param startTime The start time.
     * @param endTime The end time.
     * @return True if the logging was successful, false otherwise.
     */
    boolean logProcess(Date startTime, Date endTime);
}