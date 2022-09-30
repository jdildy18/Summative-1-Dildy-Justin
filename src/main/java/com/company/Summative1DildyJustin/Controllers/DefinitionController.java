package com.company.Summative1DildyJustin.Controllers;

import com.company.Summative1DildyJustin.Models.Definition;
import com.company.Summative1DildyJustin.Models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



@RestController
public class DefinitionController {

    private List<Definition> definitionList;

    private static int idCounter = 1;

    public static int randomInt(int minRandInt, int maxRandInt) {
        Random random = new Random();
        return random.ints(minRandInt, maxRandInt)
                .findFirst()
                .getAsInt();
    }

    public DefinitionController() {
        definitionList = new ArrayList<>();

        definitionList.add(new Definition("Invisible", "Incapable of being seen:  not perceptible by vision. ", idCounter++));
        definitionList.add(new Definition("Eliminate", "To put an end to  or get rid of: Remove.", idCounter++));
        definitionList.add(new Definition("Replacement", "The action of process of replacing : the state of being replaced.", idCounter++));
        definitionList.add(new Definition("Calculation", "Studied care in analyzing or planning.", idCounter++));
        definitionList.add(new Definition("Flourish", "To grow luxuriantly.", idCounter++));
        definitionList.add(new Definition("Hardware", "major items of equipment (such as fittings, cutlery, tools, utensils, or parts of machines) made of metal.", idCounter++));
        definitionList.add(new Definition("Instrument", "Device used to produce music. ", idCounter++));
        definitionList.add(new Definition("Leftovers", "Something that remains unused or unconsumed, and is typically stored for a later time.", idCounter++));
        definitionList.add(new Definition("Explosion", "A large-scale, rapid, or spectacular expansion or bursting out or forth.", idCounter++));
        definitionList.add(new Definition("Terrified", "Cause to feel extreme terror or fear.",idCounter++));
    }


    @RequestMapping(value = "/definition",method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public List<String> getDefinition() {

        List<String> foundDefinition = new ArrayList<>();

       int random  = randomInt(1,10);
       foundDefinition.add(definitionList.get(random).getWord());
       foundDefinition.add(definitionList.get(random).getDefinition());
       return foundDefinition;


    }


}
