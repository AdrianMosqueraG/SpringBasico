package com.example.BS2.E1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

//@Service
public class PersonaServiceImpl implements PersonaService{

    Persona persona = new Persona();

    @Override
    public Persona getPersona(String nombre, Integer edad, String ciudad) {

        persona.setName(nombre);
        persona.setEdad(edad);
        persona.setCiudad(ciudad);

        return persona;
    }

    @Override
    public Persona edadPersonapor2(String nombre, Integer edad, String ciudad) {
        persona.setName(nombre);
        persona.setEdad(edad*2);
        persona.setCiudad(ciudad);

        return persona;
    }


}
