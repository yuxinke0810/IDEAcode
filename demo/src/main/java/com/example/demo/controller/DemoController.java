package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @GetMapping(value = "/hello/{string}")
    @ResponseBody
    public String hello(@PathVariable("string") String string) {
        System.out.println(string);
        return "Hello World!!!";
    }

    @ResponseBody
    @GetMapping("/demo")
    public String index(){
        return "Hello Java!!!";
    }

    @ResponseBody
    @RequestMapping("/test/{name}")
    public String test(@PathVariable("name") String name){
        return "Hello " + name;
    }

}
