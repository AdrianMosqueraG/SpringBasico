package com.example.BD1E2CRUD.servicio;

import com.example.BD1E2CRUD.exception.NotFoundException;
import com.example.BD1E2CRUD.exception.UnprocessableEntityException;
import com.example.BD1E2CRUD.modelo.Persona;
import com.example.BD1E2CRUD.repository.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Servicio {
    @Autowired
    PersonaRepositorio personaRepo;

    public Persona buscarId (int id){

        Persona p = personaRepo.findById(id);

        if (p != null){
            return p;
        }else {
            throw new NotFoundException("No existe el usuario");
        }

    }

    public List<Persona> buscarUsuario(String usuario){

        return personaRepo.findByUsuario(usuario);

    }

    public Persona addPersona(Persona persona){
        if(persona.getUsuario().length()>=6 && persona.getUsuario().length()<=10){
            return personaRepo.save(persona);
        }
        else {
            return new Persona();
        }
    }

    public List<Persona> mostrarTodo(){

        return personaRepo.findAll();

    }

    public void delete(int id){

        if(personaRepo.findById(id)!=null){
            personaRepo.deleteById(id);
            System.out.println("Usuario borrado");
        }else {
            System.out.println("Usuario no encontrado, no borrado");
        }

    }

    public Persona updatePersona(int id, Persona p){
        if(p.getId_persona() != null){
            personaRepo.findById(id).setId_persona(p.getId_persona());
        }
        if(p.getUsuario() != null){
            personaRepo.findById(id).setUsuario(p.getUsuario());
        }
        if(p.getPassword() != null){
            personaRepo.findById(id).setPassword(p.getPassword());
        }
        if(p.getName() != null){
            personaRepo.findById(id).setName(p.getName());
        }
        if(p.getSurname() != null){
            personaRepo.findById(id).setSurname(p.getSurname());
        }
        if(p.getCompany_email() != null){
            personaRepo.findById(id).setCompany_email(p.getCompany_email());
        }
        if(p.getPersonal_email() != null){
            personaRepo.findById(id).setPersonal_email(p.getPersonal_email());
        }
        if(p.getCity() != null){
            personaRepo.findById(id).setCity(p.getCity());
        }
        if(p.getActive() != null){
            personaRepo.findById(id).setActive(p.getActive());
        }
        if(p.getCreated_date() != null){
            personaRepo.findById(id).setCreated_date(p.getCreated_date());
        }
        if(p.getImagen_url() != null){
            personaRepo.findById(id).setImagen_url(p.getImagen_url());
        }
        if(p.getTermination_date() != null){
            personaRepo.findById(id).setTermination_date(p.getTermination_date());
        }

        return personaRepo.save(personaRepo.findById(id));
    }
}
