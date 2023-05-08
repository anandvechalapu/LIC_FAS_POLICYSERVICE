@Repository
public interface PolicyLevelMergerControllerRepository extends JpaRepository<PolicyServiceDocumentDto, Long> {

	Optional<PolicyServiceDocumentDto> findByDocumentId(Long documentId);
	
	@Modifying
	@Query("update PolicyServiceDocumentDto p set p.isActive = :isActive where p.documentId = :documentId")
	void updateIsActive(@Param("documentId") Long documentId, @Param("isActive") Boolean isActive);
	
	@Transactional
	@Modifying
	@Query("delete from PolicyServiceDocumentDto p where p.documentId = :documentId")
	void deleteByDocumentId(@Param("documentId") Long documentId);

}