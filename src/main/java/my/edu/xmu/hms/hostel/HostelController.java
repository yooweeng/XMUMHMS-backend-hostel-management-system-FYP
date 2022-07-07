package my.edu.xmu.hms.hostel;

import my.edu.xmu.hms.applicationRequest.ApplicationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/hostel")
public class HostelController {

    private final HostelService hostelService;

    @Autowired
    public HostelController(HostelService hostelService) {
        this.hostelService = hostelService;
    }

    @GetMapping
    public List<Hostel> getHostels(){
        return hostelService.getHostels();
    }

    @DeleteMapping("{seq_id}")
    public List<Hostel> deleteHostel(@PathVariable Long seq_id){
        return hostelService.deleteHostel(seq_id);
    }
}
