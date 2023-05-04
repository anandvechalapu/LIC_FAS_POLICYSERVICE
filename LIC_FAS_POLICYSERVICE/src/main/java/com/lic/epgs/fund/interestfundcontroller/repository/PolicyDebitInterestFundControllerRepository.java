@Repository
public interface PolicyDebitInterestFundControllerRepository extends JpaRepository<DebitRequestDto, Long> {
	
	public InterestRateResponseDto debitPolicy(DebitRequestDto debitRequestDto);
	
	public void saveErrorDetails(InterestErrorDto errorData);
	
}