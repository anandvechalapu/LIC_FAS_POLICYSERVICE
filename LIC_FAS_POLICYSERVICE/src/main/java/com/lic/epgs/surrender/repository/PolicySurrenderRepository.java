@Repository
public interface PolicySurrenderRepository {
 
    PolicySurrenderApiResponse getPolicySurrenderbySurrenderId(Long surrenderId);
}