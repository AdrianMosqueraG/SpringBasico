package com.example.EJ31.CRUDRelacionesEntreTablas.persona.application.service.impl;

import com.example.EJ31.CRUDRelacionesEntreTablas.persona.application.service.interfaz.PersonaService;
import com.example.EJ31.CRUDRelacionesEntreTablas.persona.domain.dto.output.PersonaOutputDto;
import com.example.EJ31.CRUDRelacionesEntreTablas.persona.domain.entity.Persona;
import com.example.EJ31.CRUDRelacionesEntreTablas.persona.infrastructure.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    private PersonaOutputDto converToDto(Persona persona){
        return new PersonaOutputDto(persona);
    }

    @Override
    public PersonaOutputDto buscarPorId(int id) throws Exception {
        PersonaOutputDto personaOutputDto = new PersonaOutputDto(personaRepository.findById(id));

        if (personaOutputDto != null){
            return  personaOutputDto;
        }else {
            throw new Exception("No existe ningun usuario con ese ID");
        }
    }

    @Override
    public List<PersonaOutputDto> buscarPorUsuario(String usuario) {
        return personaRepository.findByUsuario(usuario)
                .stream()
                .map(this::converToDto)
                .collect(Collectors.toList());
    }
}
