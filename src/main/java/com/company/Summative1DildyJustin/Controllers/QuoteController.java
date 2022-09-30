package com.company.Summative1DildyJustin.Controllers;


import com.company.Summative1DildyJustin.Models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {
    private List<Quote> quoteList;

    private static int idCounter = 1;


    public static int randomInt(int minRandInt, int maxRandInt) {
        Random random = new Random();
        return random.ints(minRandInt, maxRandInt)
                .findFirst()
                .getAsInt();
    }

    public QuoteController() {
        quoteList = new ArrayList<>();


        quoteList.add(new Quote("Shakiya Friend", "Energy, makes your day or breaks your day.",  idCounter));
        quoteList.add(new Quote("Steve Job", "Innovation distinguishes between a leader and a follower.",  idCounter));
        quoteList.add(new Quote("Victoria Shand", "Minor Setbacks, Major Comebacks",  idCounter));
        quoteList.add(new Quote("Talor Whiting-Williams", "No one every changed the world by going with the flow.",  idCounter));
        quoteList.add(new Quote("Albert Einstein", "We cannot solve problems with the kind of thinking we employed when we came up with them.",  idCounter));
        quoteList.add(new Quote("Mahatma Gandhi", "Learn as if you will live forever, live like you will die tomorrow.",  idCounter));
        quoteList.add(new Quote("Mark Twain", "Stay away from people who will try to disparage your ambitions. Small minds will always do that, but great minds will give you a felling that you can become great too",  idCounter));
        quoteList.add(new Quote("Mike Tomlin", "The Standard... Is the Standard.",  idCounter));
        quoteList.add(new Quote("Winston Churchill", "Success is not final; failure is not fatal: It is the courage to continue that counts.",  idCounter));
        quoteList.add(new Quote("Mike Tomlin ","The Standard... Is the Standard.",  idCounter));
    }

    @RequestMapping(value = "/quote",method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public List<String> getQuote() {
        List<String> foundQuote = new ArrayList<>();

        int random  = randomInt(1,10);
        foundQuote.add(quoteList.get(random).getAuthor());
        foundQuote.add(quoteList.get(random).getQuote());
        return foundQuote;
    }


}
