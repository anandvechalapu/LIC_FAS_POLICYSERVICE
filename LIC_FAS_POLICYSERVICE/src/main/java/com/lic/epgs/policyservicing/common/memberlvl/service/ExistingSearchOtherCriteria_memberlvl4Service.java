@Service
public class ExistingSearchOtherCriteria_memberlvl4Service {
    
    @Autowired 
    private ExistingSearchOtherCriteria_memberlvl4Repository existingSearchOtherCriteria_memberlvl4Repository;
    
    public ResponseDto findByCommissionSearchDto(CommissionSearchDto commissionSearchDto) {
        return existingSearchOtherCriteria_memberlvl4Repository.findByCommissionSearchDto(commissionSearchDto);
    }
    
    public boolean existsByCommissionSearchDto(CommissionSearchDto commissionSearchDto) {
        return existingSearchOtherCriteria_memberlvl4Repository.existsByCommissionSearchDto(commissionSearchDto);
    }

}