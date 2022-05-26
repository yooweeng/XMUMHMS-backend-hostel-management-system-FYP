package my.edu.xmu.hms;

import my.edu.xmu.hms.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class XmumHostelManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(XmumHostelManagementSystemApplication.class, args);
	}

}

