package com.example.demo;

import com.example.subjects.model.Subject;
import org.example.subjects.controller.SubjectController;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = SubjectController.class)
class SubjectControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SubjectController subjectController;

    @Test
    public void testCreateSubject() throws Exception {
        // Prepare a subject to be created
        Subject subject = new Subject("UML", 5, "209", true);

        // Perform the POST request
        mockMvc.perform(MockMvcRequestBuilders.post("/api/subjects")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"UML\",\"ects\":5,\"roomNumber\":\"208\",\"hasExam\":true}"))
                .andExpect(status().isCreated())
                .andExpect(content().string("Subject created"));

        // Verify that the subjectController's createSubject method was called
        verify(subjectController, times(1)).createSubject(ArgumentMatchers.any(Subject.class));
    }

    @Test
    public void testGetAllSubjects() throws Exception {
        // Prepare a list of subjects
        List<Subject> subjects = new ArrayList<>();
        subjects.add(new Subject("UML", 5, "208", true));
        subjects.add(new Subject("CTech", 4, "205", true));

        // Mock the subjectController to return the list of subjects
        when(subjectController.getAllSubjects()).thenReturn(subjects);

        // Perform the GET request
        mockMvc.perform(MockMvcRequestBuilders.get("/api/subjects"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("UML"))
                .andExpect(jsonPath("$[1].name").value("CTech"));

        // Verify that the subjectController's getAllSubjects method was called
        verify(subjectController, times(1)).getAllSubjects();
    }
}
