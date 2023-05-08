@Repository
public interface GetFreeLookCancellationById_PolicyLevelFreeLookCancelControllerRepository extends JpaRepository<FreeLookCancellation, Long> {

    FreeLookCancellationResponseDto getExistingFreeLookCancellationById(Long freeLookId);

    FreeLookCancellationResponseDto getFreeLookCancellationById(Long freeLookId);

    boolean existsByFreeLookId(Long freeLookId);

    FreeLookCancellation findByFreeLookId(Long freeLookId);

    FreeLookCancellation findByPolicyNumber(String policyNumber);

    FreeLookCancellation findByStatus(String status);

    List<FreeLookCancellation> findAll();

    void deleteByFreeLookId(Long freeLookId);
}

// Spring Boot Controller Class
package com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.controller;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.FreeLookCancellation;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.model.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.GetFreeLookCancellationById_PolicyLevelFreeLookCancelControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/freelookcancellation")
public class GetFreeLookCancellationById_PolicyLevelFreeLookCancelController {

    @Autowired
    GetFreeLookCancellationById_PolicyLevelFreeLookCancelControllerService service;

    @GetMapping("/{freeLookId}")
    public FreeLookCancellationResponseDto getExistingFreeLookCancellationById(@PathVariable Long freeLookId) {
        return service.getExistingFreeLookCancellationById(freeLookId);
    }

    @GetMapping("/")
    public FreeLookCancellationResponseDto getFreeLookCancellationById(@RequestParam Long freeLookId) {
        return service.getFreeLookCancellationById(freeLookId);
    }

    @GetMapping("/exists")
    public boolean existsByFreeLookId(@RequestParam Long freeLookId) {
        return service.existsByFreeLookId(freeLookId);
    }

    @GetMapping("/findByFreeLookId")
    public FreeLookCancellation findByFreeLookId(@RequestParam Long freeLookId) {
        return service.findByFreeLookId(freeLookId);
    }

    @GetMapping("/findByPolicyNumber")
    public FreeLookCancellation findByPolicyNumber(@RequestParam String policyNumber) {
        return service.findByPolicyNumber(policyNumber);
    }

    @GetMapping("/findByStatus")
    public FreeLookCancellation findByStatus(@RequestParam String status) {
        return service.findByStatus(status);
    }

    @GetMapping("/findAll")
    public List<FreeLookCancellation> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/deleteByFreeLookId")
    public void deleteByFreeLookId(@RequestParam Long freeLookId) {
        service.deleteByFreeLookId(freeLookId);
    }

}