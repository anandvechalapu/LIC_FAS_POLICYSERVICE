@Repository
public interface RemoveAppointeePolicyLevelFreeLookCancelControllerRepository extends JpaRepository<PolicyServiceMbrApponinteeDto, Long> {
 
    @Modifying
    @Query("UPDATE PolicyServiceMbrApponinteeDto SET active = 0 WHERE memberId = ?1 AND appointeeId = ?2")
    int removeAppointee(Long memberId, Long appointeeId);
    
    @Query("SELECT p FROM PolicyServiceMbrApponinteeDto p WHERE p.memberId = ?1 AND p.active = 1")
    List<PolicyServiceMbrApponinteeDto> getActiveAppointeesByMemberId(Long memberId);
}