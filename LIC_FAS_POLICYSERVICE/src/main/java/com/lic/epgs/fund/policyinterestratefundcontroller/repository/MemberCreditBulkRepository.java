@Repository
public interface MemberCreditBulkRepository {
 
    public ResponseEntity<Object> creditInterestForMultiplePolicyMembers(String policyNo, List<String> memberIds);
    
}