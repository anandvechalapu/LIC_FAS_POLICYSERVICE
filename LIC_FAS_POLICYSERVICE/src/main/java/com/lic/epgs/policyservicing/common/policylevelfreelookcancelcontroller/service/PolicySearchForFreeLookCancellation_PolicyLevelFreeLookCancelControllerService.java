@Service
public class PolicySearchForFreeLookCancellation_PolicyLevelFreeLookCancelControllerService {
    @Autowired
    private PolicySearchForFreeLookCancellation_PolicyLevelFreeLookCancelControllerRepository repository;

    /**
     * Retrieve policy details for free look cancellation.
     *
     * @param policyNumber The policy number.
     * @return The policy details for free look cancellation.
     */
    public Optional<PolicyDetails> findByPolicyNumber(String policyNumber) {
        return repository.findByPolicyNumber(policyNumber);
    }

    /**
     * Log the start and end of the process.
     *
     * @param startTime The start time.
     * @param endTime The end time.
     * @return True if the logging was successful, false otherwise.
     */
    public boolean logProcess(Date startTime, Date endTime) {
        return repository.logProcess(startTime, endTime);
    }
}