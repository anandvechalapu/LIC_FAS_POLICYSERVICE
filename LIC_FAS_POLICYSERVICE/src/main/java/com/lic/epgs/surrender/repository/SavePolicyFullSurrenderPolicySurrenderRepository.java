@Repository
public interface SavePolicyFullSurrenderPolicySurrenderRepository extends JpaRepository<SavePolicyFullSurrenderPolicySurrender, Long> {
	
	SavePolicyFullSurrenderPolicySurrender save(SavePolicyFullSurrenderPolicySurrender savePolicyFullSurrenderPolicySurrender);
	
	Optional<SavePolicyFullSurrenderPolicySurrender> findById(Long id);
	
	void deleteById(Long id);
	
	@Query("SELECT p.mphCode, p.mphName from PolicyMaster p WHERE p.mphCode = :mphCode") 
	List<Object[]> findMphCodeAndMphNameByMphCode(@Param("mphCode") String mphCode);
	
}