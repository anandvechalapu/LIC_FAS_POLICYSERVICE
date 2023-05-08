import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.policyservicing.common.policylevelconversioncontroller.model.Document;

public interface PolicyLevelConversionControllerRepository extends JpaRepository<Document, Long>{

    public List<Document> getDocumentList(Long conversionId);

}