@Repository
public interface MemberDebitPolicyInterestRateFundControllerRepository {
    public ResponseEntity<Member> debitPolicyMemberAccount(String policyNo, String memberId) throws ApplicationException;
}