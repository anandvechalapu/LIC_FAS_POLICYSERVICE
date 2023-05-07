@Entity
@Table(name = "policy_surrender")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@PackageName("com.lic.epgs.surrender.model")
public class PolicySurrender {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "surrender_id")
    private String surrenderId;
    
    @Column(name = "policy_name")
    private String policyName;
    
    @Column(name = "policy_number")
    private String policyNumber;
    
    @Column(name = "status")
    private String status;
    
    @Column(name = "amount")
    private double amount;
    
    @Column(name = "role_type")
    private String roleType;
    
    @Column(name = "page_name")
    private String pageName;
}

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@PackageName("com.lic.epgs.surrender.model")
public class PolicySurrenderDto {
    
    private String surrenderId;
    private String policyName;
    private String policyNumber;
    private String status;
    private double amount;
    private String roleType;
    private String pageName;
}

@Data
@PackageName("com.lic.epgs.surrender.model")
public class PolicySurrenderApiResponse {
    
    private List<PolicySurrenderDto> surrenders;
    private TransactionStatus status;
    private String message;
}

@Data
@PackageName("com.lic.epgs.surrender.model")
public enum TransactionStatus {
    SUCCESS,
    FAIL
}