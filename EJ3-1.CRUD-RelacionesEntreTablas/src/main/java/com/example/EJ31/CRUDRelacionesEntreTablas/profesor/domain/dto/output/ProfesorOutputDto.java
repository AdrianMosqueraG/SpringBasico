package com.example.EJ31.CRUDRelacionesEntreTablas.profesor.domain.dto.output;

import com.example.EJ31.CRUDRelacionesEntreTablas.persona.domain.entity.Persona;
import com.example.EJ31.CRUDRelacionesEntreTablas.profesor.domain.entity.Profesor;
import lombok.Data;

@Data
public class ProfesorOutputDto {

    Integer id_profesor;
    String coments;
    String branch;
    Persona persona;

    public ProfesorOutputDto(Profesor p){
        setId_profesor(p.getId_profesor());
        setComents(p.getComents());
        setBranch(p.getBranch());
        setPersona(p.getPersona());
    }
}
