package my.edu.xmu.hms.hostel;

import my.edu.xmu.hms.applicationRequest.ApplicationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HostelService {

    private final HostelRepository hostelRepository;

    @Autowired
    public HostelService(HostelRepository hostelRepository) {
        this.hostelRepository = hostelRepository;
    }

    public List<Hostel> getHostels(){
        return hostelRepository.findAll();
    }

    @Transactional
    public List<Hostel> deleteHostel(Long seq_id){
        hostelRepository.deleteById(seq_id);
        return hostelRepository.findAll();
    }
}
