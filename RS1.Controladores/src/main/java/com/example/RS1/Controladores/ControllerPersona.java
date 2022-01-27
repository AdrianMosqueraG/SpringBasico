package com.example.RS1.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class ControllerPersona {

    @Autowired
    PersonaService personaService;

    @GetMapping("/listaPersonas")
    public Map<Integer, Persona> listaPersonas(){
        return personaService.getAll();
    }

    @PostMapping("/addPersona")
    public Persona aniadirPersona(@RequestBody Persona persona){
        return personaService.aniadirPersona(persona);
    }

    @DeleteMapping("/borrarPersona/{id}")
    public Persona borrarPersona(@PathVariable("id") Integer id){
        return personaService.borrarPersona(id);
    }

    @PutMapping("/modificarPersona/{id}")
    public Persona modificarPersona(@PathVariable("id") Integer id, @RequestBody Persona persona){
        return personaService.modificarPersona(id, persona);
    }

    @GetMapping("/buscarPorId/{id}")
    public Persona buscarPorId(@PathVariable ("id") String id){
        return personaService.getByIdAndName(id);
    }
}
