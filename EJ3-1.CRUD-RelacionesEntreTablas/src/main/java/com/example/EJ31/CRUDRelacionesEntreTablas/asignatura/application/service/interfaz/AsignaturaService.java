package com.example.EJ31.CRUDRelacionesEntreTablas.asignatura.application.service.interfaz;

import com.example.EJ31.CRUDRelacionesEntreTablas.asignatura.domain.dto.output.AsignaturaOutputDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsignaturaService {
    AsignaturaOutputDto buscarPorId(int id) throws Exception;
    List<AsignaturaOutputDto> buscarPorNombre(String nombre);
}
