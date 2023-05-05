@Repository
public interface FundInterestRateLogControllerRepository {

    // Gets the error log for a given policy number
    @GetMapping("/{policyNo}")
    public ResponseEntity<?> getErrorLogForPolicyNo(@PathVariable("policyNo") String policyNo);

    // Returns an array of error log objects associated with the given policy number
    @GetMapping("/{policyNo}")
    public ResponseEntity<?> getErrorLogsForPolicyNo(@PathVariable("policyNo") String policyNo);

    // Returns an empty array if no error log is associated with the given policy number
    @GetMapping("/{policyNo}")
    public ResponseEntity<?> getEmptyErrorLogsForPolicyNo(@PathVariable("policyNo") String policyNo);

    // Returns an error message with a status code of 500 if an exception occurs during the execution of the business logic
    @GetMapping("/{policyNo}")
    public ResponseEntity<?> getErrorMessageForPolicyNo(@PathVariable("policyNo") String policyNo);
}