package com.lic.epgs.topupda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.topupda.entity.NoteTempEntity;

public interface NotesTempRepository extends JpaRepository<NoteTempEntity, Long> {

	public List<NoteTempEntity> getNotesList(Long topupId);

}