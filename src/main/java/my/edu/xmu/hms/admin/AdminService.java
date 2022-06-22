package my.edu.xmu.hms.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<Admin> getAdmins(){
        return adminRepository.findAll();
    }

    @Transactional
    public List<Admin> deleteAdmin(String adminId){
        adminRepository.deleteByAdminId(adminId);
        return adminRepository.findAll();
    }
}
