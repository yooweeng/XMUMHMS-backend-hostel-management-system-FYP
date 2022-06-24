package my.edu.xmu.hms.applicationRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationRequestService {
    private final ApplicationRequestRepository applicationRequestRepository;

    @Autowired
    public ApplicationRequestService(ApplicationRequestRepository applicationRequestRepository) {
        this.applicationRequestRepository = applicationRequestRepository;
    }

    public List<ApplicationRequest> getApplicationRequests(String status){
        if(status == null){
            return applicationRequestRepository.findAll();
        }
        if(status.equals("pending")){
            return applicationRequestRepository.findByStatus("Pending");
        }
        throw new IllegalStateException("Illegal or missing request parameter");
    }

    public List<ApplicationRequest> saveApplicationRequest(ApplicationRequest applicationRequest){
        applicationRequestRepository.save(applicationRequest);
        return applicationRequestRepository.findAll();
    }

    public List<ApplicationRequest> updateApplicationRequest(Long id, ApplicationRequest applicationRequestDetails){
        if(applicationRequestRepository.findById(id).isPresent()){
            ApplicationRequest applicationRequestById = applicationRequestRepository.findById(id).get();
            applicationRequestById.setStatus(applicationRequestDetails.getStatus());
            applicationRequestRepository.save(applicationRequestById);
            return applicationRequestRepository.findAll();
        }
        throw new IllegalStateException("Illegal or missing request parameter");
    }
}
