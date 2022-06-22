package my.edu.xmu.hms.announcement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementService {
    private final AnnouncementRepository announcementRepository;

    @Autowired
    public AnnouncementService(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    public List<Announcement> getAnnouncements(){
        return announcementRepository.findAll();
    }

    public List<Announcement> updateAnnouncement(Long seq_id, Announcement announcement){
        Announcement announcementById = announcementRepository.findById(seq_id).get();
        announcementById.setTitle(announcement.getTitle());
        announcementRepository.save(announcement);
        return announcementRepository.findAll();
    }
}
