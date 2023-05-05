@Entity
@Table(name="inprogress_search_other_criteria")
@Data
@NoArgsConstructor
public class InprogressSearchOtherCriteria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name="commissionSearchDto")
    private CommissionSearchDto commissionSearchDto;

    @Column(name="role")
    private String role;

}