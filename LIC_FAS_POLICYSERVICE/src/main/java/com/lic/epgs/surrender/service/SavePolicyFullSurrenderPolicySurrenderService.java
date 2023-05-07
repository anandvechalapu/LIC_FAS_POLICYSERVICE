package com.lic.epgs.surrender.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lic.epgs.surrender.model.SavePolicyFullSurrenderPolicySurrender;

@Repository
public interface SavePolicyFullSurrenderPolicySurrenderRepository extends JpaRepository<SavePolicyFullSurrenderPolicySurrender, Long> {
	
	SavePolicyFullSurrenderPolicySurrender save(SavePolicyFullSurrenderPolicySurrender savePolicyFullSurrenderPolicySurrender);
	
	Optional<SavePolicyFullSurrenderPolicySurrender> findById(Long id);
	
	void deleteById(Long id);
	
	@Query("SELECT p.mphCode, p.mphName from PolicyMaster p WHERE p.mphCode = :mphCode") 
	List<Object[]> findMphCodeAndMphNameByMphCode(@Param("mphCode") String mphCode);
	
}

@Service
public class SavePolicyFullSurrenderPolicySurrenderService {

	@Autowired
	private SavePolicyFullSurrenderPolicySurrenderRepository savePolicyFullSurrenderPolicySurrenderRepository;

	public SavePolicyFullSurrenderPolicySurrender save(SavePolicyFullSurrenderPolicySurrender savePolicyFullSurrenderPolicySurrender) {
		return savePolicyFullSurrenderPolicySurrenderRepository.save(savePolicyFullSurrenderPolicySurrender);
	}

	public Optional<SavePolicyFullSurrenderPolicySurrender> findById(Long id) {
		return savePolicyFullSurrenderPolicySurrenderRepository.findById(id);
	}

	public void deleteById(Long id) {
		savePolicyFullSurrenderPolicySurrenderRepository.deleteById(id);
	}

	public List<Object[]> findMphCodeAndMphNameByMphCode(String mphCode) {
		return savePolicyFullSurrenderPolicySurrenderRepository.findMphCodeAndMphNameByMphCode(mphCode);
	}

}