package my.edu.xmu.hms.hostelrate;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HostelRateService {

    private final HostelRateRepository hostelRateRepository;

    public HostelRateService(HostelRateRepository hostelRateRepository) {
        this.hostelRateRepository = hostelRateRepository;
    }

    public List<HostelRate> getHostelRates(){
        return hostelRateRepository.findAll();
    }

    public HostelRate updateHostelRate(HostelRate hostelRateDetails){
        HostelRate hostelRate = new HostelRate();
        if(hostelRateRepository.findById(1L).isPresent()){
            hostelRate = hostelRateRepository.findById(1L).get();
        }
        if(hostelRateDetails.getdRate() != 0){
            hostelRate.setdRate(hostelRateDetails.getdRate());
        }
        if(hostelRateDetails.getLyRate() != 0){
            hostelRate.setLyRate(hostelRateDetails.getLyRate());
        }
        hostelRateRepository.save(hostelRate);
        return hostelRate;
    }
}
