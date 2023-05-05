@Repository
public interface MemberCreditPolicyInterestRateFundController4Repository {
 
    ResponseEntity<InterestRateResponse> creditPolicyMemberAccount(String policyNo, String memberId);

}