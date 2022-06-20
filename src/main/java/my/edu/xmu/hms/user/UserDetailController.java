package my.edu.xmu.hms.user;

import my.edu.xmu.hms.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/userdetail")
public class UserDetailController {

    private final UserDetailService userDetailService;

    @Autowired
    public UserDetailController(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    @GetMapping
    public List<UserDetail> getUserDetails(@RequestParam(required = false) String category){
        return userDetailService.getUserDetails(category);
    }
}
