package my.edu.xmu.hms.user;

import my.edu.xmu.hms.admin.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserDetailService {

    private final UserDetailRepository userDetailRepository;

    @Autowired
    public UserDetailService(UserDetailRepository userDetailRepository) {
        this.userDetailRepository = userDetailRepository;
    }

    public List<UserDetail> getUserDetails(String category){
        if(category == null){
            return userDetailRepository.findAll();
        }
        if(category.equals("student")){
            return userDetailRepository.findByCategory("student");
        }
        else if(category.equals("admin")){
            return userDetailRepository.findByCategory("admin");
        }
        throw new IllegalStateException("Illegal or missing request parameter");
    }

    public List<UserDetail> saveUserDetail(UserDetail userDetail){
        userDetailRepository.save(userDetail);
        return userDetailRepository.findAll();
    }

    @Transactional
    public List<UserDetail> deleteUserDetail(String adminId){
        userDetailRepository.deleteByUserId(adminId);
        return userDetailRepository.findAll();
    }
}
