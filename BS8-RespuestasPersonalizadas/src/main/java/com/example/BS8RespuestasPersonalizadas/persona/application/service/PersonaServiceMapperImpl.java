package com.example.BS8RespuestasPersonalizadas.persona.application.service;

import com.example.BS8RespuestasPersonalizadas.persona.application.mappers.PersonaDtoMapper;
import com.example.BS8RespuestasPersonalizadas.persona.domain.Persona;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.output.PersonaOutputDto;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaServiceMapperImpl {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired(required = false)
    private PersonaDtoMapper personaDtoMapper;

    public PersonaOutputDto buscarPorId (int id){
        return personaDtoMapper.personaToPersonaOutput(personaRepository.findById(id));
    }

    public List<PersonaOutputDto> buscarUsuario(String usuario){
        return personaRepository.findByUsuario(usuario)
                .stream()
                .map(i -> personaDtoMapper.personaToPersonaOutput(new Persona()))
                .collect(Collectors.toList());
    }

}
