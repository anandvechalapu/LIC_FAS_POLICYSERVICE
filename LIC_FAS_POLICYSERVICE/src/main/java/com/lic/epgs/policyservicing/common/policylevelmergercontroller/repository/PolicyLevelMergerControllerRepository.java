@Repository
public interface PolicyLevelMergerControllerRepository extends JpaRepository<PolicyServiceDocumentDto, Long> {

    PolicyServiceDocumentDto save(PolicyServiceDocumentDto policyServiceDocumentDto);
    
    boolean existsByDocumentName(String documentName);
    
    @Transactional
    @Modifying
    @Query("UPDATE PolicyServiceDocumentDto SET isActive = true WHERE documentName = :documentName")
    void setActive(@Param("documentName") String documentName);

}