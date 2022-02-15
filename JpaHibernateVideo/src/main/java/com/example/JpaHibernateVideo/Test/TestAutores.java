package com.example.JpaHibernateVideo.Test;

import com.example.JpaHibernateVideo.Modelo.Autor;
import com.example.JpaHibernateVideo.Modelo.Libro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class TestAutores {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

    public static void main(String[] args) {
        crearDatos();
        imprimirDatos();
    }

    static void crearDatos(){
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Autor autor1 = new Autor(1L, "Pablo Perez", "Española");
        Autor autor2 = new Autor(2L, "Elena Gomez", "Mexicana");
        Autor autor3 = new Autor(3L, "Miguel Lopez", "Chilena");
        em.persist(autor1);
        em.persist(autor2);
        em.persist(autor3);

        em.persist(new Libro(1L, "libro escrito 1", autor2));
        em.persist(new Libro(2L, "libro escrito 2", autor3));
        em.persist(new Libro(3L, "libro escrito 3", autor1));
        em.persist(new Libro(4L, "libro escrito 4", autor2));
        em.persist(new Libro(5L, "libro escrito 5", autor2));

        em.getTransaction().commit();

        em.close();
    }

    static void imprimirDatos(){
        EntityManager em = emf.createEntityManager();

        Autor autor = em.find(Autor.class, 2L);
        List<Libro> libros = autor.getLibros();
        libros.size();
        em.close();

        for (Libro libro: libros){
            System.out.println("* " + libro.toString());
        }
    }

}
