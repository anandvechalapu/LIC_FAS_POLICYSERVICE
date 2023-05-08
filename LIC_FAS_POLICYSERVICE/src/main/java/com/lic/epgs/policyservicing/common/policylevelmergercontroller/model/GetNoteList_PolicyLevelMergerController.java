@Entity
@Table(name = "GetNoteList_PolicyLevelMergerController")
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetNoteList_PolicyLevelMergerController {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "merge_id")
    private String mergeId;
    
    @Column(name = "note")
    private String note;

}