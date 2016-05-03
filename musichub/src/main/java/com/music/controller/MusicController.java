package com.music.controller;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
@Controller  
public class MusicController {  
    @RequestMapping("/")  
    public ModelAndView index() {  
        String message = "index page called";  
        System.out.println(message);
        return new ModelAndView("index", "message", message);  
    }
    @RequestMapping("/AboutUs")  
    public ModelAndView aboutUs() {  
        String message = "About Us page called";  
        System.out.println(message);
        return new ModelAndView("AboutUs", "message", message);  
    }
    @RequestMapping("/SignUp")  
    public ModelAndView signUp() {  
        String message = "SignUs page called";  
        System.out.println(message);
        return new ModelAndView("SignUp", "message", message);  
    }
    @RequestMapping("/Login")  
    public ModelAndView login() {  
        String message = "Login page called";  
        System.out.println(message);
        return new ModelAndView("Login", "message", message);  
    }
}  