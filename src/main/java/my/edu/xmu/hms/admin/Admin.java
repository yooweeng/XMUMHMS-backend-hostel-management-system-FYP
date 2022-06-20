package my.edu.xmu.hms.admin;

import javax.persistence.*;

@Entity
@Table
public class Admin {
    @Id
    @SequenceGenerator(
            name="admin_sequence",
            sequenceName = "admin_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "admin_sequence"
    )
    private Long seq_id;
    private String admin_id;
    private String fname;
    private String lname;
    private String name;
    private String registration_time;

    public Admin() {
    }

    public Admin(String admin_id, String fname, String lname, String name, String registration_time) {
        this.admin_id = admin_id;
        this.fname = fname;
        this.lname = lname;
        this.name = name;
        this.registration_time = registration_time;
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSeq_id() {
        return seq_id;
    }

    public void setSeq_id(Long seq_id) {
        this.seq_id = seq_id;
    }

    public String getRegistration_time() {
        return registration_time;
    }

    public void setRegistration_time(String registration_time) {
        this.registration_time = registration_time;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "seq_id=" + seq_id +
                ", admin_id='" + admin_id + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", name='" + name + '\'' +
                ", registration_time='" + registration_time + '\'' +
                '}';
    }
}
