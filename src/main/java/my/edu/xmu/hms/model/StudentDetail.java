package my.edu.xmu.hms.model;

public class StudentDetail {
    String userId;
    String email;
    String fname;
    String lname;
    String pw;

    public StudentDetail(String userId, String email, String fname, String lname, String pw) {
        this.userId = userId;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.pw = pw;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "StudentDetail{" +
                "userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
