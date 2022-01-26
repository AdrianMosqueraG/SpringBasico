package com.example.demo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Persona {

    private String name;
    private Integer edad;
    private String ciudad;
}
