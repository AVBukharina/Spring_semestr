package ru.itis.springbootdemo.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Blog {
    @GetMapping("/blog")
    public String getThanksPage(){
        return "blog";
    }
}
