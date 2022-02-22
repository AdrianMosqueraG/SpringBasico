package com.example.BS8RespuestasPersonalizadas.persona.application.mappers;

import com.example.BS8RespuestasPersonalizadas.persona.domain.Persona;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.input.PersonaInputDto;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.output.PersonaOutputDto;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring")
public interface PersonaDtoMapper {

    /*@Mappings({
            @Mapping(target = "", source = "")
    })*/
    Persona personaOutputDtoToPersona(PersonaOutputDto personaOutputDto);

    /*@Mappings({
            @Mapping(target = "", source = "")
    })*/
    PersonaOutputDto personaToPersonaOutput(Persona persona);

    //@Mapping solo es necesario ponerlo en el caso de que los nombre de algunos campos no coincidan
    //si son iguales por defecto ya los asocia, pero en caso de que se llamen de diferente forma
    //es necesario usar @Mapping
    /*@Mappings({
            @Mapping(target = "_[nombre_campo_objeto_que_devuelve (en este caso persona)]_", source = "_[nombre_campo_objeto_que_introcudes (en este caso personaInputDto)]_")
    })*/
    Persona personaInputDtoToPersona(PersonaInputDto personaInputDto);

    /*@Mappings({
            @Mapping(target = "", source = "")
    })*/
    PersonaInputDto personaToPersonaInputDto(Persona persona);

}
