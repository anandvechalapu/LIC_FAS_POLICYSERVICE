@Repository
public interface CommonStatusRepository extends JpaRepository<CommonStatus, Long> {
    
    // Returns a list of common statuses
    @Query("SELECT s FROM CommonStatus s")
    List<CommonStatus> findAllCommonStatuses();
    
    // Returns a single common status with the given code and type
    @Query("SELECT s FROM CommonStatus s WHERE s.code = :code AND s.type = :type")
    CommonStatus findCommonStatusByCodeAndType(@Param("code") String code, @Param("type") String type);
    
    // Returns a list of common statuses with the given type
    @Query("SELECT s FROM CommonStatus s WHERE s.type = :type")
    List<CommonStatus> findCommonStatusesByType(@Param("type") String type);
    
    // Returns a list of common statuses with the given isActive flag
    @Query("SELECT s FROM CommonStatus s WHERE s.isActive = :isActive")
    List<CommonStatus> findCommonStatusesByIsActive(@Param("isActive") boolean isActive);
    
    // Updates the isActive flag of the given common status
    @Modifying
    @Query("UPDATE CommonStatus s SET s.isActive = :isActive WHERE s.code = :code AND s.type = :type")
    void updateCommonStatusIsActive(@Param("isActive") boolean isActive, @Param("code") String code, @Param("type") String type);
    
    // Deletes the given common status
    @Modifying
    @Query("DELETE FROM CommonStatus s WHERE s.code = :code AND s.type = :type")
    void deleteCommonStatus(@Param("code") String code, @Param("type") String type);
}