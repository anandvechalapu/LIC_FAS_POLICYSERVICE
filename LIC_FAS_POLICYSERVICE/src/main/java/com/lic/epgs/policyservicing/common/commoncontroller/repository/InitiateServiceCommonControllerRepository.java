@Repository
public interface InitiateServiceCommonControllerRepository extends JpaRepository<PolicyServiceDto, Long> {

    PolicyServiceCommonResponseDto startService(PolicyServiceDto policyServiceDto, String serviceType);

}