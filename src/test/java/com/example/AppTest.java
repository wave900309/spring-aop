package com.example;

import com.example.spring.aspect.Launcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Launcher.class)
@AutoConfigureMockMvc
public class AppTest {

    @Autowired
    private MockMvc mvc;

    static {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/usr/local/clazz");
    }

    @Test
    public void testWithoutAnnotations() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/aspect/specifiedMethod"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testHasAnnotations() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/aspect/hasAnnotations"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testLogToFile() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/aspect/fileLog")).andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void testSelfLog() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/aspect/selfLog")).andExpect(MockMvcResultMatchers.status().isOk());
    }
}
