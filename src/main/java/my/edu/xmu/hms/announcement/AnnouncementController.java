package my.edu.xmu.hms.announcement;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/announcement")
public class AnnouncementController {
    private final AnnouncementService announcementService;

    public AnnouncementController(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @GetMapping
    public List<Announcement> getAnnouncements(){
        return announcementService.getAnnouncements();
    }

    @PostMapping
    public List<Announcement> saveAnnouncement(@RequestBody Announcement announcement){
        return announcementService.saveAnnouncement(announcement);
    }

    @PutMapping("{seq_id}")
    public List<Announcement> updateAnnouncement(@PathVariable Long seq_id, @RequestBody Announcement announcementDetails){
        return announcementService.updateAnnouncement(seq_id, announcementDetails);
    }

    @DeleteMapping("{seq_id}")
    public List<Announcement> deleteAnnouncement(@PathVariable Long seq_id){
        return announcementService.deleteAnnouncement(seq_id);
    }
}
