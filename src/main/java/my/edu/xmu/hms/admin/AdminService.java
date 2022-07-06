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

    public List<Admin> saveAdmin(Admin admin){
        adminRepository.save(admin);
        return adminRepository.findAll();
    }

    public List<Admin> updateAdmin(Long id, Admin adminDetails){
        if(adminRepository.findById(id).isPresent()){
            Admin adminById = adminRepository.findById(id).get();
            adminById.setFname(adminDetails.getFname());
            adminById.setLname(adminDetails.getLname());
            adminById.setName(adminDetails.getFname() +" "+ adminDetails.getLname());
            adminRepository.save(adminById);
            return adminRepository.findAll();
        }
        throw new IllegalStateException("Illegal or missing request parameter");
    }

    @Transactional
    public List<Admin> deleteAdmin(String adminId){
        adminRepository.deleteByAdminId(adminId);
        return adminRepository.findAll();
    }
}
