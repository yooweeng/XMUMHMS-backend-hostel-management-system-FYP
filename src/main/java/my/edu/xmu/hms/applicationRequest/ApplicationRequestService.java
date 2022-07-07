package my.edu.xmu.hms.applicationRequest;

import my.edu.xmu.hms.user.UserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ApplicationRequestService {
    private final ApplicationRequestRepository applicationRequestRepository;

    @Autowired
    public ApplicationRequestService(ApplicationRequestRepository applicationRequestRepository) {
        this.applicationRequestRepository = applicationRequestRepository;
    }

    public List<ApplicationRequest> getApplicationRequests(String status, String studentId){
        if((status == null) && (studentId == null)){
            return applicationRequestRepository.findAll();
        }
        if((status != null) && (status.equals("pending"))){
            return applicationRequestRepository.findByStatus("Pending");
        }
        if(studentId != null){
            return applicationRequestRepository.findByStudentId(studentId);
        }
        throw new IllegalStateException("Illegal or missing request parameter");
    }

    public List<ApplicationRequest> saveApplicationRequestIfNotExist(ApplicationRequest applicationRequest){
        applicationRequestRepository.save(applicationRequest);
        return applicationRequestRepository.findAll();
    }

    public List<ApplicationRequest> updateApplicationRequest(Long id, ApplicationRequest applicationRequestDetails){
        if(applicationRequestRepository.findById(id).isPresent()){
            ApplicationRequest applicationRequestById = applicationRequestRepository.findById(id).get();

            //approval or reject (admin)
            if(applicationRequestDetails.getStatus() != null){
                applicationRequestById.setStatus(applicationRequestDetails.getStatus());
            }

            //hostel application
            if(applicationRequestDetails.getParentName1() != null){
                applicationRequestById.setParentName1(applicationRequestDetails.getParentName1());
            }
            if(applicationRequestDetails.getParentMobile1() != null){
                applicationRequestById.setParentMobile1(applicationRequestDetails.getParentMobile1());
            }
            if(applicationRequestDetails.getRelationship1() != null){
                applicationRequestById.setRelationship1(applicationRequestDetails.getRelationship1());
            }
            if(applicationRequestDetails.getNickname() != null){
                applicationRequestById.setNickname(applicationRequestDetails.getNickname());
            }
            if(applicationRequestDetails.getRoommateName() != null){
                applicationRequestById.setRoommateName(applicationRequestDetails.getRoommateName());
            }
            if(applicationRequestDetails.getRoommateNricPassport() != null){
                applicationRequestById.setRoommateNricPassport(applicationRequestDetails.getRoommateNricPassport());
            }
            if(applicationRequestDetails.getRoommatePhoneNo() != null){
                applicationRequestById.setRoommatePhoneNo(applicationRequestDetails.getRoommatePhoneNo());
            }
            if(applicationRequestDetails.getParentName2() != null){
                applicationRequestById.setParentName2(applicationRequestDetails.getParentName2());
            }
            if(applicationRequestDetails.getParentMobile2() != null){
                applicationRequestById.setParentMobile2(applicationRequestDetails.getParentMobile2());
            }
            if(applicationRequestDetails.getRelationship2() != null){
                applicationRequestById.setRelationship2(applicationRequestDetails.getRelationship2());
            }
            if(applicationRequestDetails.getRemarks() != null){
                applicationRequestById.setRemarks(applicationRequestDetails.getRemarks());
            }
            if(applicationRequestDetails.getSelectedBlockD() != null){
                applicationRequestById.setSelectedBlockD(applicationRequestDetails.getSelectedBlockD());
            }

            //change period
            if(applicationRequestDetails.getModifyDate() != null){
                applicationRequestById.setModifyDate(applicationRequestDetails.getModifyDate());
            }

            //update checkout
            if(applicationRequestDetails.getReason() != null){
                applicationRequestById.setReason(applicationRequestDetails.getReason());
            }
            if(applicationRequestDetails.getCheckoutTime() != null){
                applicationRequestById.setCheckoutTime(applicationRequestDetails.getCheckoutTime());
            }

            //change room
            if(applicationRequestDetails.getExchangedHostel() != null){
                applicationRequestById.setExchangedHostel(applicationRequestDetails.getExchangedHostel());
            }

            applicationRequestRepository.save(applicationRequestById);
            return applicationRequestRepository.findAll();
        }
        throw new IllegalStateException("Illegal or missing request parameter");
    }

    @Transactional
    public List<ApplicationRequest> deleteApplicationRequest(Long applicationId){
        applicationRequestRepository.deleteByApplicationId(applicationId);
        return applicationRequestRepository.findAll();
    }
}
