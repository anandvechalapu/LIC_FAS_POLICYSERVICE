@Service
public class PolicyCriteriaSearchPolicyLevelConversionControllerService {

    private final PolicyCriteriaSearchPolicyLevelConversionControllerRepository policyCriteriaSearchPolicyLevelConversionControllerRepository;

    public PolicyCriteriaSearchPolicyLevelConversionControllerService(PolicyCriteriaSearchPolicyLevelConversionControllerRepository policyCriteriaSearchPolicyLevelConversionControllerRepository) {
        this.policyCriteriaSearchPolicyLevelConversionControllerRepository = policyCriteriaSearchPolicyLevelConversionControllerRepository;
    }

    // Fetch policy details based on policy number
    public Optional<PolicyCriteriaSearchPolicyLevelConversionController> findByPolicyNo(String policyNo) {
        return policyCriteriaSearchPolicyLevelConversionControllerRepository.findByPolicyNo(policyNo);
    }

    // Handle and log exceptions
    public PolicyCriteriaSearchPolicyLevelConversionController save(PolicyCriteriaSearchPolicyLevelConversionController entity) throws RuntimeException {
        try {
            return policyCriteriaSearchPolicyLevelConversionControllerRepository.save(entity);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to save Policy Criteria Search Policy Level Conversion Controller", e);
        }
    }
}