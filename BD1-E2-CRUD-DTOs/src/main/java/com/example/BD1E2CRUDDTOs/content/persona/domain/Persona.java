package com.example.BD1E2CRUDDTOs.content.persona.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persona")
public class Persona implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    Integer id_persona;

    @NonNull
    @Column(name = "usuario")
    String usuario;

    @NonNull
    @Column(name = "password")
    String password;

    @NonNull
    @Column(name = "name")
    String name;

    @NonNull
    @Column(name = "surname")
    String surname;

    @NonNull
    @Column(name = "company_email")
    String company_email;

    @NonNull
    @Column(name = "personal_email")
    String personal_email;

    @NonNull
    @Column(name = "city")
    String city;

    @NonNull
    @Column(name = "active")
    Boolean active;

    @NonNull
    @Column(name = "created_date")
    String created_date;

    @NonNull
    @Column(name = "imagen_url")
    String imagen_url;

    @NonNull
    @Column(name = "termination_date")
    String termination_date;

}
