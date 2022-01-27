package com.example.BS2.E1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.beans.Beans;

@RestController
public class Controlador1 {

    @Autowired
    PersonaService personaService;

    @Autowired
    CiudadService ciudadService;



    @GetMapping("/controlador1/addPersona")
    public Persona addPersona(@RequestHeader(value = "name") String name, @RequestHeader(value = "edad") Integer edad, @RequestHeader(value = "ciudad") String ciudad){

        return personaService.getPersona(name, edad, ciudad);

    }

    @PostMapping("/controlador1/addCiudad")
    public Ciudad addCiudad(@RequestHeader(value = "nombre") String nombre, @RequestHeader(value = "nHabitantes") Integer nHabitantes){

        return ciudadService.addCiudad(nombre, nHabitantes);

    }

    @GetMapping("/controlador1/bean/{bean}")
    public String getBean(@PathVariable String bean){
        switch (bean){
            case "persona1":
                return "bean1";
            case "persona2":
                return "bean2";
            case "persona3":
                return "bean3";
        }
        return null;
    }

}
