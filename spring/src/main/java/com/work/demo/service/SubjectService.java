package com.work.demo.service;

import com.work.demo.exception.RecordNotFoundException;
import com.work.demo.model.Subject;
import com.work.demo.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository repository;

    public List<Subject> getAllSubjects() {
        List<Subject> subjectList = repository.findAll();

        if (subjectList.size() > 0) {
            return subjectList;
        } else {
            return new ArrayList<Subject>();
        }
    }

    public Subject getSubjectById(Long id) throws RecordNotFoundException {
        Optional<Subject> subject = repository.findById(id);

        if (subject.isPresent()) {
            return subject.get();
        } else {
            throw new RecordNotFoundException("No subject record exist for given id");
        }
    }

    public Subject createOrUpdateSubject(Subject entity) {
        return repository.save(entity);
    }

    public void deleteSubjectById(Long id) throws RecordNotFoundException {
        Optional<Subject> subject = repository.findById(id);

        if (subject.isPresent()) {
            repository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No subject record exist for given id");
        }
    }
}
