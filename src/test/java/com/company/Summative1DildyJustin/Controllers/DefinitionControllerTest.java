package com.company.Summative1DildyJustin.Controllers;

import com.company.Summative1DildyJustin.Models.Definition;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@RunWith(SpringRunner.class)
@WebMvcTest(DefinitionController.class)
public class DefinitionControllerTest {

    private List<Definition> definitionList;
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();


    @Test
    public void shouldReturnDefinitionOnGetRequest() throws Exception {

        // Convert Java object to JSON
        String outputJson = mapper.writeValueAsString(definitionList);

        // ACT
        mockMvc.perform(get("/definition"))                // Perform the GET request
                .andDo(print())                          // Print results to console
                .andExpect(status().isOk());


    }
}

