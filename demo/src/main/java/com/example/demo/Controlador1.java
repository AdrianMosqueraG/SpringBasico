package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
public class Controlador1 {

    @Autowired
    PersonaService personaService;

    //hace lo mismo que el autowired
    public Controlador1(PersonaService personaService){
        System.out.println("hola desde el controlador 1");
        this.personaService=personaService;
    }

    @GetMapping("/a")
    public String getHola(){
        return "hola Mundo A";
    }

    @GetMapping("/b")
    public String getHola2(){
        return "hola Mundo B";
    }

    @GetMapping("/b/{a}")
    public String getHola3(@PathVariable String a){
        return "hola Mundo B" + " " + a;
    }

    @GetMapping("/nombre/{nombre}")
    public String dimetunombre(@PathVariable String nombre, @RequestParam(required = false, defaultValue = "21") String edad){
        personaService.setNombre(nombre);
        return "Hola: " + nombre + " con edad: " + edad;
    }

    @PostMapping("usuario")
    public Persona edadmasuno(@RequestBody Persona n){

        n.setEdad(n.getEdad()+1);
        return n;
    }


}
