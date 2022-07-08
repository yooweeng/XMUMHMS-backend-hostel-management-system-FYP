package my.edu.xmu.hms.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDetailRepository
        extends JpaRepository<UserDetail, Long> {

    Optional<UserDetail> findByUserId(String userId);
    List<UserDetail> findByCategory(String category);
    void deleteByUserId(String adminId);
}
