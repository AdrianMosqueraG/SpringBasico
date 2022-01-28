package com.example.BS3.Beans;

import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controller {

    String getHola(String s){
        return s;
    }
}
