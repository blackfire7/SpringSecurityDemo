package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TemplateController {

    @GetMapping("login")
    public String getLogin() {
<<<<<<< HEAD
        return "Login";
=======
        return "login";
>>>>>>> Form-Based-Authentication
    }

    @GetMapping("courses")
    public String getCourses() {
        return "courses";
    }
}
