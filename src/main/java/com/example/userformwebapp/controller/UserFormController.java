package com.example.userformwebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserFormController {

    @GetMapping("/")
    public String showForm() {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(
            @RequestParam String username,
            @RequestParam String email,
            @RequestParam String city,
            @RequestParam String mobile,
            Model model) {

        model.addAttribute("username", username);
        model.addAttribute("email", email);
        model.addAttribute("city", city);
        model.addAttribute("mobile", mobile);
        return "form";
    }
}

