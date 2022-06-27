package my.edu.xmu.hms.applicationRequest;

import javax.persistence.*;

@Entity
@Table
public class ApplicationRequest {
    @Id
    @SequenceGenerator(
            name = "application_request_sequence",
            sequenceName = "application_request_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "application_request_sequence"
    )
    private Long applicationId;
    private String category;
    private Boolean isExistingStudent;
    private String studentId;
    private String fullname;
    private String nickname;
    private String nricPassport;
    private String gender;
    private String dob;
    private String nationality;
    private String programme;
    private String enrollmentDate;
    private String email;
    private String phoneNo;
    private String address;
    private String parentName1;
    private String parentName2;
    private String relationship1;
    private String relationship2;
    private String parentMobile1;
    private String parentMobile2;
    private Boolean isSelectedBlockD;
    private String roommateName;
    private String roommatePhoneNo;
    private String roommateNricPassport;
    private String remarks;
    private String status;
    private String startDate;
    private String endDate;
    private String modifyDate;

    public ApplicationRequest() {
    }

    public ApplicationRequest(String category, Boolean isExistingStudent, String studentId, String fullname, String nickname, String nricPassport, String gender, String dob, String nationality, String programme, String enrollmentDate, String email, String phoneNo, String address, String parentName1, String parentName2, String relationship1, String relationship2, String parentMobile1, String parentMobile2, Boolean isSelectedBlockD, String roommateName, String roommatePhoneNo, String roommateNricPassport, String remarks, String status) {
        this.category = category;
        this.isExistingStudent = isExistingStudent;
        this.studentId = studentId;
        this.fullname = fullname;
        this.nickname = nickname;
        this.nricPassport = nricPassport;
        this.gender = gender;
        this.dob = dob;
        this.nationality = nationality;
        this.programme = programme;
        this.enrollmentDate = enrollmentDate;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
        this.parentName1 = parentName1;
        this.parentName2 = parentName2;
        this.relationship1 = relationship1;
        this.relationship2 = relationship2;
        this.parentMobile1 = parentMobile1;
        this.parentMobile2 = parentMobile2;
        this.isSelectedBlockD = isSelectedBlockD;
        this.roommateName = roommateName;
        this.roommatePhoneNo = roommatePhoneNo;
        this.roommateNricPassport = roommateNricPassport;
        this.remarks = remarks;
        this.status = status;
    }

    public ApplicationRequest(Long applicationId, String category, Boolean isExistingStudent, String studentId, String fullname, String nricPassport, String gender, String dob, String nationality, String programme, String enrollmentDate, String email, String phoneNo, String address, String status, String startDate, String endDate, String modifyDate) {
        this.applicationId = applicationId;
        this.category = category;
        this.isExistingStudent = isExistingStudent;
        this.studentId = studentId;
        this.fullname = fullname;
        this.nricPassport = nricPassport;
        this.gender = gender;
        this.dob = dob;
        this.nationality = nationality;
        this.programme = programme;
        this.enrollmentDate = enrollmentDate;
        this.email = email;
        this.phoneNo = phoneNo;
        this.address = address;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.modifyDate = modifyDate;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public Boolean getExistingStudent() {
        return isExistingStudent;
    }

    public void setExistingStudent(Boolean existingStudent) {
        isExistingStudent = existingStudent;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNricPassport() {
        return nricPassport;
    }

    public void setNricPassport(String nricPassport) {
        this.nricPassport = nricPassport;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getParentName1() {
        return parentName1;
    }

    public void setParentName1(String parentName1) {
        this.parentName1 = parentName1;
    }

    public String getParentName2() {
        return parentName2;
    }

    public void setParentName2(String parentName2) {
        this.parentName2 = parentName2;
    }

    public String getRelationship1() {
        return relationship1;
    }

    public void setRelationship1(String relationship1) {
        this.relationship1 = relationship1;
    }

    public String getRelationship2() {
        return relationship2;
    }

    public void setRelationship2(String relationship2) {
        this.relationship2 = relationship2;
    }

    public String getParentMobile1() {
        return parentMobile1;
    }

    public void setParentMobile1(String parentMobile1) {
        this.parentMobile1 = parentMobile1;
    }

    public String getParentMobile2() {
        return parentMobile2;
    }

    public void setParentMobile2(String parentMobile2) {
        this.parentMobile2 = parentMobile2;
    }

    public Boolean getSelectedBlockD() {
        return isSelectedBlockD;
    }

    public void setSelectedBlockD(Boolean selectedBlockD) {
        isSelectedBlockD = selectedBlockD;
    }

    public String getRoommateName() {
        return roommateName;
    }

    public void setRoommateName(String roommateName) {
        this.roommateName = roommateName;
    }

    public String getRoommatePhoneNo() {
        return roommatePhoneNo;
    }

    public void setRoommatePhoneNo(String roommatePhoneNo) {
        this.roommatePhoneNo = roommatePhoneNo;
    }

    public String getRoommateNricPassport() {
        return roommateNricPassport;
    }

    public void setRoommateNricPassport(String roommateNricPassport) {
        this.roommateNricPassport = roommateNricPassport;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "ApplicationRequest{" +
                "applicationId=" + applicationId +
                ", category='" + category + '\'' +
                ", isExistingStudent=" + isExistingStudent +
                ", studentId='" + studentId + '\'' +
                ", fullname='" + fullname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", nricPassport='" + nricPassport + '\'' +
                ", gender='" + gender + '\'' +
                ", dob='" + dob + '\'' +
                ", nationality='" + nationality + '\'' +
                ", programme='" + programme + '\'' +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", address='" + address + '\'' +
                ", parentName1='" + parentName1 + '\'' +
                ", parentName2='" + parentName2 + '\'' +
                ", relationship1='" + relationship1 + '\'' +
                ", relationship2='" + relationship2 + '\'' +
                ", parentMobile1='" + parentMobile1 + '\'' +
                ", parentMobile2='" + parentMobile2 + '\'' +
                ", isSelectedBlockD=" + isSelectedBlockD +
                ", roommateName='" + roommateName + '\'' +
                ", roommatePhoneNo='" + roommatePhoneNo + '\'' +
                ", roommateNricPassport='" + roommateNricPassport + '\'' +
                ", remarks='" + remarks + '\'' +
                ", status='" + status + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                '}';
    }
}
