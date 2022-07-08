package my.edu.xmu.hms.student;

import my.edu.xmu.hms.model.StudentDetail;
import my.edu.xmu.hms.user.UserDetail;
import my.edu.xmu.hms.user.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final UserDetailService userDetailService;

    @Autowired
    public StudentService(StudentRepository studentRepository, UserDetailService userDetailService) {
        this.studentRepository = studentRepository;
        this.userDetailService = userDetailService;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public StudentDetail saveStudent(StudentDetail studentDetails){
        if(studentRepository.findByEmail(studentDetails.getEmail()).isPresent()){
            throw new IllegalStateException("student email existed");
        }
        else{
            userDetailService.saveUserDetail(new UserDetail(
                    studentDetails.getUserId(),
                    "student",
                    studentDetails.getPw()
            ));
        }
        studentRepository.save(new Student(
                studentDetails.getUserId(),
                studentDetails.getEmail(),
                studentDetails.getFname(),
                studentDetails.getLname()
        ));
        return studentDetails;
    }
}
