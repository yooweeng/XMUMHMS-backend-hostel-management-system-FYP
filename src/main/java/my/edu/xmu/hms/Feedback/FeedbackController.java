package my.edu.xmu.hms.Feedback;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/feedback")
public class FeedbackController {

    private final FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping
    public List<Feedback> getFeedbacks(){
        return feedbackService.getFeedbacks();
    }

    @PostMapping
    public List<Feedback> saveFeedback(@RequestBody Feedback feedback){
        return feedbackService.saveFeedback(feedback);
    }
}
