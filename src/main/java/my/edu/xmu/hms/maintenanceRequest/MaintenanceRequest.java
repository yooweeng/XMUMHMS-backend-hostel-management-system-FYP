package my.edu.xmu.hms.maintenanceRequest;

import javax.persistence.*;

@Entity
@Table
public class MaintenanceRequest {
    @Id
    @SequenceGenerator(
            name = "maintenance_request_sequence",
            sequenceName = "maintenance_request_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "maintenance_request_sequence"
    )
    private Long mrId;
    private String campusId;
    private String studentName;
    private String email;
    private String phone;
    private String category;
    private String recurringProblem;
    private String roomNo;
    private String description;
    private String remarks;
    private String status;
    private String technicianComments;
    private String date;

    public MaintenanceRequest() {
    }

    public MaintenanceRequest(String campusId, String studentName, String email, String phone, String category, String recurringProblem, String roomNo, String description, String remarks, String status, String technicianComments, String date) {
        this.campusId = campusId;
        this.studentName = studentName;
        this.email = email;
        this.phone = phone;
        this.category = category;
        this.recurringProblem = recurringProblem;
        this.roomNo = roomNo;
        this.description = description;
        this.remarks = remarks;
        this.status = status;
        this.technicianComments = technicianComments;
        this.date = date;
    }

    public Long getMrId() {
        return mrId;
    }

    public void setMrId(Long mrId) {
        this.mrId = mrId;
    }

    public String getCampusId() {
        return campusId;
    }

    public void setCampusId(String campusId) {
        this.campusId = campusId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRecurringProblem() {
        return recurringProblem;
    }

    public void setRecurringProblem(String recurringProblem) {
        this.recurringProblem = recurringProblem;
    }

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTechnicianComments() {
        return technicianComments;
    }

    public void setTechnicianComments(String technicianComments) {
        this.technicianComments = technicianComments;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MaintenanceRequest{" +
                "mrId=" + mrId +
                ", campusId='" + campusId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", category='" + category + '\'' +
                ", recurringProblem='" + recurringProblem + '\'' +
                ", roomNo='" + roomNo + '\'' +
                ", description='" + description + '\'' +
                ", remarks='" + remarks + '\'' +
                ", status='" + status + '\'' +
                ", technicianComments='" + technicianComments + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
