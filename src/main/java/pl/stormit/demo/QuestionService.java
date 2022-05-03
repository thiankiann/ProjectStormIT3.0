package pl.stormit.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QuestionService {

    public List<Questions> getQuestions() {
        return Arrays.asList( new Questions("Question 1" ), new Questions("Question 2"));
    }
}
