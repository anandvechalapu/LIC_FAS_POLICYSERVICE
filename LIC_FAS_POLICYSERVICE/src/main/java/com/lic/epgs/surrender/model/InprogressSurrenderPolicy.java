@Entity
@Table(name = "inprogress_surrender_policy")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InprogressSurrenderPolicy implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "role_type")
	private String roleType;

	@Column(name = "page_name")
	private String pageName;

	@Column(name = "data")
	private String data;

}