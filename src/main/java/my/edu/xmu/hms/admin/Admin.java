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
    private String adminId;
    private String fname;
    private String lname;
    private String name;
    private String registrationTime;

    public Admin() {
    }

    public Admin(String adminId, String fname, String lname, String name, String registrationTime) {
        this.adminId = adminId;
        this.fname = fname;
        this.lname = lname;
        this.name = name;
        this.registrationTime = registrationTime;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
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

    @Override
    public String toString() {
        return "Admin{" +
                "seq_id=" + seq_id +
                ", adminId='" + adminId + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", name='" + name + '\'' +
                ", registrationTime='" + registrationTime + '\'' +
                '}';
    }
}
