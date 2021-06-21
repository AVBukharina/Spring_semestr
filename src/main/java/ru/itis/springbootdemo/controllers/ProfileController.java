package ru.itis.springbootdemo.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.springbootdemo.security.details.UserDetailsImpl;



@Controller
public class ProfileController {
    @GetMapping("/profile")
    public String getProfile(Model model, @AuthenticationPrincipal UserDetailsImpl userDetails){
        model.addAttribute("userName", userDetails.getUsername());
        model.addAttribute("userFirstName", userDetails.getUserFirstName());
        model.addAttribute("userLastName", userDetails.getUserLastName());
        return "profile";
    }

}
