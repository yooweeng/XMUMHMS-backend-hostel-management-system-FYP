package my.edu.xmu.hms.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student a=new Student(
                    "swe1904867",
                    "swe1904867@xmu.edu.my",
                    "test1234",
                    "Yoo Wee",
                    "Ng"
            );

            Student b=new Student(
                    "swe1904823",
                    "swe1904823@xmu.edu.my",
                    "test1234",
                    "Test",
                    "test"
            );

            repository.saveAll(
                    List.of(a,b)
            );
        };
    }
}
