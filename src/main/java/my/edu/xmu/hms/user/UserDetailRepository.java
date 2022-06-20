package my.edu.xmu.hms.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailRepository
        extends JpaRepository<UserDetail, Long> {

    List<UserDetail> findByCategory(String category);
}
