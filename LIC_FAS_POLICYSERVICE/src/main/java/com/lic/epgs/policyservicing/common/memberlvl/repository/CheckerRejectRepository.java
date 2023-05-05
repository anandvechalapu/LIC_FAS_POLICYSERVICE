@Repository
public interface CheckerRejectRepository {

    void rejectCommission(CommissionDto commissionDto, Long commissionId, String role);

    CommissionTemp getCommissionTempByCommissionId(Long commissionId);

    void saveRejectedCommissionToCommissionTable(Commission commission);

    List<CommissionQuestionDetails> getCommissionQuestionDetailsByCommissionId(Long commissionId);

    List<CommissionNotes> getCommissionNotesByCommissionId(Long commissionId);

}