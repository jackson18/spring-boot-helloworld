package com.qijiabin.test.spring_boot_helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Controller  
@EnableAutoConfiguration  
@RequestMapping("/app")
public class App {  
      
    @RequestMapping("/")  
    @ResponseBody  
    public String hello(){  
        return "Hello world!";  
    }  
      
    public static void main(String[] args) {  
        SpringApplication.run(App.class, args);  
    }  
}  
