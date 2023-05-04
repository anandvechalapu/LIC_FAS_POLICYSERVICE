package com.lic.epgs.common.controller;

import com.lic.epgs.common.model.CommonStatus;
import com.lic.epgs.common.service.CommonStatusService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/common-status")
public class CommonStatusController {

    @Autowired
    private CommonStatusService commonStatusService;

    @GetMapping
    public List<CommonStatus> findAllCommonStatuses() {
        return commonStatusService.findAllCommonStatuses();
    }

    @GetMapping("/{code}/{type}")
    public CommonStatus findCommonStatusByCodeAndType(@PathVariable("code") String code, @PathVariable("type") String type) {
        return commonStatusService.findCommonStatusByCodeAndType(code, type);
    }

    @GetMapping("/type/{type}")
    public List<CommonStatus> findCommonStatusesByType(@PathVariable("type") String type) {
        return commonStatusService.findCommonStatusesByType(type);
    }

    @GetMapping("/is-active/{isActive}")
    public List<CommonStatus> findCommonStatusesByIsActive(@PathVariable("isActive") boolean isActive) {
        return commonStatusService.findCommonStatusesByIsActive(isActive);
    }

    @PutMapping("/is-active/{isActive}/{code}/{type}")
    public void updateCommonStatusIsActive(@PathVariable("isActive") boolean isActive, @PathVariable("code") String code, @PathVariable("type") String type) {
        commonStatusService.updateCommonStatusIsActive(isActive, code, type);
    }

    @PutMapping("/delete/{code}/{type}")
    public void deleteCommonStatus(@PathVariable("code") String code, @PathVariable("type") String type) {
        commonStatusService.deleteCommonStatus(code, type);
    }
}