package com.example.RS1.Controladores;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    private String nombre;
    private Integer edad;
    private String poblacion;

}
