package com.example.BS8RespuestasPersonalizadas.persona.application.service;

import com.example.BS8RespuestasPersonalizadas.persona.application.mappers.PersonaDtoMapper;
import com.example.BS8RespuestasPersonalizadas.persona.domain.Persona;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.input.PersonaInputDto;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.output.PersonaOutputDto;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonaServiceCrudMapperImpl {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private PersonaDtoMapper personaDtoMapper;

    private PersonaOutputDto converToDto(Persona persona){
        return personaDtoMapper.personaToPersonaOutput(persona);
    }

    //Mostar todos
    public List<PersonaOutputDto> getAll(){

        return personaRepository.findAll()
                .stream()
                .map(this::converToDto)
                .collect(Collectors.toList());
    }

    //Añadir personas
    public PersonaOutputDto addPersona(PersonaInputDto personaInputDto) throws Exception {
        Persona persona = personaDtoMapper.personaInputDtoToPersona(personaInputDto);
        PersonaOutputDto personaOutputDto = personaDtoMapper.personaToPersonaOutput(persona);
        if (persona.getUsuario().length() > 5){
            personaRepository.save(persona);
            return personaOutputDto;
        }else {
            throw new Exception("Datos invalidos para aniadir a esta persona");
        }
    }

    //Borrar personas
    public PersonaOutputDto deletePersona(int id) throws Exception {
        PersonaOutputDto personaOutputDto = personaDtoMapper.personaToPersonaOutput(personaRepository.findById(id));
        if (personaRepository.findById(id) != null){
            personaRepository.deleteById(id);
            return personaOutputDto;
        }else {
            throw new Exception("No existe el usuario");
        }
    }

    //Modificar personas
    public PersonaOutputDto modifyPersona(int id, PersonaInputDto personaInputDto){
        Persona persona = personaRepository.findById(id);

        Persona personaInp = personaDtoMapper.personaInputDtoToPersona(personaInputDto);

        if(personaInputDto.getUsuario() != null && personaInputDto.getUsuario().length() >= 5){
            persona.setUsuario(personaInp.getUsuario());
        }
        if(personaInputDto.getPassword() != null){
            persona.setPassword(personaInp.getPassword());
        }
        if(personaInputDto.getName() != null){
            persona.setName(personaInp.getName());
        }
        if(personaInputDto.getSurname() != null){
            persona.setSurname(personaInp.getSurname());
        }
        if(personaInputDto.getCompany_email() != null){
            persona.setCompany_email(personaInp.getCompany_email());
        }
        if(personaInputDto.getPersonal_email() != null){
            persona.setPersonal_email(personaInp.getPersonal_email());
        }
        if(personaInputDto.getCity() != null){
            persona.setCity(personaInp.getCity());
        }
        if(personaInputDto.getActive() != null){
            persona.setActive(personaInp.getActive());
        }
        if(personaInputDto.getCreated_date() != null){
            persona.setCreated_date(personaInp.getCreated_date());
        }
        if(personaInputDto.getImagen_url() != null){
            persona.setImagen_url(personaInp.getImagen_url());
        }
        if(personaInputDto.getTermination_date() != null){
            persona.setTermination_date(personaInp.getTermination_date());
        }

        PersonaOutputDto personaOutputDto = personaDtoMapper.personaToPersonaOutput(persona);

        personaRepository.save(persona);

        return personaOutputDto;

    }

    //Modificar personas2
    public PersonaOutputDto modifyPersona2(int id, PersonaInputDto personaInputDto){

        Persona persona;

        Persona personaInp = personaDtoMapper.personaInputDtoToPersona(personaInputDto);

        if(personaInputDto.getUsuario() != null && personaInputDto.getUsuario().length() > 4){
            persona = personaInp;

            PersonaOutputDto personaOutputDto = personaDtoMapper.personaToPersonaOutput(persona);

            personaRepository.save(persona);

            return personaOutputDto;
        }

        return null;

    }

}
