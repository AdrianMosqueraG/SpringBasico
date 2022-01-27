package com.example.BS2.E1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controlador2 {

    @Autowired
    PersonaService personaService;

    @Autowired
    CiudadService ciudadService;

    @GetMapping("/controlador2/addPersona")
    public Persona addPersona(@RequestHeader(value = "name") String name, @RequestHeader(value = "edad") Integer edad, @RequestHeader(value = "ciudad") String ciudad){

        return personaService.edadPersonapor2(name, edad, ciudad);

    }

    @GetMapping("/controlador2/getCiudad")
    public List<Ciudad> getCiudades(){
        return ciudadService.getCiudad();
    }

}
