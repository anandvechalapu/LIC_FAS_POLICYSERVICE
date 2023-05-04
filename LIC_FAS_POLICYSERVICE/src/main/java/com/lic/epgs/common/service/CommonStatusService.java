package com.lic.epgs.common.service;

import com.lic.epgs.common.entity.CommonStatus;
import com.lic.epgs.common.repository.CommonStatusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommonStatusService {

    @Autowired
    private CommonStatusRepository commonStatusRepository;

    public List<CommonStatus> findAllCommonStatuses() {
        return commonStatusRepository.findAllCommonStatuses();
    }

    public CommonStatus findCommonStatusByCodeAndType(String code, String type) {
        return commonStatusRepository.findCommonStatusByCodeAndType(code, type);
    }

    public List<CommonStatus> findCommonStatusesByType(String type) {
        return commonStatusRepository.findCommonStatusesByType(type);
    }

    public List<CommonStatus> findCommonStatusesByIsActive(boolean isActive) {
        return commonStatusRepository.findCommonStatusesByIsActive(isActive);
    }

    public void updateCommonStatusIsActive(boolean isActive, String code, String type) {
        commonStatusRepository.updateCommonStatusIsActive(isActive, code, type);
    }

    public void deleteCommonStatus(String code, String type) {
        commonStatusRepository.deleteCommonStatus(code, type);
    }
}