package my.edu.xmu.hms.applicationRequest;

import my.edu.xmu.hms.user.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/applicationrequest")
public class ApplicationRequestController {

    private final ApplicationRequestService applicationRequestService;

    @Autowired
    public ApplicationRequestController(ApplicationRequestService applicationRequestService) {
        this.applicationRequestService = applicationRequestService;
    }

    @GetMapping
    public List<ApplicationRequest> getApplicationRequests(@RequestParam(required = false) String status,@RequestParam(required = false) String studentId){
        return applicationRequestService.getApplicationRequests(status, studentId);
    }

    @PostMapping
    public List<ApplicationRequest> saveApplicationRequestIfNotExist(@RequestBody ApplicationRequest applicationRequest){
        return applicationRequestService.saveApplicationRequestIfNotExist(applicationRequest);
    }

    @PutMapping("{id}")
    public List<ApplicationRequest> updateApplicationRequest(@PathVariable Long id, @RequestBody ApplicationRequest applicationRequestDetails){
        return applicationRequestService.updateApplicationRequest(id, applicationRequestDetails);
    }

    @DeleteMapping("{applicationId}")
    public List<ApplicationRequest> deleteApplicationRequest(@PathVariable Long applicationId){
        return applicationRequestService.deleteApplicationRequest(applicationId);
    }
}
