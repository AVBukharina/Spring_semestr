package ru.itis.springbootdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.springbootdemo.dto.UserForm;
import ru.itis.springbootdemo.services.SignUpServices;

@Controller
public class SignUpController {

    @Autowired
    private SignUpServices signUpServices;

    @GetMapping("/signUp")
    public String getSignUpPage(){
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(UserForm form) {
        signUpServices.signUp(form);
        return "redirect:/signIn";
    }
}
