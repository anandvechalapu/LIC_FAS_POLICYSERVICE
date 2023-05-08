@Repository
public interface GetInprogressOverallDetails_PolicyLevelConversionControllerRepository extends JpaRepository<PolicyLevelConversionTempEntity, Long> {
    
    @Query("SELECT plcTemp FROM PolicyLevelConversionTempEntity plcTemp WHERE plcTemp.serviceId = :serviceId")
    Optional<PolicyLevelConversionTempEntity> getInprogressOverallDetails(@Param("serviceId") Long serviceId);
}