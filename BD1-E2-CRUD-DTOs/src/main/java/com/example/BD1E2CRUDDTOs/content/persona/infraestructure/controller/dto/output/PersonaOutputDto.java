package com.example.BD1E2CRUDDTOs.content.persona.infraestructure.controller.dto.output;

import lombok.Data;

@Data
public class PersonaOutputDto {

    Integer id_persona;
    String usuario;
    String password;
    String name;
    String surname;
    String company_email;
    String personal_email;
    String city;
    Boolean active;
    String created_date;
    String imagen_url;
    String termination_date;

}
