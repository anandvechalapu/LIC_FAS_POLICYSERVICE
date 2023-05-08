@Repository
public interface PolicyCriteriaSearchPolicyLevelConversionControllerRepository extends CrudRepository<PolicyCriteriaSearchPolicyLevelConversionController, Long> {

    // Fetch policy details based on policy number
    @Query("SELECT p FROM PolicyCriteriaSearchPolicyLevelConversionController p WHERE p.policyNo = :policyNo")
    Optional<PolicyCriteriaSearchPolicyLevelConversionController> findByPolicyNo(String policyNo);

    // Handle and log exceptions
    @Override
    @Transactional
    <S extends PolicyCriteriaSearchPolicyLevelConversionController> S save(S entity) throws RuntimeException;

}