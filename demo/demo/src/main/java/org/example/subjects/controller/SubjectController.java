package org.example.subjects.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.example.subjects.model.Subject;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {
    private static final Logger logger = LoggerFactory.getLogger(SubjectController.class);
    private final List<Subject> subjectsList = new ArrayList<>();
    private final List<String> communicationLogs = new ArrayList<>();

    @PostMapping
    public ResponseEntity<String> createSubject(@RequestBody Subject subject) {
        logCommunication("POST", "/api/subjects", subject.toString(), "201 Created", "Subject created");
        // Logic to add subject to the list
        logger.info("Creating subject: {}", subject.getName());
        return ResponseEntity.status(HttpStatus.CREATED).body("Subject created");
    }

    @GetMapping
    public List<Subject> getAllSubjects() {
        logCommunication("GET", "/api/subjects", "", "200 OK", subjectsList.toString());
        logger.info("Retrieving all subjects");
        return subjectsList;
    }

    private void logCommunication(String method, String resource, String requestBody, String responseCode, String responseBody) {
        String log = "Method: " + method + "\n" +
                "Resource: " + resource + "\n" +
                "Request Body: " + requestBody + "\n" +
                "Response Code: " + responseCode + "\n" +
                "Response Body: " + responseBody + "\n" +
                "------------\n";
        communicationLogs.add(log);
    }
}



