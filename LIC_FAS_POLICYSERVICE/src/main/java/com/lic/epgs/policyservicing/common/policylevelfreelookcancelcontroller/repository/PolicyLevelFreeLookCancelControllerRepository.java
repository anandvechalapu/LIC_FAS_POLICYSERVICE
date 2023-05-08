@Repository
public interface PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<FreeLookCancellationTempEntity, Long> {
    FreeLookCancellationResponseDto getFreeLookCancellationDetails(Long freeLookCancellationId);
}