@Repository
public interface PolicyServicingCommonRepository extends JpaRepository<ServiceDetails, Long> {

    ServiceDetails findById(Long serviceId);

}