package com.example.RS1.Controladores;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface PersonaService {

    //metodos

    Map<Integer, Persona> getAll();

    Persona getByIdAndName(String id);

    Persona aniadirPersona(Persona persona);

    Persona borrarPersona(Integer id);

    Persona modificarPersona(Integer id, Persona persona);

}
