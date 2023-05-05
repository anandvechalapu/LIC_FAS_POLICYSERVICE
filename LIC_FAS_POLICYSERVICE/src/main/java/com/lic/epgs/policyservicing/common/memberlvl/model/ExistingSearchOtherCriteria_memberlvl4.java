@Entity
@Table(name = "existing_search_other_criteria_memberlvl4")
public class ExistingSearchOtherCriteria_memberlvl4 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "criteria_name")
    private String criteriaName;

    @Column(name = "criteria_value")
    private String criteriaValue;

    public ExistingSearchOtherCriteria_memberlvl4() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCriteriaName() {
        return criteriaName;
    }

    public void setCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
    }

    public String getCriteriaValue() {
        return criteriaValue;
    }

    public void setCriteriaValue(String criteriaValue) {
        this.criteriaValue = criteriaValue;
    }

}