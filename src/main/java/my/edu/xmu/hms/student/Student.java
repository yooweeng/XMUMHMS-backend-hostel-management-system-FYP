package my.edu.xmu.hms.student;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long seq_id;
    private String student_id;
    private String email;
    private String password;
    private String fname;
    private String lname;

    public Student() {
    }

    public Student(Long seq_id, String student_id, String email, String password, String fname, String lname) {
        this.seq_id = seq_id;
        this.student_id = student_id;
        this.email = email;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
    }

    public Student(String student_id, String email, String password, String fname, String lname) {
        this.student_id = student_id;
        this.email = email;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
    }

    public Long getSeq_id() {
        return seq_id;
    }

    public void setSeq_id(Long seq_id) {
        this.seq_id = seq_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "seq_id=" + seq_id +
                ", student_id='" + student_id + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
