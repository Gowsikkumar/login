package com.example.login.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class logincontroller {
    @GetMapping("/")
    public String hello(Model mod)
    {
        return "index";
    }
    @PostMapping("/log")
    public String log(@RequestParam("Name")String Name,@RequestParam("Email")String email,Model mod)
    {
        mod.addAttribute("Name",Name);
        mod.addAttribute("Email",email);
        return "login";
    }


}
