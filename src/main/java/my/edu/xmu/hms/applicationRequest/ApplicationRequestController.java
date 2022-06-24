package my.edu.xmu.hms.applicationRequest;

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
    public List<ApplicationRequest> getApplicationRequests(@RequestParam(required = false) String status){
        return applicationRequestService.getApplicationRequests(status);
    }

    @PostMapping
    public List<ApplicationRequest> saveApplicationRequest(@RequestBody ApplicationRequest applicationRequest){
        return applicationRequestService.saveApplicationRequest(applicationRequest);
    }

    @PutMapping("{id}")
    public List<ApplicationRequest> updateApplicationRequest(@PathVariable Long id, @RequestBody ApplicationRequest applicationRequestDetails){
        return applicationRequestService.updateApplicationRequest(id, applicationRequestDetails);
    }
}
