package my.edu.xmu.hms.rentalfee;

import org.springframework.web.bind.annotation.*;

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
    public List<RentalFee> getRentalFeesByUserId(@RequestParam(required = false) String userId){
        return rentalFeeService.getRentalFees(userId);
    }
}
