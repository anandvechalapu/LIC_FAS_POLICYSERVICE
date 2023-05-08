@Repository
public interface SavePolicyLevelMemberAdditionControllerRepository extends JpaRepository<SavePolicyLevelMemberAdditionController, Long>{

   SavePolicyLevelMemberAdditionController save(SavePolicyLevelMemberAdditionController savePolicyLevelMemberAdditionController);

   SavePolicyLevelMemberAdditionController saveAndFlush(SavePolicyLevelMemberAdditionController savePolicyLevelMemberAdditionController);

   void delete(SavePolicyLevelMemberAdditionController savePolicyLevelMemberAdditionController);

   boolean existsByComponentName(String componentName);

   SavePolicyLevelMemberAdditionController findByComponentName(String componentName);

   SavePolicyLevelMemberAdditionController findByMemberAdditionId(String memberAdditionId);

   void deleteByComponentName(String componentName);

   void deleteByMemberAdditionId(String memberAdditionId);

}