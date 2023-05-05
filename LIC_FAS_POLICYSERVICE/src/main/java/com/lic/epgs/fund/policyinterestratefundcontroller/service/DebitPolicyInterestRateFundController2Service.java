@Service
public class DebitPolicyInterestRateFundController2Service {
    
    @Autowired
    private DebitPolicyInterestRateFundController2Repository debitPolicyInterestRateFundController2Repository;
    
    public ResponseEntity<?> debitPolicy(String policyNo) {
        return debitPolicyInterestRateFundController2Repository.debitPolicy(policyNo);
    }
    
    public void logRequestAndPolicyNo(String policyNo) {
        debitPolicyInterestRateFundController2Repository.logRequestAndPolicyNo(policyNo);
    }
    
    public void logExceptionMessage(ApplicationException e) {
        debitPolicyInterestRateFundController2Repository.logExceptionMessage(e);
    }
    
    public void saveErrorDetails() {
        debitPolicyInterestRateFundController2Repository.saveErrorDetails();
    }
}