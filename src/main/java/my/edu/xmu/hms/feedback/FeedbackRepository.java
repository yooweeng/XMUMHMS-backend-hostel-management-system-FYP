package my.edu.xmu.hms.feedback;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository
        extends JpaRepository<Feedback, Long> {
}
