package my.edu.xmu.hms.token;

import org.springframework.web.bind.MissingRequestValueException;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/login")
public class TokenController {

    @GetMapping
    public Token getToken(@RequestParam String category){
        if(category.equals("student")){
            return new Token("stu");
        }
        else if(category.equals("admin")){
            return new Token("adm");
        }
        throw new IllegalStateException("Illegal or missing request parameter");
    }
}
