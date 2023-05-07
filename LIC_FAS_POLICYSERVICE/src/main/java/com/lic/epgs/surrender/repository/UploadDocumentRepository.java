@Repository
public interface UploadDocumentRepository extends JpaRepository<CommonDocsTempEntity, Long> {
    CommonDocsTempEntity save(CommonDocsTempEntity commonDocsTempEntity);
    CommonDocsTempEntity findById(Long id);
    CommonDocsTempEntity findByIsActiveTrue();
    void deleteById(Long id);
}