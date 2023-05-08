@Entity
@Table(name = "PolicyLevelMerger_temp")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PolicyLevelMergerTempEntity extends AbstractEntityAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "merge_id")
    private Long mergeId;

    @Column(name = "merge_status")
    private Integer mergeStatus;

    @Column(name = "workflow_status")
    private String workflowStatus;

}

@Entity
@Table(name = "Policy_Master")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PolicyMasterEntity extends AbstractEntityAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "policy_id")
    private String policyId;

    @Column(name = "policy_name")
    private String policyName;

    @Column(name = "merge_id")
    private Long mergeId;

    @Column(name = "merge_status")
    private Integer mergeStatus;

}

@Entity
@Table(name = "Member_Master")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MemberMasterEntity extends AbstractEntityAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "merge_id")
    private Long mergeId;

    @Column(name = "merge_status")
    private Integer mergeStatus;

}

@Entity
@Table(name = "Policy_Service_Document")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "updatedAt" }, allowGetters = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PolicyServiceDocumentEntity extends AbstractEntityAudit implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "policy_document_name")
    private String policyDocumentName;

    @Column(name = "policy_document_body")
    private String policyDocumentBody;

    @Column(name = "merge_id")
    private Long mergeId;

}

@Entity
@Table(name = "Policy_Service_Notes")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = { "createdAt", "