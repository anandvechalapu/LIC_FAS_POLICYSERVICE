@Repository
public class InterestFundControllerRepository {
  
  public InterestRateResponseDto creditPolicyMembers(InterestFundDto interestFundDto) {
    InterestRateResponseDto responseDto = new InterestRateResponseDto();
    try {
      // Code to credit policy members
      responseDto.setStatus("SUCCESS");
    } catch (ApplicationException e) {
      // Logging
      responseDto.setStatus("ERROR");
    }
    return responseDto;
  } 
}