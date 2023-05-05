@Repository
public interface GetAllExistingCommissionRepository {

    // Method to retrieve all existing commission details
    public ResponseEntity<CommissionDto> getAllExistingCommission(Integer commissionId);

    // Method to return error message with HTTP status code 400 (Bad Request)
    public ResponseEntity<String> getErrorMessageWithStatusCode400();

    // Method to return error message with HTTP status code 404 (Not Found)
    public ResponseEntity<String> getErrorMessageWithStatusCode404();

}