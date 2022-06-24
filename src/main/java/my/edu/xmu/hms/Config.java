package my.edu.xmu.hms;

import my.edu.xmu.hms.admin.Admin;
import my.edu.xmu.hms.admin.AdminRepository;
import my.edu.xmu.hms.announcement.Announcement;
import my.edu.xmu.hms.announcement.AnnouncementRepository;
import my.edu.xmu.hms.applicationRequest.ApplicationRequest;
import my.edu.xmu.hms.applicationRequest.ApplicationRequestRepository;
import my.edu.xmu.hms.hostel.Hostel;
import my.edu.xmu.hms.hostel.HostelRepository;
import my.edu.xmu.hms.student.Student;
import my.edu.xmu.hms.student.StudentRepository;
import my.edu.xmu.hms.user.UserDetail;
import my.edu.xmu.hms.user.UserDetailRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
import java.util.List;

@Configuration
public class Config {

    @Bean
    CommandLineRunner commandLineRunner(
            UserDetailRepository userDetailRepository,
            AdminRepository adminRepository,
            StudentRepository studentRepository,
            AnnouncementRepository announcementRepository,
            HostelRepository hostelRepository,
            ApplicationRequestRepository applicationRequestRepository
    ){
        return args -> {

            UserDetail userDetail=new UserDetail(
                    "swe1904867",
                    "student",
                    "test1234"
            );

            UserDetail userDetail1=new UserDetail(
                    "swe1234567",
                    "student",
                    "test1234"
            );

            UserDetail userDetail2=new UserDetail(
                    "admin",
                    "admin",
                    "test1234"
            );

            UserDetail userDetail3=new UserDetail(
                    "753F673",
                    "admin",
                    "test1234"
            );

            UserDetail userDetail4=new UserDetail(
                    "F75JF7Y",
                    "admin",
                    "test1234"
            );

            UserDetail userDetail5=new UserDetail(
                    "A6JK1G7",
                    "admin",
                    "test1234"
            );

            UserDetail userDetail6=new UserDetail(
                    "65UT852",
                    "admin",
                    "test1234"
            );

            userDetailRepository.saveAll(
                    List.of(userDetail, userDetail1, userDetail2, userDetail3, userDetail4, userDetail5, userDetail6)
            );

            Admin admin=new Admin(
                    "admin",
                    "Admin",
                    "Ng",
                    "Admin Ng",
                    "2019-11-24 11:25:12"

            );

            Admin admin1=new Admin(
                    "753F673",
                    "Admin",
                    "Wong",
                    "Admin Wong",
                    "2019-06-24 10:35:55"
            );

            Admin admin2=new Admin(
                    "F75JF7Y",
                    "Admin",
                    "Loh",
                    "Admin Loh",
                    "2018-09-14 12:21:46"
            );

            Admin admin3=new Admin(
                    "A6JK1G7",
                    "Admin",
                    "Hong",
                    "Admin Hong",
                    "2018-01-24 09:19:23"
            );

            Admin admin4=new Admin(
                    "65UT852",
                    "Admin",
                    "Siti",
                    "Admin Siti",
                    "2017-07-13 09:06:31"
            );

            adminRepository.saveAll(List.of(admin,admin1,admin2,admin3,admin4));

            Student student=new Student(
                    "swe1904867",
                    "swe1904867@xmu.edu.my",
                    "Yoo Wee",
                    "Ng",
                    "Active",
                    "Malaysian",
                    "Ng Yoo Wee",
                    "012345-01-12343",
                    "Bachelor in Software Engineering",
                    "016-2351564",
                    "Male",
                    "7/8/2000",
                    "2019/04",
                    "18, Jalan Aman Perdana 6H/KU5, Taman Aman Perdana, 41050, Klang, Selangor"
            );

            Student student1=new Student(
                    "swe1234567",
                    "swe1234567@xmu.edu.my",
                    "1",
                    "Tester",
                    "Active",
                    "Malaysian",
                    "Tester 1",
                    "633225-01-12343",
                    "Bachelor in Electrical Engineering",
                    "012-3456789",
                    "Female",
                    "1/1/2000",
                    "2018/09",
                    "7 Jln Raya 81400 Senai Senai Johor 81400 Malaysia Senai Johor 81400 Malaysia"
            );

            studentRepository.saveAll(
                    List.of(student,student1)
            );

            Announcement announcement = new Announcement(
                    "2021-09-22T03:22:24.681Z",
                    "Notice of Water Disruption",
                    "Kindly be informed that there will be water disruption on below stated date & time.\n\n" +
                            "Date: 22nd September 2021 (Wednesday)\n" +
                            "Time: 11.00a.m to 5.00p.m\n" +
                            "Reason: Fix water tank pump for incoming water"
            );

            Announcement announcement1 = new Announcement(
                    "2022-06-21T01:33:46.000Z",
                    "Notice of Clean Maintenance",
                    "Kindly be informed that the following blocks will under go clean maintenance in the upcoming weeks:-\n\n" +
                            "Time: 11.00a.m to 5.00p.m\n" +
                            "Location: Block D2, D3, D5\n" +
                            "Reason: Clean maintenance"
            );

            announcementRepository.saveAll(List.of(announcement, announcement1));

            Hostel hostel= new Hostel(
                    "D2",
                    "5",
                    "D505",
                    "D2-D505",
                    "swe1904867",
                    "Active",
                    "D",
                    "Twin sharing room (Block D) with en-suite bathroom"
            );

            Hostel hostel1= new Hostel(
                    "LY5",
                    "3",
                    "A306",
                    "LY5-A306",
                    "swe1234567",
                    "Active",
                    "A",
                    "Twin sharing room (Block LY) with en-suite bathroom"
            );

            hostelRepository.saveAll(
                    List.of(hostel,hostel1)
            );

            ApplicationRequest applicationRequest = new ApplicationRequest(
                    "Application",
                    true,
                    "swe1904867",
                    "Ng Yoo Wee",
                    "yoowee",
                    "012345-01-12343",
                    "Male",
                    "7/8/2000",
                    "Malaysian",
                    "Bachelor in Software Engineering",
                    "2019/04",
                    "swe1904867@xmu.edu.my",
                    "016-2351564",
                    "18, Jalan Aman Perdana 6H/KU5, Taman Aman Perdana, 41050, Klang, Selangor",
                    "Khoo",
                    "Ng",
                    "Parent",
                    "Parent",
                    "012-3456789",
                    "016-3567889",
                    true,
                    "Zi",
                    "016-3563357",
                    "980314-01-4636",
                    "na",
                    "Pending"
            );

            ApplicationRequest applicationRequest1 = new ApplicationRequest(
                    "Application",
                    true,
                    "swe1234567",
                    "Tester 1",
                    "tester1",
                    "633225-01-12343",
                    "Female",
                    "1/1/2000",
                    "Malaysian",
                    "Bachelor in Electrical Engineering",
                    "2018/09",
                    "swe1234567@xmu.edu.my",
                    "012-3456789",
                    "7 Jln Raya 81400 Senai Senai Johor 81400 Malaysia Senai Johor 81400 Malaysia",
                    "Hor",
                    "Nge",
                    "Parent",
                    "Parent",
                    "012-3456789",
                    "016-3567889",
                    true,
                    "Haw",
                    "016-3563357",
                    "980314-01-4636",
                    "na",
                    "Approved"
            );

            ApplicationRequest applicationRequest2 = new ApplicationRequest(
                    "Application",
                    true,
                    "swe1234567",
                    "Tester 1",
                    "tester1",
                    "633225-01-12343",
                    "Female",
                    "1/1/2000",
                    "Malaysian",
                    "Bachelor in Electrical Engineering",
                    "2018/09",
                    "swe1234567@xmu.edu.my",
                    "012-3456789",
                    "7 Jln Raya 81400 Senai Senai Johor 81400 Malaysia Senai Johor 81400 Malaysia",
                    "Hor",
                    "Nge",
                    "Parent",
                    "Parent",
                    "012-3456789",
                    "016-3567889",
                    false,
                    "Haw",
                    "016-3563357",
                    "980314-01-4636",
                    "na",
                    "Rejected"
            );

            ApplicationRequest applicationRequest3 = new ApplicationRequest(
                    "Application",
                    true,
                    "swe1904867",
                    "Ng Yoo Wee",
                    "yoowee",
                    "012345-01-12343",
                    "Male",
                    "7/8/2000",
                    "Malaysian",
                    "Bachelor in Software Engineering",
                    "2019/04",
                    "swe1904867@xmu.edu.my",
                    "016-2351564",
                    "18, Jalan Aman Perdana 6H/KU5, Taman Aman Perdana, 41050, Klang, Selangor",
                    "Khoo",
                    "Ng",
                    "Parent",
                    "Parent",
                    "012-3456789",
                    "016-3567889",
                    true,
                    "Zi",
                    "016-3563357",
                    "980314-01-4636",
                    "na",
                    "Pending"
            );

            applicationRequestRepository.saveAll(List.of(applicationRequest,applicationRequest1,applicationRequest2,applicationRequest3));
        };
    }
}
