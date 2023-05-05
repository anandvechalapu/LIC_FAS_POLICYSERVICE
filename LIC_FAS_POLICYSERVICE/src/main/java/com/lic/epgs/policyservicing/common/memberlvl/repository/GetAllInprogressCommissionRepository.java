@Repository
public interface GetAllInprogressCommissionRepository extends JpaRepository<CommonCommissionDto, Long> {
    
    @Query("SELECT ccd FROM CommonCommissionDto ccd WHERE ccd.commissionId = :commissionId AND ccd.commissionStatus = 'inprogress'")
    CommonCommissionDto getAllInprogressCommission(@Param("commissionId") String commissionId);
    
    @Query("SELECT ccd FROM CommonCommissionDto ccd WHERE ccd.unitCode = :unitCode AND ccd.commissionStatus = 'inprogress'")
    List<CommonCommissionDto> getInProgressLoad(@Param("unitCode") String unitCode);
    
    @Query("SELECT ccd FROM CommissionDetailsDto ccd WHERE ccd.commissionId = :commissionId")
    CommissionDetailsDto getCommissionDetailsByCommissionId(@Param("commissionId") String commissionId);
    
    @Query("SELECT ccd FROM CommissionDetailsDto ccd WHERE ccd.tempCommissionId = :tempCommissionId")
    CommissionDetailsDto getCommissionDetailsByTempCommissionId(@Param("tempCommissionId") String tempCommissionId);
    
    @Query("SELECT cqd FROM CommissionQuestionDetailsDto cqd WHERE cqd.commissionId = :commissionId")
    List<CommissionQuestionDetailsDto> getCommissionQuestionsByCommissionId(@Param("commissionId") String commissionId);
    
    @Query("SELECT cnd FROM CommissionNotesDto cnd WHERE cnd.commissionId = :commissionId")
    List<CommissionNotesDto> getCommissionNotesByCommissionId(@Param("commissionId") String commissionId);

}