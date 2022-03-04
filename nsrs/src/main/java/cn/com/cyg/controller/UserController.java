package cn.com.cyg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/userLogin")
    public String toLogin(){
        return "relogin";
    }

    @GetMapping("/log")
    public String log(){
        return "relogin";
    }

    @GetMapping("/logout")
    public String logout(){
        return "relogin";
    }
}