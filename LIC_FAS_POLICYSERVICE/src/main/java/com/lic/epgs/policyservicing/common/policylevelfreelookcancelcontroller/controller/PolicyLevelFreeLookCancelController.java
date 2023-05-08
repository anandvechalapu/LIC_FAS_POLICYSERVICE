import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.FreeLookCancellationResponseDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.dto.PolicyServiceDocumentDto;
import com.lic.epgs.policyservicing.common.policylevelfreelookcancelcontroller.service.PolicyLevelFreeLookCancelControllerService;

@RestController
@RequestMapping("/uploadDocument")
public class PolicyLevelFreeLookCancelController {

    @Autowired
    private PolicyLevelFreeLookCancelControllerService policyLevelFreeLookCancelControllerService;

    @PostMapping
    public ResponseEntity<FreeLookCancellationResponseDto> uploadDocument(@RequestBody PolicyServiceDocumentDto policyServiceDocumentDto) {
        FreeLookCancellationResponseDto freeLookCancellationResponseDto = policyLevelFreeLookCancelControllerService.uploadDocument(policyServiceDocumentDto);
        return new ResponseEntity<>(freeLookCancellationResponseDto, HttpStatus.OK);
    }

}