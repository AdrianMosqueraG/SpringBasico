package com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller;

import com.example.BS8RespuestasPersonalizadas.persona.application.service.PersonaServiceCrudMapperImpl;
import com.example.BS8RespuestasPersonalizadas.persona.application.service.PersonaServiceImpl;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.input.PersonaInputDto;
import com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.output.PersonaOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PersonaControllerCrudMapper {

    @Autowired
    private PersonaServiceCrudMapperImpl personaServiceCrudMapper;

    @GetMapping("/getAll2")
    public List<PersonaOutputDto> getAll(){return personaServiceCrudMapper.getAll();}

    @PostMapping("/add2")
    public PersonaOutputDto addPerson(@RequestBody PersonaInputDto personaInputDto) throws Exception {
        return personaServiceCrudMapper.addPersona(personaInputDto);
    }

    @DeleteMapping("/delete2/{id}")
    public PersonaOutputDto deleteId(@PathVariable int id) throws Exception {
        return personaServiceCrudMapper.deletePersona(id);
    }

    @PutMapping("/mod2/{id}")
    public PersonaOutputDto updateId(@PathVariable int id, @RequestBody PersonaInputDto personaInputDto){
        return personaServiceCrudMapper.modifyPersona(id, personaInputDto);
    }

}
