package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service  //quitamos de aqui el service porque hemos creado un been que hace lo mismo y si dejamos los 2 da error porque no sabe cual coger
public class PersonaServiceImpl  implements PersonaService{

    Persona persona = new Persona();

    @Override
    public String getNombre() {
        return persona.getName();
    }

    public void setNombre(String nombre) {
        persona.setName(nombre);
        System.out.println(persona);
    }
}
