package com.work.demo.web;

import com.work.demo.exception.RecordNotFoundException;
import com.work.demo.model.Subject;
import com.work.demo.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Subject> getSubjectById(@PathVariable Long id) {
        try {
            Subject subject = subjectService.getSubjectById(id);
            return ResponseEntity.ok(subject);
        } catch (RecordNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<String> createSubject(@RequestBody Subject subject) {
        Subject createdSubject = subjectService.createOrUpdateSubject(subject);
        return ResponseEntity.ok("Subject created successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSubjectById(@PathVariable Long id) {
        try {
            subjectService.deleteSubjectById(id);
            return ResponseEntity.ok("Subject deleted successfully");
        } catch (RecordNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
