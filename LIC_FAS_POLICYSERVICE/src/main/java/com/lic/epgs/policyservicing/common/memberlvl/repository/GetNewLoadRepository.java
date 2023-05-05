package com.lic.epgs.policyservicing.common.memberlvl.repository;

import com.lic.epgs.policyservicing.common.memberlvl.dto.MemberMasterDto;
import com.lic.epgs.policyservicing.common.memberlvl.dto.TransferInAndOutResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GetNewLoadRepository extends JpaRepository<MemberMasterDto, Long> {

    @Query("SELECT m FROM MemberMasterDto m WHERE m.policyId = ?1")
    List<MemberMasterDto> getNewLoad(Long policyId);

    TransferInAndOutResponseDto getNewLoadResponse(Long policyId);
}