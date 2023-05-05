@Entity
@Table(name = "COMMON_COMMISSION_DTO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonCommissionDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "SEARCH_PARAMS")
    private CommissionSearchDto searchParams;

}