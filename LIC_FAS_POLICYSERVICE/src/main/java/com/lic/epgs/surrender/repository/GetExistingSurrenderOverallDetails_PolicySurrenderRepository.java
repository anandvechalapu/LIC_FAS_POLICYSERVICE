@Repository
public interface GetExistingSurrenderOverallDetails_PolicySurrenderRepository extends JpaRepository<PolicySurrenderApiResponse, Long> {
    
    Optional<PolicySurrenderApiResponse> findBySurrenderId(Long surrenderId);
    
    @Transactional
    @Modifying
    @Query("SELECT p FROM PolicySurrenderApiResponse p WHERE p.surrenderId = :surrenderId")
    PolicySurrenderApiResponse getExistingSurrenderOverallDetails_PolicySurrender(@Param("surrenderId") Long surrenderId);
}