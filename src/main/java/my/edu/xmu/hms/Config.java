package my.edu.xmu.hms;

import my.edu.xmu.hms.faq.Faq;
import my.edu.xmu.hms.faq.FaqRepository;
import my.edu.xmu.hms.feedback.Feedback;
import my.edu.xmu.hms.feedback.FeedbackRepository;
import my.edu.xmu.hms.admin.Admin;
import my.edu.xmu.hms.admin.AdminRepository;
import my.edu.xmu.hms.announcement.Announcement;
import my.edu.xmu.hms.announcement.AnnouncementRepository;
import my.edu.xmu.hms.applicationRequest.ApplicationRequest;
import my.edu.xmu.hms.applicationRequest.ApplicationRequestRepository;
import my.edu.xmu.hms.hostel.Hostel;
import my.edu.xmu.hms.hostel.HostelRepository;
import my.edu.xmu.hms.hostelrate.HostelRate;
import my.edu.xmu.hms.hostelrate.HostelRateRepository;
import my.edu.xmu.hms.maintenanceRequest.MaintenanceRequest;
import my.edu.xmu.hms.maintenanceRequest.MaintenanceRequestRepository;
import my.edu.xmu.hms.rentalfee.RentalFee;
import my.edu.xmu.hms.rentalfee.RentalFeeRepository;
import my.edu.xmu.hms.student.Student;
import my.edu.xmu.hms.student.StudentRepository;
import my.edu.xmu.hms.user.UserDetail;
import my.edu.xmu.hms.user.UserDetailRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {

    @Bean
    CommandLineRunner commandLineRunner(
            UserDetailRepository userDetailRepository,
            AdminRepository adminRepository,
            StudentRepository studentRepository,
            HostelRateRepository hostelRateRepository,
            RentalFeeRepository rentalFeeRepository,
            AnnouncementRepository announcementRepository,
            HostelRepository hostelRepository,
            ApplicationRequestRepository applicationRequestRepository,
            MaintenanceRequestRepository maintenanceRequestRepository,
            FeedbackRepository feedbackRepository,
            FaqRepository faqRepository
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
                    "admin1234"
            );

            UserDetail userDetail3=new UserDetail(
                    "753F673",
                    "admin",
                    "admin1234"
            );

            UserDetail userDetail4=new UserDetail(
                    "F75JF7Y",
                    "admin",
                    "admin1234"
            );

            UserDetail userDetail5=new UserDetail(
                    "A6JK1G7",
                    "admin",
                    "admin1234"
            );

            UserDetail userDetail6=new UserDetail(
                    "65UT852",
                    "admin",
                    "admin1234"
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
                    "2019-6-24 10:35:55"
            );

            Admin admin2=new Admin(
                    "F75JF7Y",
                    "Admin",
                    "Loh",
                    "Admin Loh",
                    "2018-9-14 12:21:46"
            );

            Admin admin3=new Admin(
                    "A6JK1G7",
                    "Admin",
                    "Hong",
                    "Admin Hong",
                    "2018-1-24 9:19:23"
            );

            Admin admin4=new Admin(
                    "65UT852",
                    "Admin",
                    "Siti",
                    "Admin Siti",
                    "2017-7-13 9:6:31"
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
                    "18, Jalan Aman Perdana 6H/KU5, Taman Aman Perdana, 41050, Klang, Selangor",
                    "Single",
                    "Buddhist"
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
                    "7 Jln Raya 81400 Senai Senai Johor 81400 Malaysia Senai Johor 81400 Malaysia",
                    "Single",
                    "Buddhist"
            );

            studentRepository.saveAll(
                    List.of(student,student1)
            );

            HostelRate hostelRate = new HostelRate(340,390);

            hostelRateRepository.save(hostelRate);

            RentalFee rentalFee = new RentalFee("14-4-2018","Deposit",500,500);
            RentalFee rentalFee1 = new RentalFee("1-8-2018","Rental- Semester 2",1360,1360);
            RentalFee rentalFee2 = new RentalFee("3-12-2018","Rental- Semester 3",1360,1360);
            RentalFee rentalFee3 = new RentalFee("3-12-2018","Rental- Semester 3",1360,1360);
            RentalFee rentalFee4 = new RentalFee("11-4-2019","Rental- Semester 1",1700,1700);
            RentalFee rentalFee5 = new RentalFee("16-9-2019","Rental- Semester 2",1700,1700);
            RentalFee rentalFee6 = new RentalFee("10-2-2020","Rental- Semester 3",680,680);

            rentalFeeRepository.saveAll(List.of(rentalFee,rentalFee1,rentalFee2,rentalFee3,rentalFee4,rentalFee5,rentalFee6));

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
                    "Twin sharing room (Block D) with en-suite bathroom",
                    "2019-03-26",
                    "9:28",
                    "2023-03-20"
            );

            Hostel hostel1= new Hostel(
                    "LY5",
                    "3",
                    "A306",
                    "LY5-A306",
                    "swe1234567",
                    "Active",
                    "A",
                    "Twin sharing room (Block LY) with en-suite bathroom",
                    "2016-08-24",
                    "10:56",
                    "2020-08-22"
            );

            hostelRepository.saveAll(
                    List.of(hostel,hostel1)
            );

            ApplicationRequest applicationRequest = new ApplicationRequest(
                    "Application",
                    true,
                    "swe5478674",
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
                    "swe6543210",
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
                    "Checkout",
                    true,
                    "swe1904867",
                    "Ng Yoo Wee",
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
                    "Parent",
                    "012-3452445",
                    "Pending",
                    "2019-03-26",
                    "2023-03-20",
                    "2022-07-20",
                    "9:30",
                    "End of degree studies",
                    true,
                    "na",
                    "Single",
                    "D2-D505"
            );

            ApplicationRequest applicationRequest4 = new ApplicationRequest(
                    "Exchange Room",
                    "D2-D505",
                    "9:30",
                    true,
                    "swe3456789",
                    "Ng Yoo Wee",
                    "012345-01-12343",
                    "Male",
                    "7/8/2000",
                    "Malaysian",
                    "Bachelor in Software Engineering",
                    "2019/04",
                    "swe1904867@xmu.edu.my",
                    "016-2351564",
                    "18, Jalan Aman Perdana 6H/KU5, Taman Aman Perdana, 41050, Klang, Selangor",
                    "Pending",
                    "2019-03-26",
                    "2023-03-20",
                    "2022-07-20",
                    "9:30",
                    "End of degree studies",
                    "D3-D502",
                    true,
                    "na",
                    "Single",
                    "Buddhist"
            );

            ApplicationRequest applicationRequest5 = new ApplicationRequest(
                    "Change Period",
                    "swe2345678",
                    "Ng Yoo Wee",
                    "012345-01-12343",
                    "Male",
                    "7/8/2000",
                    "Malaysian",
                    "Bachelor in Software Engineering",
                    "2019/04",
                    "swe1904867@xmu.edu.my",
                    "016-2351564",
                    "18, Jalan Aman Perdana 6H/KU5, Taman Aman Perdana, 41050, Klang, Selangor",
                    "Pending",
                    "2019-03-26",
                    "2023-03-20",
                    "2022-07-20",
                    true,
                    "na",
                    "Buddhist",
                    true,
                    "Single"
            );

            ApplicationRequest applicationRequest6 = new ApplicationRequest(
                    "Checkout",
                    true,
                    "swe1904867",
                    "Ng Yoo Wee",
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
                    "Parent",
                    "012-3452445",
                    "Rejected",
                    "2019-03-26",
                    "2023-03-20",
                    "2022-07-20",
                    "9:30",
                    "End of degree studies",
                    true,
                    "na",
                    "Single",
                    "D2-D505"
            );

            ApplicationRequest applicationRequest7 = new ApplicationRequest(
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
                    false,
                    "Zi",
                    "016-3563357",
                    "980314-01-4636",
                    "na",
                    "Approved"
            );

            applicationRequestRepository.saveAll(List.of(applicationRequest,
                    applicationRequest1,applicationRequest2,applicationRequest3,
                    applicationRequest4, applicationRequest5, applicationRequest6,
                    applicationRequest7));

            MaintenanceRequest maintenanceRequest = new MaintenanceRequest(
                    "swe1904867",
                    "Ng Yoo Wee",
                    "swe1904867@xmu.edu.my",
                    "016-2351564",
                    "Air Conditioner",
                    "no",
                    "D2-D505",
                    "Water dripping from air conditioner",
                    "",
                    "Solved",
                    "DONE- repair drain pipe leaking",
                    "11-9-2019"
            );

            MaintenanceRequest maintenanceRequest1 = new MaintenanceRequest(
                    "swe1904867",
                    "Ng Yoo Wee",
                    "swe1904867@xmu.edu.my",
                    "016-2351564",
                    "Fitting and Plumbing",
                    "no",
                    "D2-D505",
                    "Basin stuck and overflow",
                    "",
                    "Solved",
                    "Work done on 28 May 2020",
                    "24-5-2020"
            );

            MaintenanceRequest maintenanceRequest2 = new MaintenanceRequest(
                    "swe1904867",
                    "Ng Yoo Wee",
                    "swe1904867@xmu.edu.my",
                    "016-2351564",
                    "Fitting and Plumbing",
                    "no",
                    "D2-D505",
                    "Sink blockage and faucet leakage",
                    "",
                    "Solved",
                    "Job complete on 9 August 2020",
                    "7-7-2020"
            );

            maintenanceRequestRepository.saveAll(List.of(maintenanceRequest, maintenanceRequest1, maintenanceRequest2));

            Feedback feedback = new Feedback("Slow work process",
                    "I have send a request for two months but still does not get reply regarding the application.",
                    "");

            feedbackRepository.saveAll(List.of(feedback));

            Faq faq = new Faq(
                    "Is on-campus accommodation provided?",
                    "XMUM provides on-campus accommodation to all registered students. Students are encouraged to live in campus residences, as living on campus facilitates participation in extra-curricular activities."
            );

            Faq faq1 = new Faq(
                    "How much is the rental?",
                    "The rental ranges from RM 340 to RM 390 per month. Each of the registered student who lives in the campus residences is required to pay a deposit of RM500 (refundable) together with one-semester rental upon check-in."
            );

            Faq faq2 = new Faq(
                    "What security precautions does the University take on campus?",
                    "The hostel is guarded by security guards and is under 24 hour CCTV surveillance. Students need to get through by their Student ID card. Unauthorized guests are barred from entering in the compound of student hostels."
            );

            Faq faq3 = new Faq(
                    "Do students need to observe any curfew regulation?",
                    "The curfew set for the residences is 12:00 am. Residents who wish to leave or return to the campus ground after 12:00 am must report at the guardhouse with their student IDs."
            );

            Faq faq4 = new Faq(
                    "Are there any laundry facilities available?",
                    "Yes, there is a laundry room on the ground floor of each block, providing high-efficiency and fully automatic washing machines and dryers. The machines are coin-operated (RM 4 per barrel)."
            );

            Faq faq5 = new Faq(
                    "Are students allowed to stay in the hostel during semester breaks?",
                    "Yes, students can stay on campus during semester breaks."
            );

            Faq faq6 = new Faq(
                    "Do students need to bring their own cleaning supplies to clean their rooms?",
                    "Yes, students need to bring cleaning supplies, as they are responsible for the tidiness and cleanliness of their own bedrooms."
            );

            Faq faq7 = new Faq(
                    "Is mattress provided in the room?",
                    "Yes, we provide quality mattress. However, students need to bring their own pillows and other necessary bedding items."
            );

            Faq faq8 = new Faq(
                    "Is electric fan allowed to be used in the hostel room?",
                    "There is an air-conditioner in each room. If it is necessary, students may bring their own electric fan."
            );

            faqRepository.saveAll(List.of(faq,faq1,faq2,faq3,faq4,faq5,faq6,faq7,faq8));
        };
    }
}
