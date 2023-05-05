@Repository
public interface PolicyServicingCommonRepository extends JpaRepository<PolicyServiceEntity, Long> {
    Long getSequence();
	
	@Query("SELECT ps FROM PolicyServiceEntity ps WHERE ps.policyId = :policyId AND ps.serviceType = :serviceType")
    PolicyServiceEntity findByPolicyIdAndServiceType(@Param("policyId") String policyId, @Param("serviceType") String serviceType); 
}