package my.edu.xmu.hms.hostelrate;

import javax.persistence.*;

@Entity
@Table
public class HostelRate {
    @Id
    @SequenceGenerator(
            name="hostel_rate_sequence",
            sequenceName = "hostel_rate_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "hostel_rate_sequence"
    )
    Long seq_id;
    float dRate;
    float lyRate;

    public HostelRate() {
    }

    public HostelRate(float dRate, float lyRate) {
        this.lyRate = lyRate;
        this.dRate = dRate;
    }

    public Long getSeq_id() {
        return seq_id;
    }

    public void setSeq_id(Long seq_id) {
        this.seq_id = seq_id;
    }

    public float getLyRate() {
        return lyRate;
    }

    public void setLyRate(float lyRate) {
        this.lyRate = lyRate;
    }

    public float getdRate() {
        return dRate;
    }

    public void setdRate(float dRate) {
        this.dRate = dRate;
    }

    @Override
    public String toString() {
        return "HostelRate{" +
                "seq_id=" + seq_id +
                ", lyRate=" + lyRate +
                ", dRate=" + dRate +
                '}';
    }
}
