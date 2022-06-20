package my.edu.xmu.hms.hostel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostelRepository
        extends JpaRepository<Hostel, Long> {
}
