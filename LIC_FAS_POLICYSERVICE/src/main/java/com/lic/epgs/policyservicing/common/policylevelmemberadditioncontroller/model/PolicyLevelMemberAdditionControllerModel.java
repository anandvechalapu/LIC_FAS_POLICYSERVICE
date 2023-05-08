@Entity
@Table(name="POLICY_LEVEL_MEMBER_ADDITION")
@Repository
public class PolicyLevelMemberAdditionControllerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MEMBER_ADDITION_ID")
    private Long memberAdditionId;

    @Column(name="PERSONAL_DETAILS")
    private String personalDetails;

    @Column(name="ADDRESS_DETAILS")
    private String addressDetails;

    @Column(name="BANK_DETAILS")
    private String bankDetails;

    @Column(name="NOMINEE_DETAILS")
    private String nomineeDetails;

    @Column(name="APPOINTEES_DETAILS")
    private String appointeeDetails;

    @Column(name="STATUS")
    private String status;

    public Long getMemberAdditionId() {
        return memberAdditionId;
    }

    public void setMemberAdditionId(Long memberAdditionId) {
        this.memberAdditionId = memberAdditionId;
    }

    public String getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(String personalDetails) {
        this.personalDetails = personalDetails;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getNomineeDetails() {
        return nomineeDetails;
    }

    public void setNomineeDetails(String nomineeDetails) {
        this.nomineeDetails = nomineeDetails;
    }

    public String getAppointeeDetails() {
        return appointeeDetails;
    }

    public void setAppointeeDetails(String appointeeDetails) {
        this.appointeeDetails = appointeeDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}