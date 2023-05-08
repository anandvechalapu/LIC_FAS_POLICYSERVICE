@Repository
public interface SaveBankDetails_PolicyLevelDetailsChangeControllerRepository extends JpaRepository<SaveBankDetails_PolicyLevelDetailsChangeController, Long> {

    // Method to save bank details associated with a policy 
    SaveBankDetails_PolicyLevelDetailsChangeController save(SaveBankDetails_PolicyLevelDetailsChangeController saveBankDetails_PolicyLevelDetailsChangeController);
    
    // Method to retrieve bank details associated with a policy
    SaveBankDetails_PolicyLevelDetailsChangeController findByMphBankId(Long mphBankId);
    
    // Method to update the bank details associated with a policy
    @Modifying
    @Transactional
    @Query("UPDATE SaveBankDetails_PolicyLevelDetailsChangeController SET isActive = true, isDefault = false WHERE mphBankId = :mphBankId")
    void updateBankDetails(@Param("mphBankId") Long mphBankId);
    
    // Method to log the starting and ending of the execution of the business logic in the controller and service methods
    @Query("INSERT INTO log_table (start_time, end_time) VALUES (:startTime, :endTime)")
    void logExecutionTime(@Param("startTime") Date startTime, @Param("endTime") Date endTime);
}