package my.edu.xmu.hms.admin;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping
    public List<Admin> getAdmins(){
        return adminService.getAdmins();
    }

    @DeleteMapping("{adminId}")
    public List<Admin> deleteAdmin(@PathVariable String adminId){
        return adminService.deleteAdmin(adminId);
    }
}
