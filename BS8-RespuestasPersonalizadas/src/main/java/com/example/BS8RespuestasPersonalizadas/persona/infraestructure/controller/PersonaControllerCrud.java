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
public class PersonaControllerCrud {

    @Autowired
    private PersonaServiceImpl personaServiceImpl;

    @GetMapping("/getAll")
    public List<PersonaOutputDto> getAll(){
        return personaServiceImpl.getAll();
    }

    @PostMapping("/add")
    public PersonaOutputDto addPerson(@RequestBody PersonaInputDto personaInputDto) throws Exception {
        return personaServiceImpl.addPersona(personaInputDto);
    }

    @DeleteMapping("/delete/{id}")
    public PersonaOutputDto deleteId(@PathVariable int id) throws Exception {
        return personaServiceImpl.deletePersona(id);
    }

    @PutMapping("/mod/{id}")
    public PersonaOutputDto updateId(@PathVariable int id, @RequestBody PersonaInputDto personaInputDto){
        return personaServiceImpl.modifyPersona(id, personaInputDto);
    }

}
