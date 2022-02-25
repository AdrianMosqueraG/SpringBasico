package com.example.EJ31.CRUDRelacionesEntreTablas.student.application.service.interfaz;

import com.example.EJ31.CRUDRelacionesEntreTablas.student.domain.dto.input.EstudianteInputDto;
import com.example.EJ31.CRUDRelacionesEntreTablas.student.domain.dto.output.EstudianteOutputDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudianteCrudService {
    List<EstudianteOutputDto> getAll();
    EstudianteOutputDto addEstudiante(EstudianteInputDto estudianteInputDto) throws Exception;
    EstudianteOutputDto deleteEstudiante(int id) throws Exception;
    EstudianteOutputDto modifyEstudiante(int id, EstudianteInputDto estudianteInputDto);
}
