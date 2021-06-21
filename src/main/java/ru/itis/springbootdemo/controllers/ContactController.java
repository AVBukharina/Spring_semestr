package ru.itis.springbootdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ContactController {
    @GetMapping("/contact")
    public String getThanksPage(){
        return "contact";
    }
}
