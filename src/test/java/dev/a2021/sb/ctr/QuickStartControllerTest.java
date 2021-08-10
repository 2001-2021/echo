package dev.a2021.sb.ctr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class QuickStartControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getHelloWorld() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hw").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Hello World!")));
    }

    @Test
    public void getNotThere() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/notthere").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError());
    }
}