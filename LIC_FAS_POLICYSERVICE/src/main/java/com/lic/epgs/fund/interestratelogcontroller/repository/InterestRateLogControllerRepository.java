import org.springframework.data.jpa.repository.JpaRepository;

public interface InterestRateLogControllerRepository extends JpaRepository<InterestRateLog, Long> {
 
    List<InterestRateLog> findByIsFailTrueOrderByIdAsc();
 
    List<InterestRateLog> findByPolicyNoOrderByIdAsc(String policyNo);
 
    List<InterestRateLog> findByReferenceNoOrderByIdAsc(String referenceNo);
 
    List<InterestRateLog> findAllByOrderByIdAsc();
}