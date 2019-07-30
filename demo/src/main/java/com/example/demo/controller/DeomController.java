package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Iterator;

@Controller
public class DeomController {



    @GetMapping("/hello")
    @ResponseBody
    public String hello() {

        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("11111");

        System.out.println("22222");
        
        return "Hello World!!!";

    }

}
