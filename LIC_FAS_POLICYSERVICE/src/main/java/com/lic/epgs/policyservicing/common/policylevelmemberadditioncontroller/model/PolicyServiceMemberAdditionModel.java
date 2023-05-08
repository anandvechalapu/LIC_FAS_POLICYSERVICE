public class PolicyServiceMemberAdditionModel {
    private Long memberAdditionId;
    private List<PolicyServiceMbrDto> policyServiceMbrDtos;
    private List<PolicyServiceMemberEntity> policyServiceMemberEntities;
    private Boolean activeAddress;
    private Boolean activeNominee;
    
    public PolicyServiceMemberAdditionModel(){
        
    }
    
    public Long getMemberAdditionId() {
        return memberAdditionId;
    }
    
    public void setMemberAdditionId(Long memberAdditionId) {
        this.memberAdditionId = memberAdditionId;
    }
    
    public List<PolicyServiceMbrDto> getPolicyServiceMbrDtos() {
        return policyServiceMbrDtos;
    }
    
    public void setPolicyServiceMbrDtos(List<PolicyServiceMbrDto> policyServiceMbrDtos) {
        this.policyServiceMbrDtos = policyServiceMbrDtos;
    }
    
    public List<PolicyServiceMemberEntity> getPolicyServiceMemberEntities() {
        return policyServiceMemberEntities;
    }
    
    public void setPolicyServiceMemberEntities(List<PolicyServiceMemberEntity> policyServiceMemberEntities) {
        this.policyServiceMemberEntities = policyServiceMemberEntities;
    }
    
    public Boolean getActiveAddress() {
        return activeAddress;
    }
    
    public void setActiveAddress(Boolean activeAddress) {
        this.activeAddress = activeAddress;
    }
    
    public Boolean getActiveNominee() {
        return activeNominee;
    }
    
    public void setActiveNominee(Boolean activeNominee) {
        this.activeNominee = activeNominee;
    }
}