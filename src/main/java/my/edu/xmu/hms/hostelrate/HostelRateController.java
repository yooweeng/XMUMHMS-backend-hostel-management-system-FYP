package my.edu.xmu.hms.hostelrate;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/hostelrate")
public class HostelRateController {

    private final HostelRateService hostelRateService;

    public HostelRateController(HostelRateService hostelRateService) {
        this.hostelRateService = hostelRateService;
    }

    @GetMapping
    public List<HostelRate> getHostelRates(){
        return hostelRateService.getHostelRates();
    }

    @PutMapping("1")
    public HostelRate updateHostelRate(@RequestBody HostelRate hostelRateDetails){
        return hostelRateService.updateHostelRate(hostelRateDetails);
    }
}
