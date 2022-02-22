package com.example.BS8RespuestasPersonalizadas.persona.infraestructure.repository;

import com.example.BS8RespuestasPersonalizadas.persona.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

    public Persona findById(int id_persona);

    @Query("select p from Persona p where p.usuario = ?1")
    public List<Persona> findByUsuario(String user);

}
