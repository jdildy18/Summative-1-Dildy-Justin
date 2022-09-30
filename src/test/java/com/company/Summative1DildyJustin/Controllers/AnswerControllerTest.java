package com.company.Summative1DildyJustin.Controllers;

import com.company.Summative1DildyJustin.Models.Answer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class AnswerControllerTest {

    //Wiring the MockMvc object
    @Autowired
    private MockMvc mockMvc;

    //ObjectMapper used to convert Java objects to Json
    private ObjectMapper mapper = new ObjectMapper();

    //List of Answers
    private List<Answer> answerList;


    @Test
    public void shouldReturnAnswerOnPostRequest() throws Exception {

        //ARRANGE
        Answer inputAnswer = new Answer("You can make your own happiness", "What should I do today?",1);


        //CONVERT Java Object to Json
        String inputJson = mapper.writeValueAsString(inputAnswer);


        String outputJson = mapper.writeValueAsString(inputAnswer);

        //ACT
        mockMvc.perform(
                post("/magic")
                        .content(outputJson)
                        .contentType(MediaType.APPLICATION_JSON)
        )

                .andDo(print())
                .andExpect(status().isCreated());









    }

}
