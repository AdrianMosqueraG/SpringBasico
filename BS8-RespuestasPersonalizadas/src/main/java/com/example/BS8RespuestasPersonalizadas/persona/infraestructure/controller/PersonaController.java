package com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller;

import com.example.BS8RespuestasPersonalizadas.persona.application.service.PersonaServiceImpl;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.output.PersonaOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PersonaController {

    @Autowired
    private PersonaServiceImpl personaServiceImpl;

    @GetMapping("/getId/{id}")
    public PersonaOutputDto getId(@PathVariable int id) throws Exception {
        return personaServiceImpl.buscarPorId(id);
    }

    @GetMapping("/getUser/{user}")
    public List<PersonaOutputDto> getUser(@PathVariable String user) {
        return personaServiceImpl.buscarUsuario(user);
    }

}
