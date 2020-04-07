package com.sunderville.tanksmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogInController {

    @GetMapping("/")
    public String login(Model model) {
        model.addAttribute("title", "Главная страница");
        return "login";
    }

}
