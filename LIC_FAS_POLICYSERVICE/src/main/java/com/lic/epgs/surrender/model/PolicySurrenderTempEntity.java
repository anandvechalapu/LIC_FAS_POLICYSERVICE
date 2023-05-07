Model/Entity

@Entity
@Table(name = "policy_surrender_temp")
public class PolicySurrenderTempEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column
    private String policyNo;
    
    @Column
    private double surrenderValue;
    
    @Column
    private double surrenderCharge;
    
    @Column
    private Date surrenderDate;
    
    // getters and setters
}

DTO

public class PolicySurrenderDto {
    private Long id;
    private String policyNo;
    private double surrenderValue;
    private double surrenderCharge;
    private Date surrenderDate;
    
    // getters and setters
}

Response

public class PolicySurrenderApiResponse {
    private TransactionStatus transactionStatus;
    private String transactionMessage;
    private PolicySurrenderDto surrenderDto;
    
    // getters and setters
}