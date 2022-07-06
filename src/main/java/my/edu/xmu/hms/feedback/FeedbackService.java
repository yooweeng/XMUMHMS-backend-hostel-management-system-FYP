package my.edu.xmu.hms.feedback;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    private final FeedbackRepository feedbackRepository;

    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public List<Feedback> getFeedbacks(){
        return feedbackRepository.findAll();
    }

    public List<Feedback> saveFeedback(Feedback feedback){
        feedbackRepository.save(feedback);
        return feedbackRepository.findAll();
    }
}
