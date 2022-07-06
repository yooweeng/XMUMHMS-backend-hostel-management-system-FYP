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
    private String userId;
    private String category;
    private String pw;

    public UserDetail() {
    }

    public UserDetail(String userId, String category, String pw) {
        this.userId = userId;
        this.category = category;
        this.pw = pw;
    }

    public Long getSeq_id() {
        return seq_id;
    }

    public void setSeq_id(Long seq_id) {
        this.seq_id = seq_id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
                ", userId='" + userId + '\'' +
                ", category='" + category + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
