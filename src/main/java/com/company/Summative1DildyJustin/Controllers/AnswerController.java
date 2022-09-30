package com.company.Summative1DildyJustin.Controllers;

import com.company.Summative1DildyJustin.Models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class AnswerController {
    private  List<Answer> answerList;
    private static int idCounter = 1;

    public static int randomInt() {
        Random rand = new Random();
        return rand.nextInt(6);
    }

    public AnswerController() {
        answerList = new ArrayList<>();

        answerList.add(new Answer("You can make your own happiness"," What should I do today?",idCounter++));
        answerList.add(new Answer("Its amazing how much good you can do if you don't care who gets the credit.","What will the weather be like?",idCounter++));
        answerList.add(new Answer("The greatest risk is not taking one.","How will my day go today?",idCounter++));
        answerList.add(new Answer("You will conquer obstacles to achieve success.","Why is it raining this weekend?",idCounter++));
        answerList.add(new Answer("You will be called in to fulfill a position of high honor and responsibility","Will good luck happen for me this month?",idCounter++));
        answerList.add(new Answer("Our deeds determine us as much as we determine our deeds."," What grade will I end this class with?",idCounter++));

    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public String getAnswer() {
        return answerList.get(randomInt()).getAnswer();

    }
}
