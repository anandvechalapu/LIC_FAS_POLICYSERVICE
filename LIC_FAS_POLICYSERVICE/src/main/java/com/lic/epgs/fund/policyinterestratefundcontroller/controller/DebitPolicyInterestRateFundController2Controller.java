@RestController
@RequestMapping("/api/policy")
public class DebitPolicyInterestRateFundController2Controller {
    
    @Autowired
    private DebitPolicyInterestRateFundController2Service debitPolicyInterestRateFundController2Service;
    
    @PostMapping("/debit")
    public ResponseEntity<?> debitPolicy(@RequestParam String policyNo) {
        try {
            debitPolicyInterestRateFundController2Service.logRequestAndPolicyNo(policyNo);
            return debitPolicyInterestRateFundController2Service.debitPolicy(policyNo);
        } catch (ApplicationException e) {
            debitPolicyInterestRateFundController2Service.logExceptionMessage(e);
            debitPolicyInterestRateFundController2Service.saveErrorDetails();
            return new ResponseEntity<>(
                new DebitPolicyInterestRateFundController2Model(policyNo, null, e.getMessage()),
                HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}