@Repository
public interface InprogressSearchOtherCriteriaRepository extends JpaRepository<CommonCommissionDto, Long> {

    @Query("SELECT c FROM CommonCommissionDto c WHERE c.role = :role AND c.searchParams = :searchParams")
    ResponseEntity<CommonCommissionDto> findBySearchParamsAndRole(@Param("role") String role, @Param("searchParams") CommissionSearchDto searchParams);
}