package my.edu.xmu.hms.rentalfee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RentalFeeRepository
        extends JpaRepository<RentalFee, Long> {

    List<RentalFee> findByUserId(String userId);
}
