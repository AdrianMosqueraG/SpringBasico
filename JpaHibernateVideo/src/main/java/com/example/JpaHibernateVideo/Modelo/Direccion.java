package com.example.JpaHibernateVideo.Modelo;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "DIRECCION")
public class Direccion {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "localidad")
    private String localidad;

    @Column(name = "provincia")
    private String provincia;

    @Column(name = "pais")
    private String pais;

    @OneToOne(mappedBy = "direccion", fetch = FetchType.LAZY)
    @ToString.Exclude
    private Empleado empleado;

    public Direccion(Long id, String direccion, String localidad, String provincia, String pais) {
        this.id = id;
        this.direccion = direccion;
        this.localidad = localidad;
        this.provincia = provincia;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", localidad='" + localidad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", pais='" + pais + '\'' +
                ", empleado='" + empleado.getCodigo() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Direccion direccion = (Direccion) o;
        return id != null && Objects.equals(id, direccion.id);
    }

}
