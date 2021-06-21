package ru.itis.springbootdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorksController {
    @GetMapping("/works")
    public String getThanksPage(){
        return "works";
    }
}
