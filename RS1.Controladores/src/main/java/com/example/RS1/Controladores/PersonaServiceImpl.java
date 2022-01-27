package com.example.RS1.Controladores;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonaServiceImpl implements PersonaService{

    Map<Integer, Persona> listaPersona = new HashMap<>();

    Integer contador = 1;

    @Override
    public Map<Integer, Persona> getAll() {
        return listaPersona;
    }

    @Override
    public Persona getByIdAndName(String id) {

        Persona p1 = new Persona();

        String numeros = "0123456789";

        Boolean tieneNumeros = false;

        for( int i = 0; i<id.length();i++){
            if(numeros.indexOf(id.charAt(i),0)!=-1){
                tieneNumeros = true;
            }else{
                tieneNumeros = false;
            }
        }

        if (tieneNumeros){
            Integer n = Integer.parseInt(id);
            Persona p=listaPersona.get(n);
            p1 = p;
        }else{
            Collection<Persona> keys = listaPersona.values();

            for (Persona key : keys) {
                if (key.getNombre().equals(id)) {
                    Persona p = key;
                    p1 = p;
                }
            }
        }
        return p1;
    }


    @Override
    public Persona aniadirPersona(Persona persona) {

        listaPersona.put(contador, persona);
        contador ++;
        return persona;

    }

    @Override
    public Persona borrarPersona(Integer id) {
        Persona p = listaPersona.get(id);
        listaPersona.remove(id);
        return p;
    }

    @Override
    public Persona modificarPersona(Integer id, Persona persona) {

        if (persona.getNombre() != null){
            listaPersona.get(id).setNombre(persona.getNombre());
        }
        if (persona.getEdad() != null){
            listaPersona.get(id).setEdad(persona.getEdad());
        }
        if (persona.getPoblacion() != null){
            listaPersona.get(id).setPoblacion(persona.getPoblacion());
        }

        return persona;

    }
}
