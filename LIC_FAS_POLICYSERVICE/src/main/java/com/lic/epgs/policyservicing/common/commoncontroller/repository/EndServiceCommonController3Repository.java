@Repository
public interface EndServiceCommonController3Repository extends JpaRepository<PolicyService, Long> {
	
	@Query("SELECT ps FROM PolicyService ps WHERE ps.policyId = ?1 AND ps.serviceId = ?2")
	public PolicyService findByPolicyIdAndServiceId(Long policyId, Long serviceId);
	
	@Modifying
	@Query("UPDATE PolicyService ps SET ps.isUsing = false, ps.serviceStatus = 'Inactive' WHERE ps.policyId = ?1 AND ps.serviceId = ?2")
	public void endService(Long policyId, Long serviceId);
	
}