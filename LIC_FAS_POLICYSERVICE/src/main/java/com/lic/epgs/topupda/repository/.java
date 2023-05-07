import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class InprogressCriteriaLoadTopupdaRepository {

    private static final Logger logger = LoggerFactory.getLogger(InprogressCriteriaLoadTopupdaRepository.class);

    public TopupdaApiResponseDto getRequestsByCriteria(String role, String unitCode, String quotationNumber) {
        logger.info("Starting method to get requests by criteria");

        // Get requests from the database based on the given criteria
        // Create a TopupdaApiResponseDto object to store the results
        TopupdaApiResponseDto responseDto = new TopupdaApiResponseDto();
        responseDto.setTransactionMessage("FETCH");
        responseDto.setTransactionStatus("STATUS");

        try {
            if (role.equals("maker")) {
                List<TopupdaDto> requests = getRequestsInDraftOrPendingForModificationStatus(unitCode, quotationNumber);
                responseDto.setRequests(requests);
            } else if (role.equals("checker")) {
                List<TopupdaDto> requests = getRequestsInPendingForApproverStatus(unitCode, quotationNumber);
                responseDto.setRequests(requests);
            }
        } catch (Exception e) {
            logger.error("Error while getting requests by criteria", e);
            responseDto.setTransactionMessage("ERROR");
            responseDto.setTransactionStatus("FAIL");
        }

        logger.info("Ending method to get requests by criteria");
        return responseDto;
    }

    private List<TopupdaDto> getRequestsInDraftOrPendingForModificationStatus(String unitCode, String quotationNumber) {
        // Get requests from the database in draft or pending for modification status
        // based on the given unitCode and quotationNumber
    }

    private List<TopupdaDto> getRequestsInPendingForApproverStatus(String unitCode, String quotationNumber) {
        // Get requests from the database in pending for approver status
        // based on the given unitCode and quotationNumber
    }
}