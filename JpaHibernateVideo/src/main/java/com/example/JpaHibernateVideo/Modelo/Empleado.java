package com.example.JpaHibernateVideo.Modelo;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "EMPLEADO")
public class Empleado implements Serializable {

    //private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codigo")
    private  Long codigo;

    @Column(name = "apellidos")
    private  String apellidos;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha")
    private LocalDate fechaNacimiento;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "direccion_id")
    private Direccion direccion;

    public Empleado(Long codigo, String apellidos, String nombre, LocalDate fechaNacimiento){
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Empleado empleado = (Empleado) o;
        return codigo != null && Objects.equals(codigo, empleado.codigo);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "codigo=" + codigo +
                ", apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion=" + direccion +
                '}';
    }
}
