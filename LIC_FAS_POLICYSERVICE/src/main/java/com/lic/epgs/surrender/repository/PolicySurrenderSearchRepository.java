@Repository
public interface PolicySurrenderSearchRepository extends JpaRepository<PolicySurrenderSearchDto, Long> {
    List<PolicySurrenderSearchDto> findByPolicyNo(String policyNo);
    List<PolicySurrenderSearchDto> findByMphCode(String mphCode);
    List<PolicySurrenderSearchDto> findByMphNameContainingIgnoreCase(String mphName);
    List<PolicySurrenderSearchDto> findBySurrenderStatus(String surrenderStatus);
    List<PolicySurrenderSearchDto> findByProduct(String product);
    List<PolicySurrenderSearchDto> findByUnitCode(String unitCode);
    List<PolicySurrenderSearchDto> findByCreatedOnBetween(Date fromDate, Date toDate);
    List<PolicySurrenderSearchDto> findByPageCount(int pageCount);
    List<PolicySurrenderSearchDto> findByLimit(int limit);
}