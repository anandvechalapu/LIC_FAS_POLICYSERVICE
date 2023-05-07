@Repository
public interface RejectPolicySurrender_PolicySurrenderRepository extends JpaRepository<RejectPolicySurrender_PolicySurrender, Long> {
    RejectPolicySurrender_PolicySurrender findBySurrenderStatus(String status);
    RejectPolicySurrender_PolicySurrender save(RejectPolicySurrender_PolicySurrender policySurrender);
    RejectPolicySurrender_PolicySurrender update(RejectPolicySurrender_PolicySurrender policySurrender);
    RejectPolicySurrender_PolicySurrender create(RejectPolicySurrender_PolicySurrender policySurrender);
    RejectPolicySurrender_PolicySurrender copy(RejectPolicySurrender_PolicySurrender policySurrender);
    List<RejectPolicySurrender_PolicySurrender> findAll();
}