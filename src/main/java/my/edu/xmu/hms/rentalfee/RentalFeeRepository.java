package my.edu.xmu.hms.rentalfee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentalFeeRepository
        extends JpaRepository<RentalFee, Long> {
}
