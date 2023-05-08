@Repository
public interface GetFreeLookCancellationById_PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<FreeLookCancellation, Long> {
    
    // Method to fetch existing FreeLookCancellation details from the database by its ID
    FreeLookCancellationResponseDto getExistingFreeLookCancellationById(Long freeLookId);
    
    // Method to return the FreeLookCancellationResponseDto object containing the details of the policy
    FreeLookCancellationResponseDto getFreeLookCancellationById(Long freeLookId);
    
    // Method to check if the policy exists in the database
    boolean existsByFreeLookId(Long freeLookId);
    
    // Method to return the FreeLookCancellation object by its ID
    FreeLookCancellation findByFreeLookId(Long freeLookId);
    
    // Method to return the FreeLookCancellation object by its policy number
    FreeLookCancellation findByPolicyNumber(String policyNumber);
    
    // Method to return the FreeLookCancellation object by its policy status
    FreeLookCancellation findByStatus(String status);
    
    // Method to return the list of FreeLookCancellation objects
    List<FreeLookCancellation> findAll();
    
    // Method to delete FreeLookCancellation object by its ID
    void deleteByFreeLookId(Long freeLookId);
}