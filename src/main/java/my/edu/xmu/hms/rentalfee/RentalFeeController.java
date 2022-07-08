package my.edu.xmu.hms.rentalfee;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/rentalfee")
public class RentalFeeController {

    private final RentalFeeService rentalFeeService;

    public RentalFeeController(RentalFeeService rentalFeeService) {
        this.rentalFeeService = rentalFeeService;
    }

    @GetMapping
    public List<RentalFee> getRentalFees(){
        return rentalFeeService.getRentalFees();
    }
}
