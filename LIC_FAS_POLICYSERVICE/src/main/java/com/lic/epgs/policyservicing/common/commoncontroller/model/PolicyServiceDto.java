@Entity
@Table(name = "policyservice_dto")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PolicyServiceDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "policy_number")
    private String policyNumber;

    @Column(name = "service_type")
    private String serviceType;

    @Column(name = "status")
    private String status;

    @Column(name = "start_date")
    private Date startDate;

}

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolicyServiceCommonResponseDto implements Serializable {

    private boolean success;
    private String message;

}