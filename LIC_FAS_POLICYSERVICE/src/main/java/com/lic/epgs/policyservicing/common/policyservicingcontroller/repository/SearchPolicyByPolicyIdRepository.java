@Repository
public interface SearchPolicyByPolicyIdRepository {

    List<PolicyDetails> searchPolicyByPolicyId(String policyId);

}