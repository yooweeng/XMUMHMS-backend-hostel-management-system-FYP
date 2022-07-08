package my.edu.xmu.hms.rentalfee;

import javax.persistence.*;

@Entity
@Table
public class RentalFee {
    @Id
    @SequenceGenerator(
            name="rental_fee_sequence",
            sequenceName = "rental_fee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "rental_fee_sequence"
    )
    Long seq_id;
    String date;
    String record;
    float amount;
    float paid;
    @Transient
    float balanceRemaining;

    public RentalFee() {
    }

    public RentalFee(String date, String record, float amount, float paid) {
        this.date = date;
        this.record = record;
        this.amount = amount;
        this.paid = paid;
    }

    public Long getSeq_id() {
        return seq_id;
    }

    public void setSeq_id(Long seq_id) {
        this.seq_id = seq_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getPaid() {
        return paid;
    }

    public void setPaid(float paid) {
        this.paid = paid;
    }

    public float getBalanceRemaining() {
        return paid - amount;
    }

    public void setBalanceRemaining(float balanceRemaining) {
        this.balanceRemaining = balanceRemaining;
    }

    @Override
    public String toString() {
        return "RentalFee{" +
                "seq_id=" + seq_id +
                ", date='" + date + '\'' +
                ", record='" + record + '\'' +
                ", amount=" + amount +
                ", paid=" + paid +
                ", balanceRemaining=" + balanceRemaining +
                '}';
    }
}
