package com.example.baskinrobbins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    public class BaskinrobbinsController {

        // @GetMapping("home")
        // public String home() {
        //     return "Hello";
        // }

        @RequestMapping("/")
        public String goIndex(){
            return "index.html";
        }

        @RequestMapping("/login")
        public String goLogin(){
            return "login.html";
        }
        
        
    }


