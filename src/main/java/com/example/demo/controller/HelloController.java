package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;
@RestController
public class HelloController {
    @Value("${person.last-name}")
    private String name;
    @ResponseBody
    @RequestMapping({"hello"})
    public String helloword(){
        return "helloworld";
    }


    @RequestMapping({"/sayHello"})
    public String sayHello(){
        return "Hello"+name;
    }

}
