package my.edu.xmu.hms.announcement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AnnouncementService {
    private final AnnouncementRepository announcementRepository;

    @Autowired
    public AnnouncementService(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    public List<Announcement> descendingListRecentToOld(List<Announcement> list){
        Collections.reverse(list);
        return list;
    }

    public List<Announcement> getAnnouncements(){
        return descendingListRecentToOld(announcementRepository.findAll());
    }

    public List<Announcement> saveAnnouncement(Announcement announcement){
        announcementRepository.save(announcement);
        return announcementRepository.findAll();
    }

    public List<Announcement> updateAnnouncement(Long seq_id, Announcement announcementDetails){
        if(announcementRepository.findById(seq_id).isPresent()){
            Announcement announcementById = announcementRepository.findById(seq_id).get();
            announcementById.setTitle(announcementDetails.getTitle());
            announcementById.setContent(announcementDetails.getContent());
            announcementById.setDateTime(announcementDetails.getDateTime());
            announcementRepository.save(announcementById);
            return announcementRepository.findAll();
        }
        throw new IllegalStateException("Illegal or missing request parameter");
    }

    public List<Announcement> deleteAnnouncement(Long seq_id){
        announcementRepository.deleteById(seq_id);
        return announcementRepository.findAll();
    }
}
