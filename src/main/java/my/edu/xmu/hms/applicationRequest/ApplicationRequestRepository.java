package my.edu.xmu.hms.applicationRequest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRequestRepository
        extends JpaRepository<ApplicationRequest, Long> {

    List<ApplicationRequest> findByStatus(String status);
    List<ApplicationRequest> findByStudentId(String studentId);
    void deleteByApplicationId(Long applicationId);
}
