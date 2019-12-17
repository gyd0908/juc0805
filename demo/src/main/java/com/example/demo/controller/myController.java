package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {
   @GetMapping("/demo")
   @ResponseBody
    public String test(){
        return  "hrllo,idea";
    }


}
