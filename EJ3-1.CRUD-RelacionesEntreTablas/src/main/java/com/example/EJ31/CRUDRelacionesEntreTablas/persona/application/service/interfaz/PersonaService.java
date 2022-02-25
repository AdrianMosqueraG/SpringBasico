package com.example.EJ31.CRUDRelacionesEntreTablas.persona.application.service.interfaz;

import com.example.EJ31.CRUDRelacionesEntreTablas.persona.domain.dto.output.PersonaOutputDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaService {
    PersonaOutputDto buscarPorId(int id) throws Exception;
    List<PersonaOutputDto> buscarPorUsuario(String usuario);
}
