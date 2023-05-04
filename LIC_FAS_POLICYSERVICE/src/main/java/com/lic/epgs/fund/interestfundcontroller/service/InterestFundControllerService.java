@Service
public class InterestFundControllerService {

  @Autowired
  private InterestFundControllerRepository interestFundControllerRepository;

  public InterestRateResponseDto creditPolicyMembers(InterestFundDto interestFundDto) {
    return interestFundControllerRepository.creditPolicyMembers(interestFundDto);
  }

}