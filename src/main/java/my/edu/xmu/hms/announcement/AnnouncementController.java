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

    @PutMapping("{seq_id}")
    public List<Announcement> updateAnnouncement(@PathVariable Long seq_id, @RequestBody Announcement announcement){
        return announcementService.updateAnnouncement(seq_id, announcement);
    }
}
