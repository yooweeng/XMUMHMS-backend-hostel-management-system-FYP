package my.edu.xmu.hms.Feedback;

import javax.persistence.*;

@Entity
@Table
public class Feedback {
    @Id
    @SequenceGenerator(
            name = "feedback_sequence",
            sequenceName = "feedback_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "feedback_sequence"
    )
    private Long feedbackId;
    private String subject;
    private String comment;
    private String remarks;

    public Feedback() {
    }

    public Feedback(String subject, String comment, String remarks) {
        this.subject = subject;
        this.comment = comment;
        this.remarks = remarks;
    }

    public Long getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId=" + feedbackId +
                ", subject='" + subject + '\'' +
                ", comment='" + comment + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
