@Repository
public interface SendToCheckerMemberLvl17Repository extends JpaRepository<TransferInAndOutResponseDto, Long> {

    public TransferInAndOutResponseDto findByTransferIdAndStatus(long transferId, String status);

    public TransferInAndOutResponseDto save(TransferInAndOutResponseDto transferInAndOutResponseDto);

    public void logStartAndEndOfProcess();

    public void updateStatusForTransferOut(long transferId, String status);

    public void updateStatusForTransferIn(long transferId, String status);

}