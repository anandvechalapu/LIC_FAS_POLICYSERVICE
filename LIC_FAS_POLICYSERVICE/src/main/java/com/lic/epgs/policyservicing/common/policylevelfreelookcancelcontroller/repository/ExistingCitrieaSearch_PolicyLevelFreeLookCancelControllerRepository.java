@Repository
public interface ExistingCitrieaSearch_PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<FreeLookCancellationDto, Long> {
    
    List<FreeLookCancellationDto> findAllByPolicyNumberAndMphCodeAndMphNameAndFromAndToAndProductAndLineOfBusinessAndFreeLookStatusAndUnitCode(
        String policyNumber, String mphCode, String mphName, Date from, Date to, String product, String lineOfBusiness, String freeLookStatus, String unitCode);
    
    List<FreeLookCancellationDto> findAllByMphCodeAndMphNameAndFromAndToAndProductAndLineOfBusinessAndFreeLookStatusAndUnitCode(
        String mphCode, String mphName, Date from, Date to, String product, String lineOfBusiness, String freeLookStatus, String unitCode);
    
    List<FreeLookCancellationDto> findAllByPolicyNumberAndMphNameAndFromAndToAndProductAndLineOfBusinessAndFreeLookStatusAndUnitCode(
        String policyNumber, String mphName, Date from, Date to, String product, String lineOfBusiness, String freeLookStatus, String unitCode);
    
    List<FreeLookCancellationDto> findAllByPolicyNumberAndMphCodeAndFromAndToAndProductAndLineOfBusinessAndFreeLookStatusAndUnitCode(
        String policyNumber, String mphCode, Date from, Date to, String product, String lineOfBusiness, String freeLookStatus, String unitCode);
    
    List<FreeLookCancellationDto> findAllByPolicyNumberAndMphCodeAndMphNameAndToAndProductAndLineOfBusinessAndFreeLookStatusAndUnitCode(
        String policyNumber, String mphCode, String mphName, Date to, String product, String lineOfBusiness, String freeLookStatus, String unitCode);
    
    List<FreeLookCancellationDto> findAllByPolicyNumberAndMphCodeAndMphNameAndFromAndProductAndLineOfBusinessAndFreeLookStatusAndUnitCode(
        String policyNumber, String mphCode, String mphName, Date from, String product, String lineOfBusiness, String freeLookStatus, String unitCode);
    
    List<FreeLookCancellationDto> findAllByPolicyNumberAndMphCodeAndMphNameAndFromAndToAndLineOfBusinessAndFreeLookStatusAndUnitCode(
        String policyNumber, String mphCode, String mphName, Date from, Date to, String lineOfBusiness, String freeLookStatus, String unitCode);
    
    List<FreeLookCancellationDto> findAllByPolicyNumberAndMphCodeAndMphNameAndFromAndToAndProductAndFreeLookStatusAndUnitCode(
        String policyNumber, String mphCode, String mphName, Date from, Date to, String product, String freeLookStatus, String unitCode);
    
    List<FreeLookCancellationDto> findAllByPolicyNumberAndMphCodeAndMphNameAndFromAndToAndProductAndLineOfBusinessAndUnitCode(
        String policyNumber, String mphCode, String mphName, Date from, Date to, String product, String lineOfBusiness, String unitCode);
    
    List<FreeLookCancellationDto> findAllByPolicyNumberAndMphCodeAndMphNameAndFromAndToAndProductAndLineOfBusinessAndFreeLookStatus(
        String policyNumber, String mphCode, String mphName, Date from, Date to, String product, String lineOfBusiness, String freeLookStatus);
    
    List<FreeLookCancellationDto> findAllByFreeLookStatusNotIn(List<String> freeLookStatus);
}