@Repository
public interface PolicyMemberviewLatestByMemberIdRepository {

    @Query("SELECT p FROM Policy p WHERE p.memberId = :memberId ORDER BY p.date DESC")
    Policy findLatestByMemberId(@Param("memberId") Long memberId);

    @Transactional
    @Modifying
    @Query("UPDATE Policy p SET p.date = :date WHERE p.memberId = :memberId")
    void updateLatestByMemberId(@Param("memberId") Long memberId, @Param("date") LocalDate date);

    @Transactional
    @Modifying
    @Query("DELETE FROM Policy p WHERE p.memberId = :memberId AND p.date = :date")
    void deleteLatestByMemberId(@Param("memberId") Long memberId, @Param("date") LocalDate date);

    @Transactional(readOnly = true)
    @Query("SELECT COUNT(1) FROM Policy p WHERE p.memberId = :memberId")
    Long countByMemberId(@Param("memberId") Long memberId);

}