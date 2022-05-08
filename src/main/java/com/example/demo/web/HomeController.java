package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author dtm
 * 12:38 PM 8/5/2022
 */

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
