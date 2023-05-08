@Repository
public interface ApprovedAndRejectPolicyLevelMerger_PolicyLevelMergerControllerRepository extends JpaRepository<PolicyLevelMergerTempEntity, Long> {

    List<PolicyLevelMergerTempEntity> findByMergeIdAndMergeStatus(Long mergeId, Integer mergeStatus);
    
    List<PolicyMasterEntity> findByMergeIdAndMergeStatus(Long mergeId, Integer mergeStatus);
    
    List<MemberMasterEntity> findByMergeIdAndMergeStatus(Long mergeId, Integer mergeStatus);
    
    void save(PolicyMasterEntity policyMasterEntity);
    
    void save(PolicyServiceDocumentEntity policyServiceDocumentEntity);
    
    void save(PolicyServiceNotesEntity policyServiceNotesEntity);
    
    List<PolicyLevelMergerApiResponse> findByMergeIdAndMergeStatusAndWorkflowStatus(Long mergeId, Integer mergeStatus, String workflowStatus);
    
}