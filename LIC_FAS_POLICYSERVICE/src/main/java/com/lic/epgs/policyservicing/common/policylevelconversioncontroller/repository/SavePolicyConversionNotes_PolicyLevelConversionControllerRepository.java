@Repository
public interface SavePolicyConversionNotes_PolicyLevelConversionControllerRepository extends JpaRepository<PolicyServiceNotesTempEntity, Long> {
    Optional<PolicyServiceNotesTempEntity> findByPolicyId(String policyId);
    PolicyServiceNotesTempEntity save(PolicyServiceNotesTempEntity policyServiceNotesTempEntity);
}