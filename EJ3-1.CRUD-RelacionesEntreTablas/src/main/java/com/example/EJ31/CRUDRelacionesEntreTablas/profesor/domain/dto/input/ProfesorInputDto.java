package com.example.EJ31.CRUDRelacionesEntreTablas.profesor.domain.dto.input;

import com.example.EJ31.CRUDRelacionesEntreTablas.persona.domain.entity.Persona;
import com.example.EJ31.CRUDRelacionesEntreTablas.profesor.domain.entity.Profesor;
import com.example.EJ31.CRUDRelacionesEntreTablas.student.domain.entity.Estudiante;
import lombok.Data;

import javax.persistence.*;

@Data
public class ProfesorInputDto {

    Integer id_profesor;
    String coments;
    String branch;
    Persona persona;

    public Profesor profesor(){
        Profesor profesor = new Profesor();
        profesor.setId_profesor(this.getId_profesor());
        profesor.setComents(this.getComents());
        profesor.setBranch(this.getBranch());
        profesor.setPersona(this.getPersona());
        return profesor;
    }
}
