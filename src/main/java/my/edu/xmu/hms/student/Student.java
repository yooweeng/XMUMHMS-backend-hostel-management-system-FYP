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
    private String fname;
    private String lname;
    private String status;
    private String nationality;
    private String fullname;
    private String nric_passport;
    private String programme;
    private String phone_no;

    public Student() {
    }

    public Student(String student_id, String email, String fname, String lname, String status, String nationality, String fullname, String nric_passport, String programme, String phone_no) {
        this.student_id = student_id;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.status = status;
        this.nationality = nationality;
        this.fullname = fullname;
        this.nric_passport = nric_passport;
        this.programme = programme;
        this.phone_no = phone_no;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNric_passport() {
        return nric_passport;
    }

    public void setNric_passport(String nric_passport) {
        this.nric_passport = nric_passport;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "seq_id=" + seq_id +
                ", student_id='" + student_id + '\'' +
                ", email='" + email + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", status='" + status + '\'' +
                ", nationality='" + nationality + '\'' +
                ", fullname='" + fullname + '\'' +
                ", nric_passport='" + nric_passport + '\'' +
                ", programme='" + programme + '\'' +
                ", phone_no='" + phone_no + '\'' +
                '}';
    }
}
