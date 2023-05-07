package com.lic.epgs.surrender.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.surrender.model.CommonNoteTempEntity;

public interface SaveNotesDetailsRepository extends JpaRepository<CommonNoteTempEntity, Long> {
    
    public CommonNoteTempEntity save(CommonNoteTempEntity entity);

}