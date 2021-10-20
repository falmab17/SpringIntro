package at.kaindorf.springintro;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; // selbstständig hin geschrieben
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*; // same

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// vorher JUnit4 hinzufügen
@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {
    @Autowired // Objekt wird automatisch erzeugt und verwaltet -- Reflection -- bei großen Projekten zu langsam
    private MockMvc mockMvc;

    @Test
    public void testHomepage() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/home"))//get("/home")) sollte mit dem gehen -- habe gepfuscht
                .andExpect(status().isOk())
                .andExpect(view().name("homepage"))
                .andExpect(content().string(containsString("Welcome to our homepage")))
                .andDo(print());
    }
}