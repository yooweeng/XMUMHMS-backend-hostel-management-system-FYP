package my.edu.xmu.hms.maintenanceRequest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaintenanceRequestRepository
        extends JpaRepository<MaintenanceRequest, Long> {

    List<MaintenanceRequest> findByCampusId(String studentId);
}
