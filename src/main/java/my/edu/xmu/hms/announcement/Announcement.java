package my.edu.xmu.hms.announcement;

import javax.persistence.*;

@Entity
@Table
public class Announcement {
    @Id
    @SequenceGenerator(
            name = "announcement_sequence",
            sequenceName = "announcement_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "announcement_sequence"
    )
    private Long seq_id;
    //in milliseconds for javascript Date object conversion
    private String dateTime;
    private String title;
    private String content;

    public Announcement() {
    }

    public Announcement(String dateTime, String title, String content) {
        this.dateTime = dateTime;
        this.title = title;
        this.content = content;
    }

    public Announcement(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Long getSeq_id() {
        return seq_id;
    }

    public void setSeq_id(Long seq_id) {
        this.seq_id = seq_id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Announcement{" +
                "seq_id=" + seq_id +
                ", dateTime='" + dateTime + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
