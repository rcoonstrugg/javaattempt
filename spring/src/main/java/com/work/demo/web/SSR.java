package com.work.demo.web;

import java.util.List;

import com.work.demo.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.work.demo.service.SubjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class SSR {

    @Autowired
    SubjectService service;

    // this message we are reading from application.properties file
    // @Value("${subjects}")
    public List<Subject> subjects;

    @GetMapping("/")
    public String a(Model model) {
        this.subjects = service.getAllSubjects();
        Model employees = model.addAttribute("employees", this.subjects);
        return "employees_list"; // view name
    }
}