@Repository
public interface SavePayoutDetailsRepository extends JpaRepository<PolicySurrenderPayOutTempEntity, Long>{
 
    PolicySurrenderPayOutTempEntity save(PolicySurrenderPayOutDto policySurrenderPayOutDto);
 
    List<PolicySurrenderPayOutTempEntity> findAllByIsActive(boolean isActive);
 
    PolicySurrenderPayOutTempEntity findByCreatedByAndModifiedBy(String createdBy, String modifiedBy);
 
    void deleteById(Long id);
 
    void deleteByCreatedByAndModifiedBy(String createdBy, String modifiedBy);
 
    void deleteByIsActive(boolean isActive);
}