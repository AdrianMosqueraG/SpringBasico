package com.example.BS8RespuestasPersonalizadas.persona.infraestructure.controller.dto.output;

import com.example.BS8RespuestasPersonalizadas.persona.domain.Persona;
import java.util.Objects;


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

    public PersonaOutputDto(Integer id_persona, String usuario, String password, String name, String surname, String company_email, String personal_email, String city, Boolean active, String created_date, String imagen_url, String termination_date) {
        this.id_persona = id_persona;
        this.usuario = usuario;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.company_email = company_email;
        this.personal_email = personal_email;
        this.city = city;
        this.active = active;
        this.created_date = created_date;
        this.imagen_url = imagen_url;
        this.termination_date = termination_date;
    }

    public PersonaOutputDto() {
    }

    public Integer getId_persona() {
        return id_persona;
    }

    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany_email() {
        return company_email;
    }

    public void setCompany_email(String company_email) {
        this.company_email = company_email;
    }

    public String getPersonal_email() {
        return personal_email;
    }

    public void setPersonal_email(String personal_email) {
        this.personal_email = personal_email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCreated_date() {
        return created_date;
    }

    public void setCreated_date(String created_date) {
        this.created_date = created_date;
    }

    public String getImagen_url() {
        return imagen_url;
    }

    public void setImagen_url(String imagen_url) {
        this.imagen_url = imagen_url;
    }

    public String getTermination_date() {
        return termination_date;
    }

    public void setTermination_date(String termination_date) {
        this.termination_date = termination_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaOutputDto that = (PersonaOutputDto) o;
        return Objects.equals(id_persona, that.id_persona) && Objects.equals(usuario, that.usuario) && Objects.equals(password, that.password) && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(company_email, that.company_email) && Objects.equals(personal_email, that.personal_email) && Objects.equals(city, that.city) && Objects.equals(active, that.active) && Objects.equals(created_date, that.created_date) && Objects.equals(imagen_url, that.imagen_url) && Objects.equals(termination_date, that.termination_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_persona, usuario, password, name, surname, company_email, personal_email, city, active, created_date, imagen_url, termination_date);
    }

    @Override
    public String toString() {
        return "PersonaOutputDto{" +
                "id_persona=" + id_persona +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", company_email='" + company_email + '\'' +
                ", personal_email='" + personal_email + '\'' +
                ", city='" + city + '\'' +
                ", active=" + active +
                ", created_date='" + created_date + '\'' +
                ", imagen_url='" + imagen_url + '\'' +
                ", termination_date='" + termination_date + '\'' +
                '}';
    }

    public PersonaOutputDto(Persona p){
        setId_persona(p.getId_persona());
        setUsuario(p.getUsuario());
        setPassword(p.getPassword());
        setName(p.getName());
        setSurname(p.getSurname());
        setCompany_email(p.getCompany_email());
        setPersonal_email(p.getPersonal_email());
        setCity(p.getCity());
        setActive(p.getActive());
        setCreated_date(p.getCreated_date());
        setImagen_url(p.getImagen_url());
        setTermination_date(p.getTermination_date());
    }

}
