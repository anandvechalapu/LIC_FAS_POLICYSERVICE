@Entity
@Table(name = "member_credit_bulk")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberCreditBulk {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String policyNo;
    
    private List<String> memberIds;
    
    @Column(name="created_at")
    private LocalDateTime createdAt;
    
    @Column(name="updated_at")
    private LocalDateTime updatedAt;
}