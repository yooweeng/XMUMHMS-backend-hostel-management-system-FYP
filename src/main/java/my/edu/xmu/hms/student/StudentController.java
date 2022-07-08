package my.edu.xmu.hms.student;

import my.edu.xmu.hms.model.StudentDetail;
import my.edu.xmu.hms.token.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public StudentDetail saveStudent(@RequestBody StudentDetail studentDetails){
        return studentService.saveStudent(studentDetails);
    }
}
