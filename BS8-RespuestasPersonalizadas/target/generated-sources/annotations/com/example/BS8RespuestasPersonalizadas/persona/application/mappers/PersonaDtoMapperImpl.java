package com.example.BS8RespuestasPersonalizadas.persona.application.mappers;

import com.example.BS8RespuestasPersonalizadas.persona.domain.Persona;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.input.PersonaInputDto;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.output.PersonaOutputDto;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-02-22T16:50:05+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class PersonaDtoMapperImpl implements PersonaDtoMapper {

    @Override
    public Persona personaOutputDtoToPersona(PersonaOutputDto personaOutputDto) {
        if ( personaOutputDto == null ) {
            return null;
        }

        Persona persona = new Persona();

        persona.setId_persona( personaOutputDto.getId_persona() );
        persona.setUsuario( personaOutputDto.getUsuario() );
        persona.setPassword( personaOutputDto.getPassword() );
        persona.setName( personaOutputDto.getName() );
        persona.setSurname( personaOutputDto.getSurname() );
        persona.setCompany_email( personaOutputDto.getCompany_email() );
        persona.setPersonal_email( personaOutputDto.getPersonal_email() );
        persona.setCity( personaOutputDto.getCity() );
        persona.setActive( personaOutputDto.getActive() );
        persona.setCreated_date( personaOutputDto.getCreated_date() );
        persona.setImagen_url( personaOutputDto.getImagen_url() );
        persona.setTermination_date( personaOutputDto.getTermination_date() );

        return persona;
    }

    @Override
    public PersonaOutputDto personaToPersonaOutput(Persona persona) {
        if ( persona == null ) {
            return null;
        }

        PersonaOutputDto personaOutputDto = new PersonaOutputDto();

        personaOutputDto.setId_persona( persona.getId_persona() );
        personaOutputDto.setUsuario( persona.getUsuario() );
        personaOutputDto.setPassword( persona.getPassword() );
        personaOutputDto.setName( persona.getName() );
        personaOutputDto.setSurname( persona.getSurname() );
        personaOutputDto.setCompany_email( persona.getCompany_email() );
        personaOutputDto.setPersonal_email( persona.getPersonal_email() );
        personaOutputDto.setCity( persona.getCity() );
        personaOutputDto.setActive( persona.getActive() );
        personaOutputDto.setCreated_date( persona.getCreated_date() );
        personaOutputDto.setImagen_url( persona.getImagen_url() );
        personaOutputDto.setTermination_date( persona.getTermination_date() );

        return personaOutputDto;
    }

    @Override
    public Persona personaInputDtoToPersona(PersonaInputDto personaInputDto) {
        if ( personaInputDto == null ) {
            return null;
        }

        Persona persona = new Persona();

        persona.setId_persona( personaInputDto.getId_persona() );
        persona.setUsuario( personaInputDto.getUsuario() );
        persona.setPassword( personaInputDto.getPassword() );
        persona.setName( personaInputDto.getName() );
        persona.setSurname( personaInputDto.getSurname() );
        persona.setCompany_email( personaInputDto.getCompany_email() );
        persona.setPersonal_email( personaInputDto.getPersonal_email() );
        persona.setCity( personaInputDto.getCity() );
        persona.setActive( personaInputDto.getActive() );
        persona.setCreated_date( personaInputDto.getCreated_date() );
        persona.setImagen_url( personaInputDto.getImagen_url() );
        persona.setTermination_date( personaInputDto.getTermination_date() );

        return persona;
    }

    @Override
    public PersonaInputDto personaToPersonaInputDto(Persona persona) {
        if ( persona == null ) {
            return null;
        }

        PersonaInputDto personaInputDto = new PersonaInputDto();

        personaInputDto.setId_persona( persona.getId_persona() );
        personaInputDto.setUsuario( persona.getUsuario() );
        personaInputDto.setPassword( persona.getPassword() );
        personaInputDto.setName( persona.getName() );
        personaInputDto.setSurname( persona.getSurname() );
        personaInputDto.setCompany_email( persona.getCompany_email() );
        personaInputDto.setPersonal_email( persona.getPersonal_email() );
        personaInputDto.setCity( persona.getCity() );
        personaInputDto.setActive( persona.getActive() );
        personaInputDto.setCreated_date( persona.getCreated_date() );
        personaInputDto.setImagen_url( persona.getImagen_url() );
        personaInputDto.setTermination_date( persona.getTermination_date() );

        return personaInputDto;
    }
}
