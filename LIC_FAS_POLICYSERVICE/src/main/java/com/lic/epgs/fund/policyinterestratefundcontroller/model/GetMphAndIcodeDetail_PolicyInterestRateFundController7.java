@Entity
@Table(name = "get_mph_and_icode_detail_policy_interest_rate_fund_controller7")
public class GetMphAndIcodeDetail_PolicyInterestRateFundController7 {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "scheme_name")
    private String schemeName;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_code")
    private String customerCode;

    @Column(name = "mph_mobile_number")
    private String mphMobileNumber;

    @Column(name = "mph_email")
    private String mphEmail;

    @Column(name = "mph_address")
    private String mphAddress;

    @Column(name = "mph_name")
    private String mphName;

    @Column(name = "mph_number")
    private String mphNumber;

    @Column(name = "servicing_unit_details")
    private String servicingUnitDetails;

    @Column(name = "icodes")
    private List<String> icodes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchemeName() {
        return schemeName;
    }

    public void setSchemeName(String schemeName) {
        this.schemeName = schemeName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getMphMobileNumber() {
        return mphMobileNumber;
    }

    public void setMphMobileNumber(String mphMobileNumber) {
        this.mphMobileNumber = mphMobileNumber;
    }

    public String getMphEmail() {
        return mphEmail;
    }

    public void setMphEmail(String mphEmail) {
        this.mphEmail = mphEmail;
    }

    public String getMphAddress() {
        return mphAddress;
    }

    public void setMphAddress(String mphAddress) {
        this.mphAddress = mphAddress;
    }

    public String getMphName() {
        return mphName;
    }

    public void setMphName(String mphName) {
        this.mphName = mphName;
    }

    public String getMphNumber() {
        return mphNumber;
    }

    public void setMphNumber(String mphNumber) {
        this.mphNumber = mphNumber;
    }

    public String getServicingUnitDetails() {
        return servicingUnitDetails;
    }

    public void setServicingUnitDetails(String servicingUnitDetails) {
        this.servicingUnitDetails = servicingUnitDetails;
    }

    public List<String> getIcodes() {
        return icodes;
    }

    public void setIcodes(List<String> icodes) {
        this.icodes = icodes;
    }

}