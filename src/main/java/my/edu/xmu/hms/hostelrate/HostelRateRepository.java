package my.edu.xmu.hms.hostelrate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostelRateRepository
        extends JpaRepository<HostelRate, Long> {
}
