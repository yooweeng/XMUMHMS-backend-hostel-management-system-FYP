package my.edu.xmu.hms.faq;

import javax.persistence.*;

@Entity
@Table
public class Faq {
    @Id
    @SequenceGenerator(
            name="faq_sequence",
            sequenceName = "faq_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "faq_sequence"
    )
    Long seq_id;
    String question;
    String answer;

    public Faq() {
    }

    public Faq(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public Long getSeq_id() {
        return seq_id;
    }

    public void setSeq_id(Long seq_id) {
        this.seq_id = seq_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Faq{" +
                "seq_id=" + seq_id +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
