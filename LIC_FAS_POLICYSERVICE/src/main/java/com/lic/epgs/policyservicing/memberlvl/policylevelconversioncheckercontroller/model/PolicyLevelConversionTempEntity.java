@Entity
@Table(name = "policy_level_conversion_temp")
public class PolicyLevelConversionTempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long conversionId;

    private Long prevPolicyId;

    private String conversionStatus;

    private String conversionWorkflowStatus;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_on")
    private Date modifiedOn;

}