@Repository
public interface SaveNotedPolicyMeger_PolicyLevelMergerControllerRepository extends JpaRepository<PolicyServiceNotesTempEntity, Long> {

    /**
     * This method will save noted policy merger information.
     *
     * @param policyServiceNotesDto the PolicyServiceNotesDto object containing the
     *                             policy service notes information.
     * @param mergeId              the mergeId of the policy level merger.
     * @return the PolicyServiceNotesDto object containing the saved
     * policy service notes information.
     */
    @Transactional
    PolicyServiceNotesDto saveNotedPolicyMeger(PolicyServiceNotesDto policyServiceNotesDto, Long mergeId);

}