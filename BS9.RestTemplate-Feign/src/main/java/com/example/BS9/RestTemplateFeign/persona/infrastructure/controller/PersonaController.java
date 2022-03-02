package com.example.BS9.RestTemplateFeign.persona.infrastructure.controller;

import com.example.BS9.RestTemplateFeign.persona.application.feign.IFeignServer;
import com.example.BS9.RestTemplateFeign.persona.application.service.interfaz.PersonaService;
import com.example.BS9.RestTemplateFeign.persona.domain.dto.output.PersonaOutputDto;
import com.example.BS9.RestTemplateFeign.profesor.domain.dto.output.ProfesorOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    /**/
    @Autowired
    IFeignServer iFeignServer;

    @Autowired
    private RestTemplate clienteRest;
    /**/

    /*
    @GetMapping("/profesor/{id}")
    public ProfesorOutputDto getProfesorId(@PathVariable int id){
        return clienteRest.getForObject("http://localhost:8080/profesor/getId/"+id, ProfesorOutputDto.class);
    }

     */


    @GetMapping("/profesor/{id}")
    public ResponseEntity<ProfesorOutputDto> getProfesorFeign(@PathVariable int id) throws Exception {
        ResponseEntity<ProfesorOutputDto> respuesta = iFeignServer.callServer(id);
        return respuesta;
    }


    @GetMapping("/getId/{id}")
    public PersonaOutputDto getId(@PathVariable int id) throws Exception{
        return personaService.buscarPorId(id);
    }

    @GetMapping("/getUser/{user}")
    public List<PersonaOutputDto> getUser(@PathVariable String user){
        return personaService.buscarPorUsuario(user);
    }
}
