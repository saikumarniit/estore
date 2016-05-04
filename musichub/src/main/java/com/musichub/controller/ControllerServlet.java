package com.musichub.controller;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;  
@Controller  
public class ControllerServlet {  
    @RequestMapping("/")  
    public ModelAndView index() {  
        String message = "index page called";  
        System.out.println(message);
        return new ModelAndView("index", "message", message);  
    }  
    @RequestMapping("/SignUp")  
    public ModelAndView signUp() {  
        String message = "Sign Up Page called";  
        System.out.println(message);
        return new ModelAndView("SignUp", "message", message);  
    }  
    @RequestMapping("/AboutUs")  
    public ModelAndView aboutUs() {  
        String message = "about us page called";  
        System.out.println(message);
        return new ModelAndView("AboutUs", "message", message);  
    }  
    @RequestMapping("/Login")  
    public ModelAndView login() {  
        String message = "Login page called";  
        System.out.println(message);
        return new ModelAndView("Login", "message", message);  
    }  
    @RequestMapping("/product")  
    public ModelAndView product() {  
        String message = "product page called";  
        
        System.out.println(message);
        return new ModelAndView("product", "message", message);  
    }  
}  