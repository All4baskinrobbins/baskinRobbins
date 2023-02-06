package com.example.baskinrobbins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

    @Controller
    public class BaskinrobbinsController {

        Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	
        @RequestMapping("/join.do")
        public String goJoin() throws Exception {
            return "join";
        }

        @RequestMapping("/")
        public String goIndex(){
            return "index.html";
        }

        @RequestMapping("/login")
        public String goLogin(){
            return "login.html";
        }

        @RequestMapping("/qusetion")
        public String goQuestion(){
            return "customerQuestion.html";
        }
        
        
    }


