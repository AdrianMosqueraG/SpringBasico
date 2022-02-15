package com.example.JpaHibernateVideo;

import com.example.JpaHibernateVideo.Modelo.Autor;
import com.example.JpaHibernateVideo.Modelo.Direccion;
import com.example.JpaHibernateVideo.Modelo.Empleado;
import com.example.JpaHibernateVideo.Modelo.Libro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class JpaHibernateVideoApplication {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");

	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateVideoApplication.class, args);

		/*ejemplo anterior
		EntityManager manager = emf.createEntityManager();
		Empleado e = new Empleado(10L, "Perez", "Pepito", LocalDate.of(1979, 6, 6));
		e.setDireccion(new Direccion(15L, "Calle falsa, 123", "Narnia", "Armario", "España"));
		manager.getTransaction().begin();
		manager.persist(e);
		manager.getTransaction().commit();
		manager.close();

		imprimirTodo();

		 */

		crearDatos();
		imprimirDatos();
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

	static void crearDatos(){
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		/*
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
		 */

		Libro l1 = new Libro();
		l1.setId(1L);
		l1.setTitulo("JPA e Hibernate");
		em.persist(l1);

		Autor a1 = new Autor(1L, "Adrian", "Española");
		a1.addLibro(l1);
		System.out.println("Libros escritos (pre-save): " + a1.getLibros().size());
		em.persist(a1);

		em.getTransaction().commit();

		em.close();
	}

	static void imprimirDatos(){
		EntityManager em = emf.createEntityManager();

		Autor autor = em.find(Autor.class, 1L);
		List<Libro> libros = autor.getLibros();

		System.out.println("Libros escritos (post-save): " + libros.size());
		for (Libro libro: libros){
			System.out.println("* " + libro.toString());
		}
		em.close();
	}

}
