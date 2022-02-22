package com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller;

import com.example.BS8RespuestasPersonalizadas.persona.application.service.PersonaServiceImpl;
import com.example.BS8RespuestasPersonalizadas.persona.application.service.PersonaServiceMapperImpl;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.output.PersonaOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class PersonaControllerMapper {

    @Autowired
    private PersonaServiceMapperImpl personaServiceMapper;

    @GetMapping("/getId2/{id}")
    public PersonaOutputDto getId(@PathVariable int id) throws Exception {
        return personaServiceMapper.buscarPorId(id);
    }

    @GetMapping("/getUser2/{user}")
    public List<PersonaOutputDto> getUser(@PathVariable String user) {
        return personaServiceMapper.buscarUsuario(user);
    }


}
