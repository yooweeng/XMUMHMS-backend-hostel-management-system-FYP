package my.edu.xmu.hms.maintenanceRequest;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceRequestService {

    private final MaintenanceRequestRepository maintenanceRequestRepository;

    public MaintenanceRequestService(MaintenanceRequestRepository maintenanceRequestRepository) {
        this.maintenanceRequestRepository = maintenanceRequestRepository;
    }

    public List<MaintenanceRequest> getMaintenanceRequests(String studentId){
        if(studentId != null){
            return maintenanceRequestRepository.findByCampusId(studentId);
        }
        return maintenanceRequestRepository.findAll();
    }

    public List<MaintenanceRequest> saveMaintenanceRequest(MaintenanceRequest maintenanceRequest){
        maintenanceRequestRepository.save(maintenanceRequest);
        return maintenanceRequestRepository.findAll();
    }
}
