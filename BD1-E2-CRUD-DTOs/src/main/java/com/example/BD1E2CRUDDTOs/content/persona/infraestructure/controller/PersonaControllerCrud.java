package com.example.BD1E2CRUDDTOs.content.persona.infraestructure.controller;

import com.example.BD1E2CRUDDTOs.content.persona.application.PersonaServiceImpl;
import com.example.BD1E2CRUDDTOs.content.persona.domain.Persona;
import com.example.BD1E2CRUDDTOs.content.persona.infraestructure.controller.dto.input.PersonaInputDto;
import com.example.BD1E2CRUDDTOs.content.persona.infraestructure.controller.dto.output.PersonaOutputDto;
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
    public PersonaOutputDto addPerson(@RequestBody Persona persona) throws Exception {
        return personaServiceImpl.addPersona(persona);
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
