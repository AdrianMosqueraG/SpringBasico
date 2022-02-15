package com.example.JpaHibernateVideo.Test;

import com.example.JpaHibernateVideo.Modelo.Direccion;
import com.example.JpaHibernateVideo.Modelo.Empleado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.List;

public class TestEmpleados {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

    public static void main(String[] args) {

        EntityManager manager = emf.createEntityManager();
        Empleado e = new Empleado(10L, "Perez", "Pepito", LocalDate.of(1979, 6, 6));
        e.setDireccion(new Direccion(15L, "Calle falsa, 123", "Narnia", "Armario", "España"));
        manager.getTransaction().begin();
        manager.persist(e);
        manager.getTransaction().commit();
        manager.close();

        imprimirTodo();

    }

    private static void insertInicial() {
        EntityManager manager = emf.createEntityManager();
        Empleado e = new Empleado(10L, "Perez", "Pepito", LocalDate.of(1979, 6, 6));
        /*
        Empleado e2 = new Empleado(11L, "Mosquera", "Adrian", new GregorianCalendar(2000, 6, 6).getTime());
        Empleado e3 = new Empleado(12L, "Garcia", "Marcos", new GregorianCalendar(1997, 6, 6).getTime());
         */
        manager.getTransaction().begin();
        manager.persist(e);
        /*
        manager.persist(e2);
        manager.persist(e3);
         */
        manager.getTransaction().commit();
    }

    private static void imprimirTodo(){
        EntityManager manager = emf.createEntityManager();
        List<Empleado> emps = manager.createQuery("FROM Empleado").getResultList();
        System.out.println("Hay " + emps.size() + " empleados en el sistema.");
        for (Empleado emp : emps){
            System.out.println(emp.toString());
        }
    }

}
