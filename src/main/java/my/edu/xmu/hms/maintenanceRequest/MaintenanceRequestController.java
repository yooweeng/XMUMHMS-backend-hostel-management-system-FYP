package my.edu.xmu.hms.maintenanceRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/maintenancerequest")
public class MaintenanceRequestController {

    private final MaintenanceRequestService maintenanceRequestService;

    @Autowired
    public MaintenanceRequestController(MaintenanceRequestService maintenanceRequestService) {
        this.maintenanceRequestService = maintenanceRequestService;
    }

    @GetMapping
    public List<MaintenanceRequest> getMaintenanceRequests(@RequestParam(required = false) String studentId){
        return maintenanceRequestService.getMaintenanceRequests(studentId);
    }

    @PostMapping
    public List<MaintenanceRequest> saveMaintenanceRequest(@RequestBody MaintenanceRequest maintenanceRequest){
        return maintenanceRequestService.saveMaintenanceRequest(maintenanceRequest);
    }
}
