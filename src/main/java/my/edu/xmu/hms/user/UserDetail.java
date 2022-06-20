package my.edu.xmu.hms.user;

import javax.persistence.*;

@Entity
@Table
public class UserDetail {
    @Id
    @SequenceGenerator(
            name = "user_details_sequence",
            sequenceName = "user_details_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_details_sequence"
    )
    private Long seq_id;
    private String user_id;
    private String category;
    private String pw;

    public UserDetail() {
    }

    public UserDetail(String user_id, String category, String pw) {
        this.user_id = user_id;
        this.category = category;
        this.pw = pw;
    }

    public Long getSeq_id() {
        return seq_id;
    }

    public void setSeq_id(Long seq_id) {
        this.seq_id = seq_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "seq_id=" + seq_id +
                ", user_id='" + user_id + '\'' +
                ", category='" + category + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
