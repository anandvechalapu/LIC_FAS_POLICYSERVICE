@Repository
public class RemoveAppointeePolicyLevelFreeLookCancelControllerRepository {

    @Autowired
    private EntityManager entityManager;

    public int removeAppointee(Long memberId, Long appointeeId) {
        Query query = entityManager.createQuery("Update PolicyServiceMbrApponinteeDto set active=:active where memberId=:memberId and appointeeId=:appointeeId");
        query.setParameter("active", 0);
        query.setParameter("memberId", memberId);
        query.setParameter("appointeeId", appointeeId);
        return query.executeUpdate();
    }
    
    public List<PolicyServiceMbrApponinteeDto> getActiveAppointeesByMemberId(Long memberId) {
        Query query = entityManager.createQuery("Select p from PolicyServiceMbrApponinteeDto p where p.memberId = :memberId and p.active = :active");
        query.setParameter("memberId", memberId);
        query.setParameter("active", 1);
        return query.getResultList();
    }
}

@RestController
@RequestMapping("/policy-level-member-addition-controller")
public class PolicyLevelMemberAdditionController {
    
    @Autowired
    private RemoveAppointeePolicyLevelFreeLookCancelControllerService removeAppointeePolicyLevelFreeLookCancelControllerService;

    @DeleteMapping("/remove-appointee")
    public int removeAppointee(@RequestParam(name = "memberId") Long memberId, @RequestParam(name = "appointeeId") Long appointeeId) {
        return removeAppointeePolicyLevelFreeLookCancelControllerService.removeAppointee(memberId, appointeeId);
    }
    
    @GetMapping("/appointees")
    public List<PolicyServiceMbrApponinteeDto> getActiveAppointeesByMemberId(@RequestParam(name = "memberId") Long memberId) {
        return removeAppointeePolicyLevelFreeLookCancelControllerService.getActiveAppointeesByMemberId(memberId);
    }
}