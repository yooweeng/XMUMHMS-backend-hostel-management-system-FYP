package my.edu.xmu.hms.faq;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqRepository
        extends JpaRepository<Faq, Long> {
}
