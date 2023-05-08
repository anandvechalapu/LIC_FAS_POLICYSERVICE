package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.repository;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.PolicyBankOldDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SaveBankDetails_PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<PolicyBankOldDto, Long> {

	@Modifying
	@Query("INSERT INTO PolicyBankOldDto (mphBankId, mphId, bankName, bankAddress, bankAccountNumber, accountType, bankIFSCCode) VALUES (:mphBankId, :mphId, :bankName, :bankAddress, :bankAccountNumber, :accountType, :bankIFSCCode)")
	FreeLookCancellationResponseDto saveBankDetails(@Param("mphBankId") Long mphBankId, @Param("mphId") Long mphId, @Param("bankName") String bankName, @Param("bankAddress") String bankAddress, @Param("bankAccountNumber") String bankAccountNumber, @Param("accountType") String accountType, @Param("bankIFSCCode") String bankIFSCCode);

	@Modifying
	@Query("UPDATE PolicyBankOldDto SET mphBankId=:mphBankId, mphId=:mphId, bankName=:bankName, bankAddress=:bankAddress, bankAccountNumber=:bankAccountNumber, accountType=:accountType, bankIFSCCode=:bankIFSCCode WHERE mphBankId=:mphBankId")
	FreeLookCancellationResponseDto updateBankDetails(@Param("mphBankId") Long mphBankId, @Param("mphId") Long mphId, @Param("bankName") String bankName, @Param("bankAddress") String bankAddress, @Param("bankAccountNumber") String bankAccountNumber, @Param("accountType") String accountType, @Param("bankIFSCCode") String bankIFSCCode);

}