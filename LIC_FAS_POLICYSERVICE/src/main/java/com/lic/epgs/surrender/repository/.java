@Repository
public class UpdatePolicyBankDetailsRepository {

    @Autowired
    private EntityManager em;

    public PolicySurrenderApiResponse updatePolicyBankDetails(MphBankDto mphBankDto) {
        PolicySurrenderApiResponse response = new PolicySurrenderApiResponse();
        try {
            // Fetch MPH ID from MphBankDto object
            Long mphId = mphBankDto.getMphId();
            // Fetch MPH Master record from database
            MphMaster mphMaster = em.find(MphMaster.class, mphId);
            if (mphMaster == null || !mphMaster.getActive()) {
                response.setTransactionStatus(TransactionStatus.FAILURE);
                response.setTransactionMessage("Invalid or inactive MPH ID");
                return response;
            }
            // Fetch MPH Master Temp record from database
            MphMasterTemp mphMasterTemp = em.find(MphMasterTemp.class, mphId);
            if (mphMasterTemp == null || !mphMasterTemp.getActive()) {
                response.setTransactionStatus(TransactionStatus.FAILURE);
                response.setTransactionMessage("Invalid or inactive MPH Master Temp record");
                return response;
            }
            // Fetch MPH Bank Temp record from database
            MphBankTemp mphBankTemp = em.find(MphBankTemp.class, mphId);
            // Set MPH Bank Temp ID to null to create new record or update existing record
            mphBankTemp.setId(null);
            // Map MphBankDto object to MPH Bank Temp entity
            ModelMapper modelMapper = new ModelMapper();
            modelMapper.map(mphBankDto, mphBankTemp);
            // Save MPH Bank Temp entity to database
            em.persist(mphBankTemp);
            em.flush();
            // Prepare response
            response.setTransactionStatus(TransactionStatus.SUCCESS);
            response.setTransactionMessage("Mph Bank Details updated successfully");
            response.setPolicyBank(mphBankTemp);
        } catch (Exception e) {
            response.setTransactionStatus(TransactionStatus.FAILURE);
            response.setTransactionMessage("Error occurred while updating Mph Bank Details");
        }
        return response;
    }

}