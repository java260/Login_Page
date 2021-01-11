
package com.meshal.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    
    
    // Show Login Page 
    @RequestMapping("/show-login")
    public String showPageForLogin(){
        return "login-form" ;
    }
    
    
    // Show welcome Page After Users Login
    @RequestMapping("/")
    public String showWelcomePage(){
        return "welcome-page" ;
    }
    
    
    
}
