package com.example.EJ31.CRUDRelacionesEntreTablas.student.domain.dto.output;

import com.example.EJ31.CRUDRelacionesEntreTablas.asignatura.domain.entity.Asignatura;
import com.example.EJ31.CRUDRelacionesEntreTablas.persona.domain.entity.Persona;
import com.example.EJ31.CRUDRelacionesEntreTablas.profesor.domain.entity.Profesor;
import com.example.EJ31.CRUDRelacionesEntreTablas.student.domain.entity.Estudiante;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class EstudianteOutputDto {

    Integer id_student;
    String name;
    Integer num_hours_week;
    String coments;
    String branch;
    Persona persona;
    Profesor profesor;
    List<Asignatura> asignaturas;

    public EstudianteOutputDto(Estudiante e){
        setId_student(e.getId_student());
        setName(e.getName());
        setNum_hours_week(e.getNum_hours_week());
        setComents(e.getComents());
        setBranch(e.getBranch());
        setPersona(e.getPersona());
        setProfesor(e.getProfesor());
        setAsignaturas(e.getAsignaturas());
    }

}
