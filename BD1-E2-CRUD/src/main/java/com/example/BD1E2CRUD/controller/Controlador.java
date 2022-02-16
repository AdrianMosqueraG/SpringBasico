package com.example.BD1E2CRUD.controller;

import com.example.BD1E2CRUD.modelo.Persona;
import com.example.BD1E2CRUD.servicio.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping
public class Controlador {
    @Autowired
    Servicio servicio;

    @GetMapping("/buscarId/{id_persona}")
    public Persona buscaId(@PathVariable int id_persona){

        return servicio.buscarId(id_persona);

    }

    @GetMapping("/buscarNombre/{usuario}")
    public List<Persona> buscaNombre2(@PathVariable String usuario){
        return servicio.buscarUsuario(usuario);
    }


    @GetMapping("/mostrarTodo")
    public List<Persona> mostrarTodo(){
        return servicio.mostrarTodo();
    }

    @PostMapping("/addPersona")
    public Persona addPersona(@RequestBody Persona p) {
        return servicio.addPersona(p);
    }

    @DeleteMapping("/deletePersona/{id_persona}")
    public void deletePersona(@PathVariable int id_persona){
        servicio.delete(id_persona);
    }

    @PutMapping("/updatePersona/{id_persona}")
    public Persona updatePersona(@PathVariable int id_persona, @RequestBody Persona p) {
        return servicio.updatePersona(id_persona, p);
    }

}
