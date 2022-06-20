package my.edu.xmu.hms.hostel;

import javax.persistence.*;

@Entity
@Table
public class Hostel {
    @Id
    @SequenceGenerator(
            name = "hostel_sequence",
            sequenceName = "hostel_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "hostel_sequence"
    )
    private Long seq_id;
    private String block;
    private String floor;
    private String room_no;
    private String room_id;
    private String user_id;
    private String status;
    private String wing_no;
    private String room_type;

    public Hostel() {
    }

    public Hostel(String block, String floor, String room_no, String room_id, String user_id, String status, String wing_no, String room_type) {
        this.block = block;
        this.floor = floor;
        this.room_no = room_no;
        this.room_id = room_id;
        this.user_id = user_id;
        this.status = status;
        this.wing_no = wing_no;
        this.room_type = room_type;
    }

    public Long getSeq_id() {
        return seq_id;
    }

    public void setSeq_id(Long seq_id) {
        this.seq_id = seq_id;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWing_no() {
        return wing_no;
    }

    public void setWing_no(String wing_no) {
        this.wing_no = wing_no;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "seq_id=" + seq_id +
                ", block='" + block + '\'' +
                ", floor='" + floor + '\'' +
                ", room_no='" + room_no + '\'' +
                ", room_id='" + room_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", status='" + status + '\'' +
                ", wing_no='" + wing_no + '\'' +
                ", room_type='" + room_type + '\'' +
                '}';
    }
}
