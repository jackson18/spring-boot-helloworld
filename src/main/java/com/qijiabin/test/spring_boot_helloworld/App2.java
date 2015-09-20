package com.qijiabin.test.spring_boot_helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@Configuration  
@ComponentScan 
@RequestMapping("/app2")
public class App2 {  
      
    @RequestMapping("/")  
    @ResponseBody  
    public String hello(){  
        return "Hello world2!";  
    }  
      
    public static void main(String[] args) {  
        SpringApplication.run(App2.class, args);  
    }  
}  
