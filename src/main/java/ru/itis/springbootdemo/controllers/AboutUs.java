package ru.itis.springbootdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUs {
    @GetMapping("/aboutUs")
    public String getThanksPage(){
        return "aboutUs";
    }
}
