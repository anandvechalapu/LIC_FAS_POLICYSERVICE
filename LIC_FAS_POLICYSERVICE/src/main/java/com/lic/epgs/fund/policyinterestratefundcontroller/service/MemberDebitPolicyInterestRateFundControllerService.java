@Service
public class MemberDebitPolicyInterestRateFundControllerService {
    @Autowired
    private MemberDebitPolicyInterestRateFundControllerRepository repository;

    public ResponseEntity<Member> debitPolicyMemberAccount(String policyNo, String memberId) throws ApplicationException {
        return repository.debitPolicyMemberAccount(policyNo, memberId);
    }
}